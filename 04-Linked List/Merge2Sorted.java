package LinkedList;

public class Merge2Sorted extends LinkedListUse {
	
	public static Node<Integer> merge2Sorted(Node<Integer> head1,Node<Integer> head2){
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		
		Node<Integer> ans = null;
		if(head1.data < head2.data) {
			ans = head1;
			head1 = head1.next;
		}
		else {
			ans = head2;
			head2 = head2.next;
		}
		
		Node<Integer> cur = ans;
		while((head1!=null) || (head2!=null)) {
			if(head1==null) {
				cur.next = head2;
				return ans;
			}
			else if (head2==null) {
				cur.next = head1;
				return ans;
			}
			
			if(head1.data < head2.data) {
				cur.next = head1;
				cur = cur.next;
				head1 = head1.next;
			}
			else {
				cur.next = head2;
				cur = cur.next;
				head2 = head2.next;
			}
		}
		cur.next = null;
		return ans;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enetr first linkedlist: ");
		Node<Integer> list1 = takeInput();
		System.out.println("Enter second linkedlist: ");
		Node<Integer> list2 = takeInput();
		list1 = merge2Sorted(list1, list2);
		printList(list1);

	}

}
