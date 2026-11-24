package com.java_programs;
/* 1. Create a class for Bank Account with fields :
* Account Number 
* Holder Name
* Mobile Number 
* IFSC Code 
* Balance
And  set details of two users in one method with auto increment of Account Number 
and print the details on another method. */


public class Task_23_11_26 {
    // 1. Static Shared across all
    static int nextAccountNo = 100;
  
    // 2. Instance variable -> each user have separate copy
    int account_no;
    String name;
    long mobile_no;
    String ifsc_code;
    float balance;

    void setDetails(String name, long mobile_no, String ifsc_code, float balance) {
    	// Only generate an account number the FIRST time setDetails is called for this object
        if (this.account_no == 0) {
            nextAccountNo++;
            this.account_no = nextAccountNo;
        }
        this.name = name;
        this.mobile_no = mobile_no;
        this.ifsc_code = ifsc_code;
        this.balance = balance;
    }

    void getDetails() {
        System.out.println("Details of Account Holder..!!");
        System.out.println("Account number is: " + this.account_no);
        System.out.println("Name of Holder: " + this.name);
        System.out.println("Mobile Number: " + this.mobile_no);
        System.out.println("IFSC CODE: " + this.ifsc_code);
        System.out.println("Balance: " + this.balance);
        System.out.println();
    }

    public static void main(String[] args) {
        Task_23_11_26 person1 = new Task_23_11_26();
        Task_23_11_26 person2 = new Task_23_11_26();

        person1.setDetails("Thaseen", 7032101400L, "SBIN0000800", 100000);
        person1.setDetails("Thaseen", 7032101400L, "SBI456789", 100000);
        person2.setDetails("Thanjeela", 9242101400L, "SBIN0000801", 200000);

        person1.getDetails();
        person2.getDetails();
    }
}
