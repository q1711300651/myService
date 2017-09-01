package com.ww;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RefreshScope
@RestController
public class ServiceConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConfigClientApplication.class, args);
	}
	@Value("${foo}")
	String foo;
	@Value("${spring.application.name}")
	String name;
	@RequestMapping(value = "/")
	public String hi(){
		return "采集自github"+foo+"采集自本地application-name"+name;
	}
}
