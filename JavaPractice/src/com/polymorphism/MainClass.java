package com.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		// polymorphism is 1 to many forms
		// 2types:
		// Static(overloading-with in class can we done),
		// dynamic (overriding-can be done parent to child),
		// method name same but params(type ,order, number of) are diff and

		// method name same but type of params are diff
		//Realtime ex for overloading: 
		//Realtime ex overriding: Google maps or Webdriver 
		
		
		Interface1  interface1 = new Demo();
		interface1.test();
		interface1.test1();
		
	
		Demo demo = new Demo();
		demo.test();
		demo.test1();
		demo.classMethod();
		

		

	}

}
