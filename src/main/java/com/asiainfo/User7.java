package com.asiainfo;

public class User7 {
	private Car car;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Car getANewCar() {
		Car car = new Car();
		car.setBrand("BMW");
		return car;
	}
	
	@Override
	public String toString() {
		return "User7 [car=" + car + "]";
	}

}
