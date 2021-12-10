package pe.edu.galaxy.java.ms.registryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsAdminRegistryServerApp {

	public static void main(String[] args) {
		SpringApplication.run(MsAdminRegistryServerApp.class, args);
	}

}
