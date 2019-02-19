package com.asiainfo;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// 进行bean的定义，相当于<bean id="car6" class="com.asiainfo.Car6"></bean>
//@Component("car6")
//@Controller("car6")
//@Service("car7")
// @Repository("car6")
public class Car7 {
//	@Resource
//	@Inject
//	@Autowired
	private Car5 car5;
	 
	public Car7() {
		System.out.println("构建Car7实例");
	}



//	@Resource(name="car51")
//	public void setCar5(Car5 car5) {
//		this.car5 = car5;
//	}



	@Override
	public String toString() {
		return "Car7 [car5=" + car5 + "]";
	}

}
