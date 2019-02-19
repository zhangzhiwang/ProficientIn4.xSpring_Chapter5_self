package com.asiainfo;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class User8 implements MethodReplacer {
	private Car car;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() { 
		return "User8 [car=" + car + "]";
	}

	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		Car car = new Car();
		car.setBrand("Audi");
		return car;
	}

}
