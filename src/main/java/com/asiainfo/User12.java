package com.asiainfo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import com.asiainfo.service.ServiceImpl;

@Configuration
@Import(value=CarConfig.class)
public class User12 {
//	@Autowired
//	private CarConfig carConfig;
	
	@Bean
	@Autowired
	public ServiceImpl si(Car8 car188, Car7 car777) {
		ServiceImpl serviceImpl = new ServiceImpl();
		serviceImpl.setCar8(car188);
		serviceImpl.setCar7(car777);
////		System.out.println(serviceImpl);
//		
//		System.out.println("1:"+ carConfig.car8());
//		System.out.println("2:"+ carConfig.car8());
//		System.out.println("3:"+ carConfig.car8());
		
		return serviceImpl;
	}

}