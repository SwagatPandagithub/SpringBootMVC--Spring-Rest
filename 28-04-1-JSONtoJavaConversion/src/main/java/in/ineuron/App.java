package in.ineuron;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ineuron.model.Employee;

public class App {

	public static void main(String[] args) {

		try {
			// Create a mapper object
			ObjectMapper mapper = new ObjectMapper();

			// using the object read the data from the json file and convert into pojo object.
			Employee employee = mapper.readValue(new File("data/complexJson.json"), Employee.class);

			System.out.println(employee);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
