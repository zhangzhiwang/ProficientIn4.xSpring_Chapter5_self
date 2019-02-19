package com.asiainfo;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ����ע��ķ�ʽ���������ע��
 *
 * @author Administrator
 * @date 2019��2��4�� ����9:11:48
 */
@Component("car567")
//@Order(value=1000)
public class Car4 extends Car5 {
	public String brand; 
	private User2 user2;

	public String getBrand() {
		return brand;
	}

	public User2 getUser2() {
		return user2;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setUser2(User2 user2) {
		this.user2 = user2;
	}

	@Override
	public String toString() {
		return "Car4 [brand=" + brand + ", user2=" + user2 + "]";
	}

}
