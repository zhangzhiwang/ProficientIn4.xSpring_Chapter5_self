package com.asiainfo;

public class User3 {
	private String name;
	private Car5 car5;

	public void setName(String name) {
		this.name = name;
	}

	public void setCar5(Car5 car5) {
		this.car5 = car5;
	}

	public User3() {
		super();
	}

	public User3(Car5 car5) {
		super();
		this.car5 = car5;
	}

	@Override
	public String toString() {
		return "User3 [name=" + name + ", car5=" + car5 + "]";
	}
}
