package com.strings;

public class RemoveDupUsingContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result = "";
		
		String input="malli";
		
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result =result+ String.valueOf(input.charAt(i));
	        }
	    }
		
		System.out.println(result);
	   
		
		
	}

}
