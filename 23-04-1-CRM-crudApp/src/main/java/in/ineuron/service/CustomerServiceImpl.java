package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.ICustomerDao;
import in.ineuron.model.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private ICustomerDao repo;

	@Override
	public List<Customer> getAllCustomers() {
		
		return (List<Customer>) repo.findAll();
	}

	@Override
	public void saveCustomer(Customer customer) {
		repo.save(customer);
	}

	@Override
	public Customer getCustomer(Integer customerid) {
		Optional<Customer> optional=repo.findById(customerid);
		
		return optional.get();
	}

	@Override
	public void deleteCustomer(Integer customerid) {
			repo.deleteById(customerid);
	}

	

}
