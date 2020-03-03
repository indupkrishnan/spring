package com.bean;
import java.util.List;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;;


public class Testaddr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource r=new ClassPathResource("addrcontext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Employeenew obj=(Employeenew) factory.getBean("id2");
		System.out.println(obj.toString());
		

	}

}
