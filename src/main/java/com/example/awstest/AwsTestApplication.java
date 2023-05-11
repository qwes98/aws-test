package com.example.awstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class AwsTestApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(AwsTestApplication.class);
		application.addListeners(new ApplicationPidFileWriter());
		application.run(args);
	}

}
