package com.growmeing.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GrowMeingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrowMeingApplication.class, args);
	}

}
