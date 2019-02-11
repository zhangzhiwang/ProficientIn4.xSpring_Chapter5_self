package com.asiainfo;

/**
 * 依赖注入的方式二——构造器注入
 *
 * @author Administrator
 * @date 2019年2月4日 上午9:11:48
 */
public class Car2 {
	private int maxSpeed;
	public String brand;
	private double price;
	private User user;

	// 依赖注入的方式二：构造器注入。注入的条件是必须要有一个带参的构造器。
	// 说明：这里声明了一个带参的构造器而没有声明不带参的构造器，所以本类没有默认构造器。为了演示构造器注入，所以这里屏蔽了默认构造器，但在实际工作中，还是要声明一个不带参的构造器的。
	public Car2(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
		System.out.println("this is 1.");
	}

	// 对于有构造器重载的情况，如果在配置文件里面仅使用<constructor-arg type="">或者仅使用<constructor-arg index="">，会引起歧义，而spring会针对歧义的情况随机选择一个构造器而并不报错，但被选出的这个构造器可能不是程序员想要的。所以，最佳实践是type属性和index属性结合使用。
	public Car2(double price, String brand) {
		super();
		this.brand = brand;
		this.price = price;
		System.out.println("this is 2.");
	}

	public Car2(int maxSpeed, String brand) {
		super();
		this.maxSpeed = maxSpeed;
		this.brand = brand;
		System.out.println("this is 3.");
	}
	
	//在某个构造器中如果有明显区于与其它构造器的入参（如下面的User），则在配置的时候也可以省略<constructor-arg>标签的type和index属性，spring可以精确地匹配到该构造器，但是为了可读性最佳实践是写上type和index属性
	public Car2(int maxSpeed, User user) {
		super();
		this.maxSpeed = maxSpeed;
		this.user = user;
		System.out.println("this is 4.");
	}

	public String toString() {
		return "brand:" + brand + "/maxSpeed:" + maxSpeed + "/price:" + price;
	}

}
