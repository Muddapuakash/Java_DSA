package com.codegnan.searching.sorting;

import java.util.Arrays;

public class SortByMarks {

	public static void main(String[] args) {
	  Student st1=new Student("Akash",90);
	  Student st2=new Student("Praveen",89);
	  Student st3=new Student("Sai",86);
	  Student st4=new Student("Swaroop",50);
	  
	  Student[] arr= {st1,st2,st3,st4};
	  Arrays.sort(arr);
		/*
		 * for(int i=0;i<arr.length-1;i++) { for(int j=0;j<arr.length-1;j++) {
		 * if(arr[j].marks>arr[j+1].marks) { Student temp=arr[j]; arr[j]=arr[j+1];
		 * arr[j+1]=temp; }
		 * 
		 * }
		 * 
		 * }
		 */
	  for(Student st:arr) {
		  st.display();
	  }
	 

	}

}
