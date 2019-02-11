package com.asiainfo;

/**
 * 依赖注入的方式二——构造器注入，模拟循环依赖的问题
 *
 * @author Administrator
 * @date 2019年2月4日 上午9:11:48
 */
public class Car3 {
	public String brand;
	private User2 user2;

	// 循环引用的问题：构造器注入的前提是，被注入进来的参数提前已经“准备好了”，如果被注入进来的参数对象在构造时需要引入本类的对象，那么就形成了类似于死锁的循环引用问题
	public Car3(String brand, User2 user2) {
		super();
		this.brand = brand;
		this.user2 = user2;
	}

	public Car3() {
		super();
		System.out.println("Car3 构造完成。");
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setUser2(User2 user2) {
		this.user2 = user2;
	}

	@Override
	public String toString() {
		return "Car3 [brand=" + brand + ", user2=" + user2 + "]";
	}

}
