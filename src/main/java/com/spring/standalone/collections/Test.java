package com.spring.standalone.collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/standalone/collections/aloneconfig.xml");
		Person person1= context.getBean("person1",Person.class);
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println(person1.getFeestructure());
		System.out.println(person1.getProperties());
	}
}
