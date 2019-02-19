package com.asiainfo.tag;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanComponentDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

import com.asiainfo.service.ServiceImpl;

/**
 * 自定义标签
 *
 * @author zhangzhiwang
 * @date 2019年2月17日 下午7:43:55
 */
public class UserServiceDefinitionParser implements BeanDefinitionParser {

	public BeanDefinition parse(Element element, ParserContext parserContext) {
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(ServiceImpl.class);
		String car = element.getAttribute("car");
		beanDefinitionBuilder.addPropertyReference("car8", car);
		AbstractBeanDefinition abstractBeanDefinition = beanDefinitionBuilder.getBeanDefinition();
		parserContext.registerBeanComponent(new BeanComponentDefinition(abstractBeanDefinition, "userService123"));
		
		return null;
	}

}
