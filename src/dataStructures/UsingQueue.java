package dataStructures;

public class UsingQueue {
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		
		System.out.println(queue.dequeue());
		queue.show();
	}

}
