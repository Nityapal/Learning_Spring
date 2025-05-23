package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/stereotype/stereoconfig.xml");
		Student student= context.getBean("student",Student.class);
		System.out.println(student);
		
		Teacher t1= context.getBean("teacher",Teacher.class);
		Teacher t2= context.getBean("teacher",Teacher.class);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}
	
}
