package com.electric.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.electric.**.dao.repo"})
@ComponentScan(basePackages = {"com.electric"})
@EntityScan(basePackages={"com.electric.**.dto"})
@EnableScheduling
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
