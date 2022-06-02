package com.Interger;

public class SumOfGivenInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=123;
		
		int temp=0;
		int sum=0;
		
		while(num>0) {
		temp= num%10;
		sum=sum+temp;
		num= num/10;
		}
		System.out.println(sum);

	}

}
