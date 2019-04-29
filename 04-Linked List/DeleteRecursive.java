package LinkedList;

public class DeleteRecursive extends LinkedListUse{
	
	public static int getSize(Node<Integer> head) {
		Node<Integer> temp = head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	public static Node<Integer> deleteRec(Node<Integer> head,int pos) {
		// Base Case
		if(pos==0) {
			return head.next;
		}
		if(pos>=getSize(head)) {
			return head;
		}
		if(head==null)
			return head;
		
		// Rec Case
		
		head.next = deleteRec(head.next, pos-1);
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		head = deleteRec(head, 2);
		printList(head);
	}

}
