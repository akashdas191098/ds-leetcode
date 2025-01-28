package com.ds.practice;

public class LinkedList {
	
	public ListNode head,tail;
	
	
	
	public LinkedList() {
		super();
		this.head = null;
		this.tail = null;
	}



	public class ListNode{
		
		int val;
		ListNode next;
		public ListNode(int val) {
			super();
			this.val = val;
			this.next = null;
		}
		
	}
	
	public void addLast(int d) {
		ListNode node = new ListNode(d);
		if(head==null) {
			head=tail=node;
		}
		else {
			tail.next=node;
			tail=node;
		}
	}
	
	public void printList(ListNode head) {
		while(head!=null) {
			System.out.print(head.val+",");
			head=head.next;
		}
	}
	
	public ListNode deleteMiddle(ListNode head) {
		if(head==null || head.next==null) {
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;
		ListNode prev = null;
		while(fast!=null && fast.next!=null) {
			prev=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		prev.next=slow.next;
		return head;
	}

}
