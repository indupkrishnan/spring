package com.bean;
import java.util.List;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;;


public class TestQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource r=new ClassPathResource("qcontext1.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Question q=(Question) factory.getBean("q");
		q.displayInfo();
		

	}

}
