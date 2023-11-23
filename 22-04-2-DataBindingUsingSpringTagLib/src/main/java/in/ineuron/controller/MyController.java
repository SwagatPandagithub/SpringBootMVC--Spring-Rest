package in.ineuron.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ineuron.model.Employee;

@Controller
public class MyController {
	
	
	@GetMapping(value = "/register")
	public String showForm(@ModelAttribute("emp") Employee employee) {
		System.out.println(employee);
		return "home";
	}
	
	@PostMapping(value = "/register")
	public String showResult(Map<String, Object> model, @ModelAttribute("emp") Employee employee) {
		model.put("employee", employee);
		return "result";
	}
	
	
}
