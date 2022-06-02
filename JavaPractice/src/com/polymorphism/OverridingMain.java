package com.polymorphism;

public class OverridingMain {

	public static void main(String[] args) {
		
		//IF we override methods in child then if user creates object ref to 
		//child and stores to parent then only the methods which overidded in child call 
		//then child methods will be executed if not parent class methods can only be executedss
		// TODO Auto-generated method stub
		
		Overriding overriding = new Overriding();
		overriding.test(1, 2); 
		
		 
		Overriding overriding1 = new OverridingChild();
		overriding1.test(1, 2);
		
		
		 OverridingChild 	overridingchild = new OverridingChild();
		 overridingchild.test(1, 2);
		 overridingchild.add(1,2);

	}

}
