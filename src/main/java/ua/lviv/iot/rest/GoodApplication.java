package ua.lviv.iot.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
//@SpringBootApplication
public class GoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodApplication.class, args);
	}

}
