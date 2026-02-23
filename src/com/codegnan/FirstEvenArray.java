package com.codegnan;

public class FirstEvenArray {

	public static void main(String[] args) {
		int[] arr= {1,2,7,9,5};
		
		for(int nums:arr) {
			if(nums%2==0) {
				System.out.println("found even : "+nums);
				return;
			}
			
				
			
		}
		
		System.out.println("No found Even...");
	}

}
