package Stacks;

public class StackUsingArray {
	
	private int data[]; // Array used as stack
	private int top; // Index of the topmost element of the stack
	
	// Default Constructor
	public StackUsingArray() {
		data = new int[10];
		top=-1;	
	}
	
	// Parameterized Constructor
	public StackUsingArray(int capacity) {
		data = new int[capacity];
		top=-1;
	}
	
	// Check if Stack is empty 
	public boolean isEmpty() {
		return top==-1;
	}
	
	// Get the size of the stack
	public int size() {
		return top+1;
	}
	
	// return the top of the stack
	public int top() throws StackEmptyException {
		if(size()==0) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		
		return data[top];
	}
	
	public void push(int elem) throws StackFullException{
		if(size()==data.length) {
			StackFullException e = new StackFullException();
			throw e;
		}
		top++;
		data[top] = elem;
	}
	
	public int pop() throws StackEmptyException {
		
		if(isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		
		int temp = data[top];
		top--;
		return temp;
	}
	

}
