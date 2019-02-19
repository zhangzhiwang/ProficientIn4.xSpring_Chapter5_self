package com.asiainfo;

/**
 * ����ע��ķ�ʽ������������ע�룬ģ��ѭ������������
 *
 * @author Administrator
 * @date 2019��2��4�� ����9:11:48
 */
public class Car3 { 
	public String brand;
	private User2 user2;

	// ѭ�����õ����⣺������ע���ǰ���ǣ���ע������Ĳ�����ǰ�Ѿ���׼�����ˡ������ע������Ĳ�������ڹ���ʱ��Ҫ���뱾��Ķ�����ô���γ��������������ѭ����������
	public Car3(String brand, User2 user2) {
		super();
		this.brand = brand;
		this.user2 = user2;
	}

	public Car3() {
		super();
		System.out.println("Car3 ������ɡ�");
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
