package com.asiainfo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CarConfig {
	public CarConfig() {
		System.out.println("构建CarConfig实例");
	}
	
//	@Bean(name="car88")
//	@Scope(value="prototype")
	public Car8 car8() {
		return new Car8();
	}
	
//	@Bean
	public Car7 car7() {
		return new Car7();
	}
}
