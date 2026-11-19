package com.java_programs;

public class Task_19_11_26 {
	//method-1	
	//creating object in class level is one way
	static Task_19_11_26 obj=new Task_19_11_26();
	//Instance Field
	String name;
	int rollNo; 
	int batch; 
	long mobile; 
	String collegeName;
	

	//Static method
	static void setFields(String name,int rollNo,int batch,long mobile,String collegeName,Task_19_11_26 obj) {
		//Assigning values 
		obj.name=name;
		obj.rollNo=rollNo;
		obj.batch=batch;
		obj.mobile=mobile;
		obj.collegeName=collegeName;
		
	}
	
	//Instance method
	void getFields() {
		System.out.println("Name: "+name);
		System.out.println("Roll No.: "+rollNo);
		System.out.println("Batch: "+batch);
		System.out.println("Mobile Number: "+mobile);
		System.out.println("College Name is: "+collegeName);
	}

	public static void main(String[] args) {
//		// calling static and instance methods using class level object
//		setFields("Thaseen", 12220, 81, 7032101400L, "QIS College");
//		obj.getFields();
		
		//method-2 : we create the object in main method and we pass that object reference to the static method to set fields to a specific object
		Task_19_11_26 obj2=new Task_19_11_26();
		setFields("Thaseen", 12220, 81, 7032101400L, "QIS College",obj2);
		obj2.getFields();
		
		
		
		
	}

}
