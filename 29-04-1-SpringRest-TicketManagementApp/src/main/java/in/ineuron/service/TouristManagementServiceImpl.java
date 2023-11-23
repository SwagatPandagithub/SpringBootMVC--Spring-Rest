package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import in.ineuron.customException.TouristNotFoundException;
import in.ineuron.dao.ITouristRepo;
import in.ineuron.model.Tourist;

@Service
public class TouristManagementServiceImpl implements ITouristManagementService {

	@Autowired
	private ITouristRepo repo;

	@Override
	public String registerTourist(Tourist tourist) {
		Integer id = repo.save(tourist).getId();

		return "Tourist Registration Successful having id :: " + id;
	}

	@Override
	public List<Tourist> getAllTourist() {
		List<Tourist> list = (List<Tourist>) repo.findAll();
		list.sort((t1, t2) -> t1.getId().compareTo(t2.getId()));
		return list;
	}

	@Override
	public Tourist fetchTouristById(Integer id) {
		/*
		 * Optional<Tourist> optional = repo.findById(id); if (optional.isPresent()) {
		 * return optional.get(); }else { throw new
		 * TouristNotFoundException(id+" id Tourist record not found"); }
		 */
		return repo.findById(id).orElseThrow(() -> new TouristNotFoundException(id + " id Tourist record not found"));
	}

	@Override
	public String updateTouristDetails(Tourist tourist) {
		Optional<Tourist> optional = repo.findById(tourist.getId());
		if (optional.isPresent()) {
			repo.save(tourist);
			return "Tourist id ::" + tourist.getId() + " Updated Successfully";
		} else {
			throw new TouristNotFoundException("Tourist with id ::" + tourist.getId() + "  not found");
		}

	}

	@Override
	public String updateBudgetbyId(Integer id, Float hikeAmount) {

		Optional<Tourist> optional = repo.findById(id);
		if (optional.isPresent()) {
			Tourist tourist = optional.get();
			tourist.setBudget(tourist.getBudget() + (tourist.getBudget() * (hikeAmount / 100)));
			repo.save(tourist);
			return "The tourist details is updated" + tourist.getId();
		} else {
			throw new TouristNotFoundException("Tourist not found with id :: " + id);
		}
	}

	@Override
	public String deleteTouristById(Integer id) {
		Optional<Tourist> optional = repo.findById(id);
		if (optional.isPresent()) {
			repo.delete(optional.get());
			return "Tourist with id :: "+id+" is deleted from the record ";
		}else
			throw new TouristNotFoundException("Tourist not found with record :: "+id);
	}

}
