package in.ineuron.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping
	public String showReport() {
		
		return "home";
	}
	
	@GetMapping(value = {"/report","/report1"})
	//@RequestMapping(value = "/report",method = RequestMethod.POST)
	public String showReport1(Map<String, Object> map) {
		System.out.println("MyController.showReport1()");
		return "display1";
	}
	
	
	
}
