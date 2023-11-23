package in.ineuron.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.ineuron.customException.TouristNotFoundException;
import in.ineuron.error.ErrorDetails;


@RestControllerAdvice
public class TouristErrorConrollerAdvice {
	
	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleTouristNotfound(TouristNotFoundException tf){
		System.out.println("TouristErrorConrollerAdvice.handleTouristNotfound()");
		ErrorDetails details=new ErrorDetails(LocalDateTime.now(),tf.getMessage(),"404-Not Found");
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleAllErrors(Exception e){
		System.out.println("TouristErrorConrollerAdvice.handleAllErrors()");
		ErrorDetails details=new ErrorDetails(LocalDateTime.now(), e.getMessage(), "Execution Failed");
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
