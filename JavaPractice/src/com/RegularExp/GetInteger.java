package com.RegularExp;

public class GetInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String address= "12-242/1,VishwaBhramanStreet,Krishna,-521175";
		
		
		String exp=address.replaceAll("[^ 0-9]", "");
		
		
		System.out.println(exp.toString());
		

	}

}
