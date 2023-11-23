package in.ineuron.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActorServiceConsumingRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {

		RestTemplate template = new RestTemplate();
		String producerUrl="http://localhost:8082/30-04-2-ProviderApp/api/actor/wish";
		
		ResponseEntity<String> responseEntity = template.getForEntity(producerUrl, String.class);
		
		System.out.println("Response body :: "+responseEntity.getBody());
		System.out.println("Response Status Code value :: "+responseEntity.getStatusCodeValue());
		System.out.println("Response Status Code :: "+responseEntity.getStatusCode().name());
		System.out.println("*****************************************************************");
		
	}

}
