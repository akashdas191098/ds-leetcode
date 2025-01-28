package com.ds.linkedlist;

public class LinkedList {

	Node head,tail;
	int size;
	public LinkedList() {
		head=tail=null;
		size=0;
	}
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	public void addLast(int d) {
		Node node = new Node(d);
		if(head==null) {
			head=tail=node;
		}
		else{
			tail.next=node;
			tail=node;
		}
		size++;
	}
	
	public void addFirst(int d) {
		Node node = new Node(d);
		if(head==null) {
			head=tail=node;
		}
		else {
			node.next=head;
			head = node;
		}
		size++;
	}
	
	public void printList(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	public void removeFirst() {
		if(head==null) {
			System.out.print("List is empty");
		}
		else {
			head=head.next;
			size--;
		}
	}
	public void removeLast() {
		if(head==null) {
			System.out.print("List is empty");
		}
		else {
			Node tmp = head;
			for(int i=1;i<size-1;i++) {
				tmp= tmp.next;
			}
			tmp.next=null;
			tail=tmp;
			size--;
		}
	}
	
	public void addInNPosition(int d,int pos) {
		Node node = new Node(d);
		if(head==null) {
			addFirst(d);
		}
		else if(pos>size) {
			addLast(d);
		}
		else {
			Node tmp = head;
			for(int i=1;i<pos-1;i++) {
				tmp = tmp.next;
			}
			node.next=tmp.next;
			tmp.next=node;
			size++;
		}
	}
	
	public void removeFromNPosiion(int pos) {
		if(head==null) {
			System.out.print("Remove not possible,list is empty");
		}
		else if(pos==1) {
			removeFirst();
		}
		else if(pos==size) {
			removeLast();
		}
		else if(pos>size) {
			System.out.print("list doesn't have "+pos+"no of element right now");
		}
		else {
			Node tmp = head;
			for(int i=1;i<pos-1;i++) {
				tmp=tmp.next;
			}
			tmp.next=tmp.next.next;
			size--;
		}
	}
	
	public Node rotationByN(Node head, int p) {
		if(head==null) {
			return null;
		}
		else if(p==0) {
			return head;
		}
		p=size-p%size;
		//p=size-p;
			Node p1=head;
			while(p>1) {
				p1=p1.next;
				p--;
			}
			Node p2=p1.next;
			p1.next=null;
			Node tail = p2;
			while(tail.next!=null) {
				tail=tail.next;
			}
			tail.next=head;
		
		return p2;
	}
}
