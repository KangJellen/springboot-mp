package com.jellen.mp.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.jellen.mp.service"})
@MapperScan("com.jellen.mp.dao.mapper")
public class SpringbootMpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMpApplication.class, args);
	}

}
