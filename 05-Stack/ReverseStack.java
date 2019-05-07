package Stacks;
import java.util.Stack;
import java.util.Scanner;

public class ReverseStack {
	
	public static void reverse(Stack<Integer> s1,Stack<Integer> s2) {
		if(s1.size()<=1)
			return;
		
		int last = s1.pop();
		reverse(s1, s2);
		while(!s1.isEmpty()) {
			int a = s1.pop();
			s2.push(a);
		}
		
		s1.push(last);
		while(!s2.isEmpty()) {
			int a = s2.pop();
			s1.push(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		
		int n =sc.nextInt();
		int i=0;
		while(i<n) {
			int a = sc.nextInt();
			s1.push(a);
			i++;
		}
		
		reverse(s1,s2);
		while(!s1.isEmpty()) {
			System.out.print(s1.pop()+" ");
		}
				
		sc.close();
	}

}
