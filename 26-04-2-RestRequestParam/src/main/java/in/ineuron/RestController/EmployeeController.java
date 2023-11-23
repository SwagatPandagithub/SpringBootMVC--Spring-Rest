package in.ineuron.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@GetMapping("/read")
	public ResponseEntity<String> getData(
			@RequestParam(defaultValue = "10",required = false) Integer id, 
			@RequestParam(defaultValue = "sachin", required = false) String name)
	{
		
		String body=null;
		if (id==7 && name.equalsIgnoreCase("dhoni"))
			body="CSK team";
		if(id==18 && name.equalsIgnoreCase("kohli"))
			body="RCB team";
		if(id==10 && name.equalsIgnoreCase("sachin"))
			body="MI team";
		else
			body="other team";
		
		System.out.println("id is "+id+" name is "+name);
		
	
		
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}

}
