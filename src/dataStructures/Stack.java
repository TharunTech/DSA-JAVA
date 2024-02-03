package dataStructures;

public class Stack{

	private int arr[]= new int[5];
	int top;
	int size;
	
	public Stack() {
		size = arr.length;
		top = -1;
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
		for(int i: arr) {
			a = a+" "+i;
		}
		a= a+" ]";
		
		return a;

	}

}
