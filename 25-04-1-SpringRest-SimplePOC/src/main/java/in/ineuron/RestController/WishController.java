package in.ineuron.RestController;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/wish")
public class WishController {
	
	@GetMapping("/msg")
	public ResponseEntity<String> generateWish(){
		LocalDateTime ldt= LocalDateTime.now();
		
		int hour=ldt.getHour();
		
		String body =null;
		
		if (hour<12) 
			body="good morning";
		else if(hour<16)
			body="good afternoon";
		else if(hour<20)
			body="good evening";
		else
			body="good night";
		
		ResponseEntity<String> entity = new ResponseEntity<>(body, HttpStatus.OK);
		
		
		return entity;
	}

}
