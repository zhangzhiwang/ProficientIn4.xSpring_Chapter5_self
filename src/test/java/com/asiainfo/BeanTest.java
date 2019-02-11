package com.asiainfo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean���õĵ�Ԫ����
 *
 * @author Administrator
 * @date 2019��2��1�� ����8:49:33
 */
public class BeanTest {
	@Test
	public void testCar() {
		ApplicationContext applicationContext_p = new ClassPathXmlApplicationContext("classpath:applicationContext_zzw.xml");
//		Car car = (Car) applicationContext.getBean("car1;car2");
//		System.out.println(car);
		
//		User user = (User) applicationContext.getBean("**user2");
//		System.out.println(user);
		
//		Object car = applicationContext.r1");
//		System.out.println(car);
		
//		Object car = applicationContext.getBean("com.asiainfo.Car#0");
//		System.out.println(car);
		
//		ApplicationContext applicationContext_s = new ClassPathXmlApplicationContext(new String[]{"classpath:applicationContext_zzw_2.xml"}, applicationContext_p);
		
		Object obj = applicationContext_p.getBean("user7");
//		Object obj2 = applicationContext_p.getBean("user7");
//		Object obj3 = applicationContext_p.getBean("user7");
//		System.out.println(obj);
//		System.out.println(obj2);
		User7 s = (User7) obj;
		System.out.println(s.getANewCar());
	}
}
