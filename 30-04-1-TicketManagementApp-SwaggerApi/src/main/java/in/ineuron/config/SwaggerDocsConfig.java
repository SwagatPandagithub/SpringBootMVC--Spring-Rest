package in.ineuron.config;


import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerDocsConfig {
	
	
	@Bean
	public Docket createDocket() {
		
	        return new Docket(DocumentationType.SWAGGER_2)//UI screen type
	                .select()//to specify rest controllers
	                .apis(RequestHandlerSelectors.basePackage("in.ineuron.controller"))//base package for rest controllers
	                .paths(PathSelectors.regex("/api/tourist.*"))//to specify the request paths
	                .build()//build the docket object
	                .useDefaultResponseMessages(true).apiInfo(getApiInfo());
	        }
	private ApiInfo getApiInfo() {
		Contact contact=new Contact("Swagat", "http://contact2field.com", "contact3rdField.com");
		return new ApiInfo("title - Tourist Information", "Description- Gives Information about tourist activities",
				"3.4 Release", "http:", contact, "GNU public", "http://some lisence guru", Collections.emptyList());
		
		
	}

}
