package in.ineuron.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActorServiceConsumingRunner_PostingJson implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		RestTemplate template = new RestTemplate();
		String producerUrl = "http://localhost:8082/30-04-2-ProviderApp/api/actor/register";

		// send json from the consumer side because in register consumer is consuming the services
		// json is sent in http headers of the request object.

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		
		
		// with the help of http message converter below json(in String format)data will be converted in to
		// the required json depending upon the request body information
		
		
		String json_body = "{\r\n" + "    \"aId\": 21,\r\n" + "    \"name\": \"Jhonney Lever\",\r\n"
				+ "    \"age\": 50,\r\n" + "    \"type\": \"Hollywood-Comedy\"\r\n" + "}";

		HttpEntity<String> entity = new HttpEntity<String>(json_body, headers);

		ResponseEntity<String> responseEntity = template.exchange(
																	producerUrl, 
																	HttpMethod.POST, 
																	entity, 
																	String.class);

		System.out.println("Response body :: " + responseEntity.getBody());
		System.out.println("Response Status Code value :: " + responseEntity.getStatusCodeValue());
		System.out.println("Response Status Code :: " + responseEntity.getStatusCode().name());
		System.out.println("******************************************************************");

	}

}
