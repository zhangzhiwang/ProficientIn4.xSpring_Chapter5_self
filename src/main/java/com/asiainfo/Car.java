package com.asiainfo;

/**
 * ����ע��ķ�ʽһ��������ע��
 *
 * @author Administrator
 * @date 2019��2��4�� ����9:11:48
 */
public class Car { 
	private int maxSpeed;
	public String brand;
	private double price;
	
	public Car() {
		super();
		System.out.println("init Car1.");
	}

	// ����ע��ķ�ʽ֮һ������ע�롣ע��������ǣ����������Ĭ�ϵĹ������������ṩ��Ӧ��setter������ע�ⱻע�����Ե��������Ĭ�ϵĹ������������ʾ�ض�����һ����͵Ĺ��������������ʾ�ض���һ������εĹ�����
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setaAa(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "brand:" + brand + "/maxSpeed:" + maxSpeed + "/price:" + price;
	}

}
