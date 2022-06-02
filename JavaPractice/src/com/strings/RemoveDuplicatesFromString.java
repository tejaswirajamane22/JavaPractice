package com.strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
	
	
	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="test";
		Set<Character> li= new HashSet<>();
		
		
		for(int i=0;i<str.length();i++) {
			char stremp=str.charAt(i);
			li.add(stremp);
		}
		
		
		System.out.println("li:"+li.toString());
		
		
		

	}

}
