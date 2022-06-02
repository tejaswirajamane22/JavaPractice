package com.arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {9,435,3464,654,3,9,232342};
		
		boolean flag=false;
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					
					System.out.println("Found Duplicates:"+arr[i]);
					flag=true;
					
				}
		

	}

}
		
		if(flag==false) {
			
			System.out.println("Found not Duplicates:");
			
		}
	}
}
