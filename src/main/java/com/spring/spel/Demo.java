package com.spring.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{36}")
	private int x;
	
	@Value("#{56}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int z;
	
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	
	@Value("#{new java.lang.String('nitya')}")
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + "]";
	}
	
	

}
