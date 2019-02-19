package com.asiainfo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("user11")
public class User11 {
	private Car8 car8;

	public User11() {
		System.out.println("创建User1对象");
	}

	@Autowired
	public void setCar8(Car8 car8) {
		this.car8 = car8;
		System.out.println("注入Car8对象：" + car8);
	}

	@PostConstruct
	public void met1() {
		System.out.println("init1...");
	}

	@PostConstruct
	public void met1_1() {
		System.out.println("init1_1...");
	}

	@PreDestroy
	public void met2() {
		System.out.println("destroy2...");
	}

	@PreDestroy
	public void met2_2() {
		System.out.println("destroy2_2...");
	}

	@Override
	public String toString() {
		return "User11 [car8=" + car8 + "]";
	}

}