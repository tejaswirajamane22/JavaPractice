package com.Abstarct;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//abstarction can only be achived by inhertaince
		
//		AbstractClass abstractClass = new AbstractClass();- cant create object to abstartc class
		
//		AbstractClassImpl abstractClassImpl = new AbstractClassImpl();
//		abstractClassImpl.normalMethod();
//		abstractClassImpl.method();
//		abstractClassImpl.test();
		//maven-archetype-quickstart
		
		//InterfaceAbst interfaceAbst = new InterfaceAbst();//-not possible
		
		InterfaceAbst interfaceAbst2 = new AbstractClassImpl();
		//interfaceAbst2.method();
		interfaceAbst2.test();
		
		Interface2 interface2 = new AbstractClassImpl();
		//interfaceAbst2.method();
		interface2.test();
		
		Interface3 interface3 = new AbstractClassImpl();
		//interfaceAbst2.method();
		interface3.malli();
		
		
		Interface4 interface4 = new AbstractClassImpl();
		//interfaceAbst2.method();
		interface4.teju();
		
		//InterfaceAbst interfaceAbst3 = new AbstractClass();-not possible
		
//		
//		AbstractClass abstractClass =new AbstractClassImpl();
//		abstractClass.normalMethod();
//		abstractClass.method();
//		abstractClass.test();

	}

}
