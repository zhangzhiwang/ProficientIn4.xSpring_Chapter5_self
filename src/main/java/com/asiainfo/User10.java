package com.asiainfo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User10 {
	// 自动注入，默认是按照类型注入，要求Spring容器里面有且只有一个该类型的bean，用Autowired标注的属性无需setter方法
//	@Autowired(required = false)
//	private Car6 car6;
	// 默认情况下required的值为true，即Spring必须在容器内俄找到一个该类型的bean进行注入，否则抛异常：NoSuchBeanDefinitionException
	// 错误的理解：Autowired默认是按照类型来进行注入的，如果容器中出现了多个该类型的bean，还可以指定bean名称进行注入，如果容器中没有指定名称的bean则抛异常：NoSuchBeanDefinitionException
	// 正确的理解：Qualifier的作用就是将Autowired的按类型注入转换成按名称注入。为什么说上面的理解时错的呢？因为假如容器中只有一个该类型的bean，但是该bean不叫Qualifier指定的名称，则同样会报错。
//	private Car7 car7;
//	@Autowired
//	@Qualifier(value="car555")
	@Resource
	private Car5 car567;
//	private Car4 car4;

	// Autowired不仅可以给类属性进行标注，还可以给方法进行标注。给方法进行标注时实际上是给方法的入参进行注入
//	@Autowired
//	@Qualifier("car55")
//	public void setCar5(Car5 car5) {
//		this.car5 = car5;
//	}

//	@Autowired
//	public void init(@Qualifier("car44")Car4 car4, Car5 car5) {// Car4按名称注入（注入名称为car44的bean），而Car5按类型注入
//		this.car4 = car4;
//		this.car5 = car5;
//	}
	
	@Override
	public String toString() {
		return "User10 [car5=" + car567 + "]";
	}

}