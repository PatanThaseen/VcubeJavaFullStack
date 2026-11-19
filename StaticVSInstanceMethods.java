package com.java_programs;

public class StaticVSInstanceMethods {
	void instanceM1() {
		System.out.println("Instance1 called");
	}
	void instanceM2() {
		System.out.println("Instance2 called");
	}
	
	static void staticM1() {
		System.out.println("static1 called");
		
	}
	
	static void staticM2() {
		System.out.println("static2 called");
		}
	
	static {
		StaticVSInstanceMethods obj2=new StaticVSInstanceMethods();
		obj2.instanceM1();
		obj2.instanceM2();
		staticM1();
		staticM2();
	}
	public static void main(String[] args) {
//		//calling  instance and static methods called from main method
//		StaticVSInstanceMethods obj1=new StaticVSInstanceMethods();
//		obj1.instanceM1();
//		obj1.instanceM2();
//		staticM1();
//		staticM2();
		
		staticM1();
		
	}

}
