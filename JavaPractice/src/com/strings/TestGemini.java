package com.strings;

import java.util.Arrays;

public class TestGemini {

	public static void main(String[] args) {
//		 int arr[]={1212121,10, 20,40,100,121,121212112};
//	        System.out.println( Arrays.sort(arr)); 
		
		String str="My name is Tejaswi Rajamane";
		String out="";
		String[]	arr=str.split(" ");
		
		for(int i=str.length()-1;i<=0;i--) {
			
			out=out+str.charAt(i);
			
		}
		
		System.out.println(out);
		

	}

}
