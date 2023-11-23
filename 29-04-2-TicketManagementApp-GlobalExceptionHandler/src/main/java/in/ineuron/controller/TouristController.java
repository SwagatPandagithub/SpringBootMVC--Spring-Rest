package in.ineuron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Tourist;
import in.ineuron.service.ITouristManagementService;
import lombok.Delegate;

@RestController
@RequestMapping("/api/tourist")
public class TouristController {

	@Autowired
	private ITouristManagementService service;

	@PostMapping("/save")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist) {

		String result = service.registerTourist(tourist);
		return new ResponseEntity<String>(result, HttpStatus.OK);

	}

	@GetMapping("/findAll")
	public ResponseEntity<?> displayTouristdetails() {

		List<Tourist> list = service.getAllTourist();
		return new ResponseEntity<List<Tourist>>(list, HttpStatus.OK);

	}

	@GetMapping("/find/{id}")
	public ResponseEntity<?> displayTouristdetails(@PathVariable("id") Integer id) {
		Tourist tourist = service.fetchTouristById(id);
		return new ResponseEntity<Tourist>(tourist, HttpStatus.OK);

	}

	@PutMapping("/modify")
	public ResponseEntity<String> updateTourist(@RequestBody Tourist tourist) {

		String msg = service.updateTouristDetails(tourist);
		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}

	@PatchMapping("/budgetModify/{id}/{hike}")
	public ResponseEntity<String> modifyTouristBudgetById(@PathVariable("id") Integer id,
			@PathVariable("hike") Float hikeAmt) {

		String msg = service.updateBudgetbyId(id, hikeAmt);
		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> removeTouristById(@PathVariable("id") Integer id) {

		String msg = service.deleteTouristById(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}

}
