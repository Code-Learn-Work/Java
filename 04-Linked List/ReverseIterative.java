package LinkedList;

public class ReverseIterative extends LinkedListUse{
	
	public static Node<Integer> reverse(Node<Integer> head){
		
		// Take 3 Nodes
		Node<Integer> cur = head, prev = null, temp;
		
		while(cur!=null) {
			temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}
		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head =takeInput();
		printList(head);
		head=reverse(head);
		printList(head);

	}

}
