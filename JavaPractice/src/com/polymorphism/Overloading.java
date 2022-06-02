package com.polymorphism;

public class Overloading {

	// polymorphism is 1 to many forms
	// 2types:
	// Static(overloading-with in class can we done),
	// dynamic (overriding-can be done parent to child),
	// method name same but params(type ,order, number of) are diff and

	// method name same but type of params are diff

	public int test(final int a, int b) {
		return a + b;
	}

	public void test(String a, String b) {

	}

	// method name same but order of params are diff
	public int test(int a, float b) {
		return (int) (a + b);
	}

	public int test(float a, int b) {
		return (int) (a + b);
	}

	// method name same but num. of params are diff

	public long test(long a) {
		return a;
	}

	public long test(long a, long b) {
		return a + b;
	}

}
