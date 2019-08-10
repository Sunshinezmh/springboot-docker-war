package com.dmsmbj.docker.springbootdockerwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringbootDockerWarApplication extends SpringBootServletInitializer{

	@RequestMapping("/")
	public String home() {
		return "docker app running";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerWarApplication.class, args);
	}

}
