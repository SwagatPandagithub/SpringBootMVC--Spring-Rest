package in.ineuron;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.ineuron.model.Product;

public class App {

	public static void main(String[] args) {

		try {
			// Creatign a mapping object
			ObjectMapper mapper = new ObjectMapper();
			Product product = new Product();
			product = getObjectData(product);
			System.out.println("java format data  " + product);

			// Converting the pojo data object into the JSON object
			String jsonData = mapper.writeValueAsString(product);
			System.out.println("json formatted data  " + jsonData);
			
			
				mapper.writeValue(new File("result.json"), jsonData);
				System.out.println("data stored to json file");
			

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Product getObjectData(Product product) {

		product.setPid(12);
		product.setpName("Old Monk");
		product.setPrice(700);
		product.setTypes(new String[] { "single malt", "aged", "super aged" });

		return product;
	}

}
