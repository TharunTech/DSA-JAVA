package dataStructures;

import java.util.List;

public class UsingLinkedList {
	

	public static void main(String[] args) {
		LinkedList nums = new LinkedList ();//our custom made linkedList class
		
		nums.add(4);
		nums.add(5);
		nums.add(33);
		
		nums.addFirst(7);
		
		nums.delete(5);
		
		System.out.println("Linked List");
		nums.printValues();
		
	}
	
	

	
}


