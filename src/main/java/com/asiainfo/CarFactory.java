package com.asiainfo;

/**
 * ������
 *
 * @author Administrator
 * @date 2019��2��4�� ����10:59:41
 */
public class CarFactory { 
	public Car4 getACar4() {
		Car4 car4 = new Car4();
		car4.setBrand("car4_brand non static");
		return car4;
	}
	
	public static Car4 createCar4() {
		Car4 car4 = new Car4();
		car4.setBrand("car4_brand static");
		return car4;
	}
}
