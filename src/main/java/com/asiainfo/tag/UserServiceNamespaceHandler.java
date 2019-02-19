package com.asiainfo.tag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class UserServiceNamespaceHandler extends NamespaceHandlerSupport{

	public void init() {
		registerBeanDefinitionParser("zhangzw8", new UserServiceDefinitionParser());
	}

}
