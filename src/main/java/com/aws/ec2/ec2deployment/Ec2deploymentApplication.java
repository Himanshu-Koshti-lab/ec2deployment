package com.aws.ec2.ec2deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ec2deploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ec2deploymentApplication.class, args);
	}

	@GetMapping("/HiEc2")
	public String getMessageString() {
		return "Hello User I'm Spring application from EC2 instance.";		
	}

}
