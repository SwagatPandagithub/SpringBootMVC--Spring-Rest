package in.ineuron.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Actor;

@RestController
@RequestMapping("/api/actor")
public class ActorOperationsController {

	@GetMapping("/wish") // http://localhost:8082/30-04-2-ProviderApp/api/actor/wish
	public ResponseEntity<String> displayWishMessage() {

		LocalDateTime dt = LocalDateTime.now();
		int hour = dt.getHour();
		String wish = null;
		String user = "swagat";
		if (hour < 12)
			wish = user + " good morning";
		else if (hour < 16)
			wish = user + " good Afternoon";
		else if (hour < 20)
			wish = user + " good evening";
		else
			wish = user + " good night";

		return new ResponseEntity<String>(wish, HttpStatus.OK);
	}

	@GetMapping("/wish/{id}/{name}")//http://localhost:8082/30-04-2-ProviderApp/api/actor/wish/10/sachin
	public ResponseEntity<String> displayWish(@PathVariable("id") Integer id,@PathVariable("name") String user) {

		LocalDateTime dt = LocalDateTime.now();
		int hour = dt.getHour();
		String wish = null;
		
		if (hour < 12)
			wish = "hello " + user + " good morning, with id :: " + id;
		else if (hour < 16)
			wish = "hello " + user + " good Afternoon, with id :: " + id;
		else if (hour < 20)
			wish = "hello " + user + " good evening, with id :: " + id;
		else
			wish = "hello " + user + " good night, with id :: " + id;

		return new ResponseEntity<String>(wish, HttpStatus.OK);
	}
	
	@PostMapping("/register")//http://localhost:8082/30-04-2-ProviderApp/api/actor/register
	public ResponseEntity<String> registerActor(@RequestBody Actor actor){
		/*
		{
		    "aId": 1234,
		    "name": "Akshay Kumar",
		    "age": 50,
		    "type": "bollywood-Comedy"
		}
		*/
		
		return new ResponseEntity<String>("Actor data is :: "+actor.toString(), HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Actor> searchId(@PathVariable Integer id){
		
		
		return new ResponseEntity<Actor>(new Actor(1, "swagat", 224.0f, "abcd"), HttpStatus.OK);
	}
}
