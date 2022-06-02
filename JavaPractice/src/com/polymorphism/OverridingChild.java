/**
 * 
 */
package com.polymorphism;

/**
 * @author trajamane
 *
 */
public class OverridingChild extends Overriding {

	public void test(int a, int b) {

		System.out.println("CHild:" + a * b);

	}
	
	public void add(int a, int b) {

		System.out.println("CHild:" + (a + b));

	}

}


