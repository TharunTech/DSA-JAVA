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

	public void addFirst(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);
		newNode.next = head;//1st link has address of previous first element, head is the address
		head = newNode;
	}

	public void delete(int data) {
		// TODO Auto-generated method stub
		Node current = head;
		while(current.next!=null && current.next.data!=data) {
			current = current.next;
		}
		
		if(current.next!=null) {
			current.next = current.next.next;
		}
		
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
