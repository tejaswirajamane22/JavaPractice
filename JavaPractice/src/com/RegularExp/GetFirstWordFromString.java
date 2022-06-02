package com.RegularExp;

public class GetFirstWordFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Teju Test Manager";
		
		String words[]=str.split(" ");
		for (int i=0;i<words.length;i++) {
			
			String firstWord =words[i];
			System.out.println("First words are::"+firstWord.charAt(0));
		}
		
		

	}

}
