package com.Interger;

import java.util.Scanner;

public class ReverseGivenNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		int rev=0;
		while(num!=0) {
			rev =rev*10+ num%10;
			num = num/10;
		}
		
		System.out.println("Reverse of given number is"+rev);
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		sb.reverse();
		
		
		
	}

}
