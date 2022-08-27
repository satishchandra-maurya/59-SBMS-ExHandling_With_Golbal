package in.satish.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.satish.model.ExceptionData;

@RestControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<ExceptionData> handleAE(ArithmeticException ae){
		ExceptionData ResponseMsg  = new ExceptionData();
		ResponseMsg.setErrorMsg(ae.getMessage());
		ResponseMsg.setCode(800565);
		return new ResponseEntity<ExceptionData> (ResponseMsg, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
