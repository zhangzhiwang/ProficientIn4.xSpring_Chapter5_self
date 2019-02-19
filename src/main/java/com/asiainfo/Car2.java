package com.asiainfo;

/**
 * ����ע��ķ�ʽ������������ע��
 *
 * @author Administrator
 * @date 2019��2��4�� ����9:11:48
 */
public class Car2 { 
	private int maxSpeed;
	public String brand;
	private double price;
	private User user;

	// ����ע��ķ�ʽ����������ע�롣ע��������Ǳ���Ҫ��һ����εĹ�������
	// ˵��������������һ����εĹ�������û����������εĹ����������Ա���û��Ĭ�Ϲ�������Ϊ����ʾ������ע�룬��������������Ĭ�Ϲ�����������ʵ�ʹ����У�����Ҫ����һ������εĹ������ġ�
	public Car2(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
		System.out.println("this is 1.");
	}

	// �����й��������ص����������������ļ������ʹ��<constructor-arg type="">���߽�ʹ��<constructor-arg index="">�����������壬��spring����������������ѡ��һ�������������?����ѡ����������������ܲ��ǳ���Ա��Ҫ�ġ����ԣ����ʵ����type���Ժ�index���Խ��ʹ�á�
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
	
	//��ĳ�������������������������������������Σ��������User�����������õ�ʱ��Ҳ����ʡ��<constructor-arg>��ǩ��type��index���ԣ�spring���Ծ�ȷ��ƥ�䵽�ù�����������Ϊ�˿ɶ������ʵ����д��type��index����
	public Car2(int maxSpeed, User user) {
		super();
		this.maxSpeed = maxSpeed;
		this.user = user;
		System.out.println("this is 4.");
	}
	
	public Car2() {
		super();
		System.out.println("init Car2.");
	}

	public String toString() {
		return "brand:" + brand + "/maxSpeed:" + maxSpeed + "/price:" + price;
	}

}
