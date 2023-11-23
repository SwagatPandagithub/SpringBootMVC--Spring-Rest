package in.ineuron.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ineuron.model.Customer;
import in.ineuron.service.ICustomerService;

@Controller
public class FirstController {
	
	@Autowired
	private ICustomerService service;
	//to sent the customer list to the view  we have made the map
	
	@GetMapping("/list")
	public String listAllCustomers(Map<String, Object> map) {
		
		System.out.println("implementation class is ::"+service.getClass().getName());
		
		List<Customer> customers=service.getAllCustomers();
		customers.forEach(System.out::println);
		map.put("customers", customers);
		
		return "list-customers";
	}
	
	
	@GetMapping("/showform")
	public String showFormforAdding(Map<String, Object> model) {
		Customer customer = new Customer();
		model.put("customer", customer);
		return "customer-form";
	}
	
	@PostMapping("/save")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		service.saveCustomer(customer);		
		return "redirect:/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam Integer customerid,Map<String, Object> model) {
		Customer customer = service.getCustomer(customerid);
		model.put("customer", customer);
		return "customer-form";
	}
	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam Integer customerid) {
		service.deleteCustomer(customerid);
		return "redirect:/list";
	}

}
