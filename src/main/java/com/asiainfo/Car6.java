package com.asiainfo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// 进行bean的定义，相当于<bean id="car6" class="com.asiainfo.Car6"></bean>
//@Controller("car63")
//@Service("car6")
//@Repository("car6")
//@Component("car6")
//@Component(value="car777")
//@Component
@Lazy // 延迟注入，注意必须在bean定义处和属性注入处同时标注Lazy才生效
public class Car6 extends Car7 { 
	@Autowired(required = false) // 对集合类和Map进行自动注入，则Spring会将容器里面所有符合集合或者Map元素类型的bean全部注入进来
	private List<Car5> car5List;
	@Autowired(required=false) // 对于Map而言，key默认为bean的name，value默认是bean
	@Lazy
	private Map<String, Car5> car5Map;

	@Override
	public String toString() {
		return "Car6 [car5List=" + car5List + ", car5Map=" + car5Map + "]";
	}

}
