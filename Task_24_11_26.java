package com.java_programs;
/*
1.Create a class for Employe with fields :
* Employe Id
* Employe Name
* Mobile Number 
* Department Name 
* Base Salary
* Total salary
* Age
* Active
* Gender
* Bonus
And  set details of 3 Employees in one method with auto increment of Employe Id , 
calculate the total salary in one method and print the details on another method.*/

public class Task_24_11_26 {
	static int nextEmpId=100;
	int empId;
	String eName;
	long mobileNo;
	String deptName;
	double baseSal;
	double totalSal;
	int age;
	boolean active;
	char gender;
	double bonus;
	
	void setDetails(String eName,long mobileNo,String deptName,double baseSal,int age,boolean active,char gender,double bonus) {
		if(this.empId==0) {
			nextEmpId++;
			this.empId=nextEmpId;
		}
		this.eName=eName;
		this.mobileNo=mobileNo;
		this.deptName=deptName;
		this.baseSal=baseSal;
		this.age=age;
		this.active=active;
		this.gender=gender;
		this.bonus=bonus;	
		
		this.totalSal=this.totalSalary();
	}
	
	void getDetails() {
		System.out.println("Details of Employee "+this.empId);
		System.out.println("Employee Name: "+this.eName);
		System.out.println("Employee Mobile Number: "+this.mobileNo);
		System.out.println("Employee Dept Name: "+this.deptName);
		System.out.println("Employee Base Salary: "+this.baseSal);
		System.out.println("Employee Total Salary: "+this.totalSal);
		System.out.println("Employee Age: "+this.age);
		System.out.println("Is Employee Active: "+this.active);
		System.out.println("Employee Gender: "+this.gender);
		System.out.println("Employee Bonus: "+this.bonus);
		System.out.println();
		
	}
	
	double totalSalary() {
		return this.baseSal + this.bonus;
	}

	public static void main(String[] args) {
		Task_24_11_26 emp1=new Task_24_11_26();
		Task_24_11_26 emp2=new Task_24_11_26();
		Task_24_11_26 emp3=new Task_24_11_26();
		emp1.setDetails("Thaseen", 7032101400L, "IT", 150000, 22, true, 'F', 10000);
		emp1.getDetails();
		emp2.setDetails("Thanjeela", 9342101400L, "HR", 200000, 20, true, 'F', 15000);
		emp2.getDetails();
		emp3.setDetails("Afiya", 9932101400L, "IT", 160000, 19, true, 'F', 20000);
		emp3.getDetails();

	}

}
