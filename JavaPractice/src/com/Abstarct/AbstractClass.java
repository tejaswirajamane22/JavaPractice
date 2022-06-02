package com.Abstarct;

public abstract  class AbstractClass implements InterfaceAbst ,Interface2{
	
	//If we dont want to create a object for any class we can make a class as bastcrt 
	//but how to create object ref is thorugh implmenation class
	
	public void normalMethod() {
		
		System.out.println("normalMethod");
		
	}
	
	abstract void method();
	
	
	public void test() {
		System.out.println("MEthod from Implemeted Interfcae-AbstarctClass");		
	}
	

}
