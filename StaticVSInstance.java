package com.java_programs;

public class StaticVSInstance {
	// static variable
	static int count;
	
	// instance variable
	int cnt;
	
	// Instance black
	{
		count+=1;
		cnt+=1;
	}
	public static void main(String[] args) {
		StaticVSInstance a=new StaticVSInstance();
		StaticVSInstance b=new StaticVSInstance();
		StaticVSInstance c=new StaticVSInstance();
		
//		This is the reason why we are getting 1, when we are using instance variable count.
//		Every object gets its own separate copy of instance variables.

		System.out.println("The count of objects using static variable count is: "+count); // correct count

		System.out.println("The count of objects using instance variable cnt is: "+a.cnt); // wrong count
		
		
		

	}

}
