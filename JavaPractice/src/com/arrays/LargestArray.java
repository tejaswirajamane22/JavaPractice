package com.arrays;

public class LargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {9,435,3464,654,3,9,232342};
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) {
		if(arr[i]>max) {
			
			max=arr[i];
			
			
		}
		}
		System.out.println(max);

	}

}
