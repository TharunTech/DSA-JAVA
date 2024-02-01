package dataStructures;

public class LinkedList {
	
	Node head = null;
	
	public void add(int data) {
		Node newNode = new Node(data);
		
		Node current = head;
		if(head==null)
			head = newNode;
		else {
			while(current.next!=null)
				current = current.next;
			current.next = newNode;
			
		}
		
	}
	
	public void printValues() {
		// TODO Auto-generated method stub
		Node current = head;
		
		while(current!=null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();

	}

}

class Node{//will have data and address
	
	int data;
	Node next;//its address
	
	public Node(int data) {
		this.data = data;
		next = null;
	}
	
}
