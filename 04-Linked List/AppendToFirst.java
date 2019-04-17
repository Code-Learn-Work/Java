package LinkedList;

import java.util.Scanner;

public class AppendToFirst extends LinkedListUse {

	public static Node<Integer> append(Node<Integer> head,int n){
		Node<Integer> fast = head,slow = head;
		for(int i=0;i<n;i++) {
			fast = fast.next;
		}
		
		while(fast.next!=null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		Node<Integer> temp = slow.next;
		slow.next = null;
		fast.next = head;
		head = temp;
		
		return head;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node<Integer> head = takeInput();
		printList(head);
		int n = sc.nextInt();
		head = append(head, n);
		printList(head);	
		sc.close();
	}

}
