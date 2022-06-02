package com.strings;

public class ReverseString {
	
	//Logic is: start from end of string letter use for loop to iterate  and use charAt() method
	
	//Palindorme is : If we reverse aslo it shows same word ex: madam 

	public static void main(String[] args) {


		String str ="test";
		String strEmp ="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
		 strEmp=strEmp+str.charAt(i);
			
		}
		
		System.out.println("Reverse String :"+strEmp);
		
	}

}
