package com.java_programs;

public class Task3 {
	
	void instanceM1() {
		System.out.println("Instance1 called");
		instanceM2();
	}
	void instanceM2() {
		System.out.println("Instance2 called");
	}
	
	static void staticM1() {
		System.out.println("static1 called");
		staticM2();
	}
	
	static void staticM2() {
		System.out.println("static2 called");	
		Task3 o=new Task3();
		o.instanceM1();
		}
	
	public static void main(String[] args) {
		staticM1();
	}

}
