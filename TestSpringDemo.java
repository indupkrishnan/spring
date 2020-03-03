package com.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;;

public class TestSpringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
 //...Book book=(Book) context.getBean("b");
 //...System.out.println(book.getId());
//... System.out.println(book.getBname());
		//Book book=(Book) context.getBean("b");
		//System.out.println(book);
				
				/*Resource r=new ClassPathResource("ApplicationContext.xml");
				BeanFactory factory=new XmlBeanFactory(r);
				Customer obj=(Customer)factory.getBean("cust2");
				System.out.println(obj);*/
		
		Employee e=(Employee)context.getBean("emp");
		System.out.println(e.getId());
		System.out.println(e.getName());
	}

}
