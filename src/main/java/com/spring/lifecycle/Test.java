package com.spring.lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/config.xml");
		//registering shutdown hook
		context.registerShutdownHook();
//		samosa s1= (samosa)context.getBean("s1");
//		System.out.println(s1); 
//		
//		System.out.println("+++++++++++++++");
//		
//		pepsi p1= (pepsi)context.getBean("p1");
//		System.out.println(p1);
		
		chai tea= (chai)context.getBean("tea");
		System.out.println(tea);
	}

}
