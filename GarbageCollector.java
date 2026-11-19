package com.java_programs;

public class GarbageCollector {
	void hello() {
		System.out.println("Hello Object!!");
		// obj creation inside method leads to out of scope objects
		GarbageCollector obj=new GarbageCollector(); 
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize is called!!");
	}
	public static void main(String[] args) {
		System.out.println("Main methos started!!");
		GarbageCollector obj1=new GarbageCollector();
		GarbageCollector obj2=new GarbageCollector();
		GarbageCollector obj3=new GarbageCollector();
		
		// Displaying the Address of the objects
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
//		5 ways for an object to be eligible for garbage collection
//		1. Nullifying the object
		obj1=null;
		
//		2. Reassigning the object
		obj3=obj2;
		
//		3. Anonymous object
		new GarbageCollector().hello();
		
//		4. out of scope objects (These are objects created inside the methods,after methods gets executed these are also eligible for garbage collection
//		I did this out side main() because methods are created there
		
//		5. Island of Isolation - will be discussed tomorrow
//		manually calling the garbage collector
		System.gc(); // when we call this gc() method finalize() method is called automatically if we have unreferenced objects.
		
		System.out.println("Main methos Ended!!");
		
// ques by jeevan sir
		obj1=obj2;
		obj2=null;
		obj3=null;
		System.gc();
	}

}
