package in.ineuron.runner;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PathVariable_ActorServiceConsumingRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {

		RestTemplate template = new RestTemplate();
		String producerUrl="http://localhost:8082/30-04-2-ProviderApp/api/actor/wish/{id}/{name}";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", 7);
		map.put("name", "Mahendra Singh Dhoni");
		
		ResponseEntity<String> responseEntity = template.getForEntity(producerUrl, String.class,map);
		
		System.out.println("Response body :: "+responseEntity.getBody());
		System.out.println("Response Status Code value :: "+responseEntity.getStatusCodeValue());
		System.out.println("Response Status Code :: "+responseEntity.getStatusCode().name());
		System.out.println("*****************************************************************");
		
	}

}
