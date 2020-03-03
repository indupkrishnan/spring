package com.bean;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;;


public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=
				new ClassPathXmlApplicationContext("bean.xml");
		Library l=(Library) context.getBean("lib");
		Company e=(Company) context.getBean("company1");
		Set<EmployeeDetails> sd=e.getEmployees();
		
		List<String> list=l.getBooks();
		for(String s:list){
		System.out.println(s);
		}
		System.out.println(l.getBooks());
		System.out.println(l.getId());
		System.out.println(l.getName());
		System.out.println(l);
		
	
	
	for(EmployeeDetails el:sd){
	
		
		System.out.println(el.getName());
		System.out.println(el.getAge());
		System.out.println(el.getId());
	}
		}
}