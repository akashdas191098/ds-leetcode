package com.ds.practice;

import java.util.Stack;

public class LinkedList {
	
	ListNode head,tail;
	int size;
	

	public LinkedList() {
		super();
		this.head = null;
		this.tail = null;
		this.size = 0;
	}


	public class ListNode{
		int data;
		ListNode next;
		public ListNode(int data) {
			super();
			this.data = data;
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
		size++;
	}
	
	public void printList(ListNode head) {
		while(head!=null) {
			System.out.print(head.data+",");
			head=head.next;
		}
	}
	
	public int pairSum(ListNode head) {
		ListNode currNode = head;
		Stack<Integer> stack = new Stack<Integer>();
		
		while(currNode!=null) {
			stack.push(currNode.data);
			currNode=currNode.next;
		}
		
		currNode=head;
		int stackSize = stack.size();
		int count = 1;
		int maxSum = 0;
		while(count <= stackSize/2) {
			maxSum = Math.max(maxSum, currNode.data+stack.peek());
			currNode=currNode.next;
			stack.pop();
			count++;
		}
		return maxSum;
	}
}
