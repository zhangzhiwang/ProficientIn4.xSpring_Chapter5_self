package com.asiainfo;

import org.springframework.stereotype.Component;

@Component(value="iService")
public interface IService { 
	Car getCar();
}
