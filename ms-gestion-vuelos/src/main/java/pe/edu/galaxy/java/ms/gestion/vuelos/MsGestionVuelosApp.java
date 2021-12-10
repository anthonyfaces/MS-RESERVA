package pe.edu.galaxy.java.ms.gestion.vuelos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsGestionVuelosApp {

	public static void main(String[] args) {
		SpringApplication.run(MsGestionVuelosApp.class, args);
	}

}
