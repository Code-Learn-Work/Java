 package LinkedList;

import java.util.Scanner;

public class LinkedListUse {
	public static Scanner sc = new Scanner(System.in);
	public static Node<Integer> takeInput() {
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		int data = sc.nextInt();
		while(data != -1) {
			Node<Integer> n = new Node<Integer>(data);
			if(head == null) {
				head = n;
				tail = n;
			}
			else {
				tail.next = n;
				tail = n;
			}
			data = sc.nextInt();
		}
		return head;
	}
	
	public static void printList(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" -> ");
			head = head.next;
		}
		System.out.println("NULL");
	}
	public static void main(String[] args) {
//		Node<Integer> node1 = new Node<Integer>(10);
//		System.out.println(node1.data);
//		System.out.println(node1.next) ;
//		Node<Integer> node2 = new Node<Integer>(20);
//		node1.next = node2;
//		System.out.println(node2.data);
//		System.out.println(node1.next);
//		Node<Integer> node3 = new Node<Integer>(30);
//		node2.next = node3;
//		Node<Integer> head = node1;
		
		// Input List
		Node<Integer> head = takeInput();
		
		// Print Linked List
		printList(head);
	}

}
