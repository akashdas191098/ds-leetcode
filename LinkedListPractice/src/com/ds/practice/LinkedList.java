package com.ds.practice;

public class LinkedList {
	
	ListNode head,tail;
	int size;
	public LinkedList() {
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	
	public class ListNode {
		int data;
		ListNode next;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
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
			System.out.print(" "+head.data);
			head=head.next;
		}
	}
	
	public void addFirst(int d) {
		
		if(head==null) {
			addLast(d);
		}
		
		ListNode node = new ListNode(d);
		node.next=head;
		head=node;
		size++;
	}
	
	public ListNode rotationByN(ListNode head,int p) {
		if(head==null) {
			return null;
		}
		else if(p==0) {
			return head;
		}
		int length = 0;
		
		ListNode tmpHead = head;
		while(tmpHead.next!=null) {
			length++;
			tmpHead=tmpHead.next;
		}
		length++;
		tmpHead.next=head;
		//System.out.print("size"+length);
		
		
		int position = length-p%length;
		ListNode p1 = head;
		while(position>1) {
			p1=p1.next;
			position--;
		}
		ListNode p2 = p1.next;
		p1.next=null;
//		ListNode tail = p2;
//		while(tail.next!=null) {
//			tail=tail.next;
//		}
//		tail.next=head;
		return p2;
		
	}
	
	
	public ListNode partition(ListNode head, int p) {
		ListNode beforeHead = new ListNode(-1);
		ListNode before = beforeHead;
		ListNode afterHead = new ListNode(-1);
		ListNode after = afterHead;
		
		while(head!=null) {
			if(head.data<p) {
				before.next=head;
				before=before.next;
			}
			else {
				after.next=head;
				after=after.next;
			}
			head=head.next;
		}
		after.next=null;
		before.next=afterHead.next;
		
		return beforeHead.next;
		
	}

}
