package com.org.collectionPgm;

public class StudentLinkedList {

	Node head;

	public StudentLinkedList() {}
	
	static class Node { 

		int id;
		String nm;
		Node next; 

		Node(int d, String n)  {
			id = d; 
			nm = n;
			next = null; } // Constructor 

		@Override
		public String toString() {
			return (id + "  " + nm);
		}
	}
		
	public static void main(String[] args) {
		StudentLinkedList s = new StudentLinkedList();
		Node one = new Node(1, "Pooja");
		Node two = new Node(2,"Poonam");
		Node three = new Node(3,"Aryan");

		s.head = one;
		one.next = two;
		two.next = three;

		System.out.println("Travrse Student LinkedList");
		s.printList();	
	}

	public void printList(){
		Node n = head;
		while (n != null){
			System.out.println(n);
			n = n.next;
		}
	}
}
