package com.learnspring.springbeans;

public class SetterInjectionBean {

		int salary;
		String name;
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	public void hello() {
		System.out.println("my name is::"+name +"my salary is::"+salary);
	}
	}


