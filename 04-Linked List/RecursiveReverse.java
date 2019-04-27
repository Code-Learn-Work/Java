package LinkedList;

public class RecursiveReverse extends LinkedListUse{

	public static Node<Integer> recReverse(Node<Integer> head){
		if(head==null ||head.next==null)
			return head;
		
		Node<Integer> tmp = recReverse(head.next);
		head.next.next = head;
		head.next = null;
		return tmp;
	}
	
	public static DoubleNode reverseLLBetter(Node<Integer> head) {
		if(head==null || head.next==null) {
			DoubleNode ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		
		// Assign the first Node as Last
		DoubleNode tmp = reverseLLBetter(head.next);
		tmp.tail.next = head;
		head.next = null;
		
		// Join the remaining list
		DoubleNode ans = new DoubleNode();
		ans.head = tmp.head;
		ans.tail = head;
		return ans;
	}
	
	public static Node<Integer> reverse3(Node<Integer> head){
		if(head==null || head.next==null) {
			return head;
		}
		
		Node<Integer> tail = head.next;
		Node<Integer> tmp = reverse3(head.next);
		tail.next = head;
		head.next = null;
		
		return tmp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		System.out.print("Original LinkedList : ");
		printList(head);
		System.out.print("Reversed LinkedList : ");
//		Node<Integer> rev = recReverse(head);
//		printList(rev);
		
//		DoubleNode ans = reverseLLBetter(head);
//		printList(ans.head);
		
		Node<Integer> rev = reverse3(head);
		printList(rev);

	}

}
