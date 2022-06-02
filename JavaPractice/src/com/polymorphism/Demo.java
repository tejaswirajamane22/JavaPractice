package com.polymorphism;

public class Demo implements Interface1 {

	@Override
	public void test() {
		
		System.out.println("test method");


	}

	@Override
	public void test1() {
				
		System.out.println("test1 method");

	}
	
	public void classMethod() {
		
		System.out.println("classMethod");
		
	}

}
