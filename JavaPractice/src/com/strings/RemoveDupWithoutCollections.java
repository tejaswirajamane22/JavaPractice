package com.strings;

public class RemoveDupWithoutCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="mallli";
		String temp ="";
		
		
		for(int i=0;i<str.length();i++) {
			
			int count =0 ;
			
			
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count = count+1;
					temp= temp+str.charAt(i);
					
				}
				
			}
		}
		System.out.println(temp);

	}

}
