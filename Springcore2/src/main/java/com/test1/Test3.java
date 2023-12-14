package com.test1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test3 
{
	public static void main(String[] args) {
		Resource rs=new ClassPathResource("application.xml");
		BeanFactory bn=new XmlBeanFactory(rs);
		Customer e=(Customer)bn.getBean("cus");
		e.disp();

	}
}


