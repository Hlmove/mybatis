package com.hlmove.mybatis04;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Hlmove
 */
@SpringBootApplication
@MapperScan("com.hlmove.mybatis04.mapper")
public class Mybatis04SpringbootExtendApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mybatis04SpringbootExtendApplication.class, args);
	}

}
