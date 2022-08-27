package in.satish.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	Logger logger = LoggerFactory.getLogger(DemoRestController.class);
	@GetMapping("/")
	public String getMsg() {
		String msg= "Welcome to Chandra It";
		try {
			int i =10/0;
		}catch(Exception e) {
			logger.error("Error Occured " +e.getMessage(), e);
			throw new ArithmeticException(e.getMessage());
		}
		return msg;
	}
}
