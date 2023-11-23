package in.ineuron.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import in.ineuron.model.Company;
import in.ineuron.model.Customer;

@RestController
@JsonIgnoreProperties(ignoreUnknown = true)
@RequestMapping("/api/customer")
public class MyController {

	@GetMapping("/report/{id}")
	public ResponseEntity<Customer> showCustomers(@PathVariable("id") Integer id) {

//the java object from the database is converted to the JSON object automatically.
		// get the data from database
		System.out.println("the id is ::" + id);
		Customer customer = new Customer();
		customer.setCno(45);
		customer.setCname("Rohit");
		customer.setBillAmount(54.4f);
		customer.setTeamNames(new String[] { "MI", "RCB", "CSK", "DC" });
		customer.setStudies(List.of("java", "spring boot", "python"));
		customer.setPhoneNumbers(Set.of("12345", "1234", "12346"));
		customer.setIdDetails(Map.of("swagat", 123, "suraj", 3456));

		customer.setCompany(new Company(1001, "Mumbai Indians", "Maharashtra,Mumbai", "40"));

		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<String> saveCustomers(@RequestBody Customer customer) {
		// The request body will take the data from the browser side in json format and
		// then using the setters it will map to the fields and bring to the java side
		
		System.out.println(customer);
		String body="The customer is registered successfully having id = "+customer.getCno()+"  and name :: "+customer.getCname();
		
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}
}
