package pe.edu.galaxy.java.ms.gestion.pasajeros.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.json.JsonMapper;

@Configuration
public class BeanConfig {
	
	@Bean
	public JsonMapper getJsonMapper() {
		return new JsonMapper();
	}

}
