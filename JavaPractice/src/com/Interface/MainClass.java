package com.Interface;

public class MainClass implements Interface3 {

	@Override
	public void test() {
		// TODO Auto-generated method stub

		System.out.println("test");

	}

	
	public void test2() {

		System.out.println("test2");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface3 in = new MainClass();
		in.test();
		in.test2();
		in.testInter1();
		

	}


	@Override
	public void testInter1() {
		// TODO Auto-generated method stub
		
	}

}
