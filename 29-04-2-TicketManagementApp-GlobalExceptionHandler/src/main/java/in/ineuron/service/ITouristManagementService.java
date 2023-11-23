package in.ineuron.service;

import java.util.List;

import in.ineuron.model.Tourist;

public interface ITouristManagementService {
		
	public String registerTourist(Tourist tourist);
	public List<Tourist> getAllTourist();
	public Tourist fetchTouristById(Integer id);
	public String updateTouristDetails(Tourist tourist);
	public String updateBudgetbyId(Integer Id, Float hikeAmount);
	public String deleteTouristById(Integer id);
	
}
