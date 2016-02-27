package tn.bergit.crud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages   = {"tn.bergit"})
public class SampleCrudExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleCrudExampleApplication.class, args);
	}
}
