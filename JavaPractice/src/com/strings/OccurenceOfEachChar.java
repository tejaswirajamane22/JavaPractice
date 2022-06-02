package com.strings;

import java.util.HashMap;

public class OccurenceOfEachChar {

	public static void main(String[] args) {
		String str ="Tejhjjjju";
		char strarr[] =str.toCharArray();
		
		 HashMap<Character, Integer> charCountMap
         = new HashMap<Character, Integer>();
		 
		 for(char c:strarr)
		 {
			 if(charCountMap.containsKey(c)) {
				 charCountMap.put(c, charCountMap.get(c) + 1);
			 }
			 else {
				   charCountMap.put(c, 1);
	            }
		 }		
		 
		 System.out.println(charCountMap);

	}

}
