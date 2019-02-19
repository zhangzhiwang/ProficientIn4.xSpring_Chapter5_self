package com.asiainfo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.stereotype.Component;

import com.asiainfo.service.ServiceImpl;

/**
 * 通过编码的方式动态地添加bean
 *
 * @author zhangzhiwang
 * @date 2019年2月17日 下午7:23:59
 */
@Component
public class UserServiceFactoryBean implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory cbf) throws BeansException {
		DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) cbf;
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(ServiceImpl.class);
		beanDefinitionBuilder.addPropertyReference("car8", "car88");
		beanDefinitionBuilder.addPropertyReference("car7", "car777");
		defaultListableBeanFactory.registerBeanDefinition("userService1", beanDefinitionBuilder.getRawBeanDefinition());
		defaultListableBeanFactory.registerSingleton("userService2", new ServiceImpl());
	}

}
