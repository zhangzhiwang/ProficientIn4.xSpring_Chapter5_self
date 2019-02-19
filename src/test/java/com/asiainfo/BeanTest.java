package com.asiainfo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
		ClassPathXmlApplicationContext applicationContext_p = new ClassPathXmlApplicationContext("classpath:applicationContext_zzw.xml");
//		Car car = (Car) applicationContext.getBean("car1;car2");
//		System.out.println(car);
		
//		User user = (User) applicationContext.getBean("**user2");
//		System.out.println(user);
		
//		Object car = applicationContext.r1");
//		System.out.println(car);
		
//		Object car = applicationContext.getBean("com.asiainfo.Car#0");
//		System.out.println(car);
		
//		ApplicationContext applicationContext_s = new ClassPathXmlApplicationContext(new String[]{"classpath:applicationContext_zzw_2.xml"}, applicationContext_p);
		Object obj = applicationContext_p.getBean("iService");
		System.out.println(obj);
		
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(CarConfig.class);
//		Object bean = ctx.getBean("car7");
//		System.out.println("-----------------");
//		System.out.println(bean);
		
//		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext();
//		ctx2.register(CarConfig.class, User12.class);
//		ctx2.register(User12.class);
//		ctx2.refresh();
//		
//		Object bean = ctx2.getBean("car88");
//		Object bean2 = ctx2.getBean("user12");
//		Object bean3 = ctx2.getBean("si");
//		System.out.println("-----------------");
//		System.out.println(bean);
//		System.out.println(bean2);
//		System.out.println(bean3);
	}
}
