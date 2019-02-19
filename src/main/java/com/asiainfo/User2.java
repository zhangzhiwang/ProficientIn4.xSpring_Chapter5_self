package com.asiainfo;

import java.io.Serializable;
import java.util.Date;

public class User2 implements Serializable { 
	private String name;
	private Car3 car3;

	public User2(String name, Car3 car3) {
		super();
		this.name = name;
		this.car3 = car3;
	}

	public User2() {
		super();
		System.out.println("User2 ������ɡ�");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCar3(Car3 car3) {
		this.car3 = car3;
	}

	@Override
	public String toString() {
		return "User2 [name=" + name + ", car3=" + car3 + "]";
	}

}
