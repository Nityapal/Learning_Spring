package com.spring.javconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student= context.getBean("lyra",Student.class);
		System.out.println(student);
		student.study();
	}

}
