package dataStructures;

public class Stack{

	private int arr[]= new int[5];
	int top = -1;
	int size;
	
	public Stack() {
		size = arr.length;
	}
	public void push(int data) throws Exception {
		
		
		top++;//cant use for loop as it will return to 0 every time we call push
		if(top<size) {
		arr[top]= data;
		}else {
			System.out.println("Stack overflow");
		}
		
	}
	
	public String toString() {
		
		String a = "[";
		for(int i=0;i<=top;i++) {
			a = a+" "+arr[i];
		}
		a= a+" ]";
		
		return a;

	}
	public int pop() {
		// TODO Auto-generated method stub
		if(top>-1)
			return arr[top--];
		else
			System.out.println("Stack underflow");
		
		return 0;
		
	}
	public int peak() {
		// TODO Auto-generated method stub
		if(top>-1)
			return arr[top];
		else
			System.out.println("Stack underflow");
		return 0;
		
	}

}
