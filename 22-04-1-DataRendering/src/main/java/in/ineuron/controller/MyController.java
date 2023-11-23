package in.ineuron.controller;

import java.util.Map;
import java.util.Set;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.ineuron.model.Employee;

@Controller
public class MyController {

	@GetMapping(value = "/")
	public String home() {
		return "home";
		
	}
	@GetMapping(value = "/display")
	public String display(Map<String, Object> model) {
		
		model.put("name", "Kohli");
		model.put("age", "37");
		model.put("address", "RCB");
		
		String[] countryNames = new String[] {"India","USA","Russia","Australia","NewZealand","china"};
		model.put("countryNames", countryNames);
		
		List<String> subjectList=List.of("java","jee","Servlet","JSP","Spring","Springboot","Microservices");
		model.put("subjectsKey", subjectList);
		
		
		Set<Long> mobileNos = Set.of(999777888L,98765432L,12345678L,65436789L);
		model.put("mobileNumbers", mobileNos);
		
		
		Map<String, Number> idMap = Map.of("aadhar",12345678,"pan",98765432,"VoterId",65436789);
		model.put("idMap", idMap);
		
		
		
		return "display";
		
		
		
	}
	
	@GetMapping(value = "/dispEmployee")
	public String empDto(Map<String, Object> model) {
		
		List<Employee> employees = List.of(new Employee(10, "sachin", "batsman", 12345.0),
				new Employee(07, "Dhoni", "keeper", 45778.0),
				new Employee(18, "Virat", "captain", 98344.0)				
				);
		
		model.put("employeeList", employees);
		
		
		
		Employee emp = new Employee(45, "Rohit", "ViceCap", 12341.0);
		model.put("employee", emp);
		
		return "dispEmployee";
		
	}
	
}
