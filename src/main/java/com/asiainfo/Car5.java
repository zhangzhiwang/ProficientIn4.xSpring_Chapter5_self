package com.asiainfo;

/**
 * 依赖注入的参数
 *
 * @author Administrator
 * @date 2019年2月4日 上午9:11:48
 */
public class Car5 {
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
		return "Car5 [brand=" + brand + ", user2=" + user2 + "]";
	}

}
