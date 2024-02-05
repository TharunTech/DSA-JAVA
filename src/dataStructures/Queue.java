package dataStructures;

public class Queue {
	
	private int front=0;
	private int rear=-1;
	private int size=0;
	private int arr[]= new int[4];

	public void enqueue(int data) {
		// TODO Auto-generated method stub
		
		if(!isfull()) {
		rear = (rear+1)%4;
		arr[rear]= data;
		size++;
		}else {
			System.out.println("queue is full");
		}
		
	}
	
	public int dequeue() {
		if(!isEmpty()) {
		int data = arr[front];
		front = (front+1)%4;
		size--;
		return data;
		}
		else {
			System.out.println("queue is empty");
			return -1;
		}
	}
	
	public boolean isfull() {
		return size == 4;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void show() {//show will not work correct as circular queue size circles and the data order will change,
						// when we continously do enqueue and dequeue;
		System.out.println("Queue is :");
	
		
		for(int i =front; i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
	
	

}
