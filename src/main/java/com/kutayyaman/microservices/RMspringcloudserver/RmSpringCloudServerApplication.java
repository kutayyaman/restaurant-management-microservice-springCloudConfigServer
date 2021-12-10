package com.kutayyaman.microservices.RMspringcloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RmSpringCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RmSpringCloudServerApplication.class, args);
	}

}
