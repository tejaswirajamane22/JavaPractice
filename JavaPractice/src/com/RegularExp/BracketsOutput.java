package com.RegularExp;

public class BracketsOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str="tejaswi(fission)@gmail.com";
	        
	        String exp=str.replaceAll("[()]"," ");
	        
	        String [] splittedexp= exp.split(" ");
	        
	        for(String c:splittedexp  ){
	            
	            if(c.contains("fission")){
	                
	                 System.out.println("Hello, World!:"+ c); 
	            }
	                
	            }
	}

}
