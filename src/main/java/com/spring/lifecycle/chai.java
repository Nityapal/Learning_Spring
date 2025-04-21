package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class chai {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public chai() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "chai [subject=" + subject + "]";
	}
	
	
	@PostConstruct
	public void start() {
		System.out.println("starting method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("ending method");
	}
	
}
