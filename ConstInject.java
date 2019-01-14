package com.learnspring.springbeans;

public class ConstInject {
	
	String dept;
	String address;
	
	public ConstInject(String value1, String value2) {
		this.dept=value1;
		this.address=value2;
	}
	
	public void test() {
		System.out.println("my address is::"+this.address+"my dept is::"+this.dept);
		
	}

	 
		
	} 
 
