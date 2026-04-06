package com.linkedlist;

public class ListNode {
	//createing value and next 
		int val;
		ListNode next;
		public ListNode(int x) {
	                     this.val=x;
		}
		public static void main(String[] args) {	
			ListNode l1= new ListNode(10);
			ListNode l2= new ListNode(20);
			ListNode l3= new ListNode(48);
			ListNode l4= new ListNode(9);
			//linking nodes 
			l1.next=l2;
			l2.next=l3;
			l3.next=l4;
			l4.next=null;	
			//priniting values
			ListNode ptr= l1;
			
			while(ptr!=null)
			{
				System.out.println(ptr.val);
				ptr=ptr.next;
			}
		}

}
