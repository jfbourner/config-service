package com.jackbourner.configservicemaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceMavenApplication.class, args);
	}

}
