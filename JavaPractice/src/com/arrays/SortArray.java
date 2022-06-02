package com.arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp =0;
		int arr[]= {9,435,3464,654,3,4,232342};
		for (int i=0;i<arr.length;i++) {
			//System.out.print("Given Sorted array is"+ arr[i] +"" );
		}
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		System.out.print("Sorted array is:" );
		
		
		for (int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
			

		}
		System.out.println("   -----");
		System.out.println(arr.length);
		System.out.println(arr[6]);

	}

}
