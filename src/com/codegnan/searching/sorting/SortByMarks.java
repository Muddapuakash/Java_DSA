package com.codegnan.searching.sorting;

import java.util.Arrays;
import java.util.List;

public class SortByMarks {

	public static void main(String[] args) {
//	  Student st1=new Student("Akash",90);
//	  Student st2=new Student("Praveen",89);
//	  Student st3=new Student("Sai",86);
//	  Student st4=new Student("Swaroop",50);
//	  
//	  Student[] arr= {st1,st2,st3,st4};
//	  Arrays.sort(arr);
		/*
		 * for(int i=0;i<arr.length-1;i++) { for(int j=0;j<arr.length-1;j++) {
		 * if(arr[j].marks>arr[j+1].marks) { Student temp=arr[j]; arr[j]=arr[j+1];
		 * arr[j+1]=temp; }
		 * 
		 * }
		 * 
		 * }
		 */
	  
	  
	  List<Student> li=new ArrayList();
	  li.add(new Student("Keerthi",90));
	  li.add(new Student("Suresh",89));
	  
	  li.sort((s1,s1)->{
		  if(s1.marks != s2.marks) {
			  return s1.marks-s2.marks;
		  }else{
			  return s1.name.compareTo(s2.name);
		  }
	  });
	for(Student st:arr) {
		  st.display();
	  }
	 

	}

}
