package in.ineuron.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class EmployeeController2 {
	
	@GetMapping("/read/{id}")//http://localhost:9999/course/read/7
	public ResponseEntity<String> getCourseInfo(@PathVariable Integer id){
		String body =null;
		
		if(id==7)
			body="Dhoni-CSK";
		else if(id==10)
			body="Sachin-MI";
		else
			body="Other team";
		
		ResponseEntity<String> entity= new ResponseEntity<String>(body, HttpStatus.OK);
		
		return entity;
	}

}

