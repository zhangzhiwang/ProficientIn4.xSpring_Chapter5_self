package com.asiainfo;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {
	private String carInfo;

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}

	public Car getObject() throws Exception {
		String[] params = carInfo.split(",");
		Car car = new Car();
		car.setaAa(Integer.parseInt(params[0]));
		car.setBrand(params[1]);
		car.setPrice(Double.parseDouble(params[2]));
		return car;
	}

	public Class<Car> getObjectType() {
		return Car.class;
	}

	public boolean isSingleton() {
		return false;
	}

}
