package com.strings;

public class AT {

	public static void main(String[] args) {
		
		
		
		String input ="My name is Tejaswi Rajamane";

		String  expOutput="";

		String[] inputAfterSplit=input.split(" ");

		for(int i =inputAfterSplit.length-1;i>=0;i--){

		  expOutput =expOutput+inputAfterSplit[i];

		}
		
		System.out.println(expOutput);
		

	}
	}


