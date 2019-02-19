package com.asiainfo.service;

import org.springframework.stereotype.Service;

import com.asiainfo.Car7;
import com.asiainfo.Car8;

//@Service("serviceImpl")
public class ServiceImpl {
	private Car8 car8;
	private Car7 car7;

	public Car8 getCar8() {
		return car8;
	}

	public void setCar8(Car8 car8) {
		this.car8 = car8;
	}

	public Car7 getCar7() {
		return car7;
	}

	public void setCar7(Car7 car7) {
		this.car7 = car7;
	}

	@Override
	public String toString() {
		return "ServiceImpl [car8=" + car8 + ", car7=" + car7 + "]";
	}

}
