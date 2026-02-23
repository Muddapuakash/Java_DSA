package com.codegnan.searching;

public class BinarySerach {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int target=9;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(target==mid) {
				System.out.println("element found"+mid);
				return;
				
			}
			else if(target>mid) {
				low=mid+1;
			}
			else{
				high=mid-1;
			}
			
		}
		System.out.println("elemet is not found");
	}

}
