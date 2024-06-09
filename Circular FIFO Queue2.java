package dataStructure;

	import java.util.*; 
	public class CircularQueue 
	{ 
		
		private int maxSize;	 
				
		private int[] queueArray; // Array to store the circular queue elements 
		
		private int front;		// Index of the front element  
		
		private int rear;	// Index of the rear element 	 

		
		public CircularQueue(int size) // constructor to initialize the circular queue with a given size 
		{ 
			maxSize = size; 
			queueArray = new int[maxSize]; 
			
		// Initially set front and rear to -1 to indicate an empty queue 
			front = -1; 
			rear = -1; 
		} 

		// method to enqueue (add) an item to the circular queue 
		public void enqueue(int item) 
		{ 
			if (isEmpty()) 
			{ 
				front = 0; 
				rear = 0; 
				queueArray[rear] = item; 
			} 
		else
		{ 
				// Circular increment of rear index 
				rear = (rear + 1) % maxSize; 
				if (rear == front) 
				{ 
					System.out.println("Queue is full. Cannot enqueue."); 
					
					// Reset rear to its previous value 
					rear = (rear - 1 + maxSize) % maxSize; 
				} 
			else
				{ 
					queueArray[rear] = item; 
				} 
			} 
		} 

		// method to dequeue (remove) an item from the circular queue 
		public int dequeue() 
		{ 
			int item = -1; // Assuming -1 represents an empty value 

			if (!isEmpty()) 
			{ 
				item = queueArray[front]; 
				if (front == rear) { 
					// Reset front and rear to -1 to indicate an empty queue 
					front = -1; 
					rear = -1; 
				} 
			else
				{ 
					// Circular increment of front index 
					front = (front + 1) % maxSize; 
				} 
			} 
		else
			{ 
				System.out.println("Queue is empty. Cannot dequeue."); 
			} 

			return item; 
		} 

		// Method to peek at the front element of the circular queue without removing it 
		public int peek() 
		{ 
			if (!isEmpty()) 
			{ 
				return queueArray[front]; 
			} 
		else
			{ 
				System.out.println("Queue is empty. No peek value."); 
				return -1; // Assuming -1 represents an empty value 
			} 
		} 

		// Method to check if the circular queue is empty 
		public boolean isEmpty() 
		{ 
			return front == -1 && rear == -1; 
		} 

		// Main method for testing the CircularQueue class 
		public static void main(String[] args) 
		{ 
			CircularQueue circularQueue = new CircularQueue(5); 

			circularQueue.enqueue(104); 
			circularQueue.enqueue(83); 
			circularQueue.enqueue(52); 

			// Should print 1 
			System.out.println("Peek: " + circularQueue.peek()); 

			// Should print 1 
			System.out.println("Dequeue: " + circularQueue.dequeue()); 

			// Should print 2 
			System.out.println("Peek after dequeue: " + circularQueue.peek()); 
			
			 System.out.println("Front element: " + circularQueue.peek());
		} 
	} 


