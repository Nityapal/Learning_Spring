package com.spring.ci;

public class Addition {
	private int a;
	private int b;
	
	public Addition(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("constructor of int, int");
	}
	
	public Addition(double a, double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("constructor of double, double");
	}
	
	public Addition(String a, String b) {
		this.a= Integer.parseInt(a);
		this.b= Integer.parseInt(b) ;
		System.out.println("constructor of String, String");
	}
	
	public void doSum() {
		System.out.println("sum is= "+ (this.a+this.b));
	}
}
