package pe.edu.galaxy.java.ms.gestion.pasajeros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsGestionPasajerosApp {

	public static void main(String[] args) {
		SpringApplication.run(MsGestionPasajerosApp.class, args);
	}

}
