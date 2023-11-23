package in.ineuron.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping
	public String showReport() {
		
		return "home";
	}
	
	@PostMapping(value = "/report")
	//@RequestMapping(value = "/report",method = RequestMethod.POST)
	public String showReport1(Map<String, Object> map) {
		System.out.println("MyController.showReport1()");
		return "display1";
	}
	
	
	@GetMapping(value = "/report")
	//@RequestMapping(value = "/report",method = RequestMethod.GET)
	public String showReport2(Map<String, Object> map) {
		System.out.println("MyController.showReport2()");		
		return "display2";
	}
}
