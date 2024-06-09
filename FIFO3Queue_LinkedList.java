package dataStructure;
public class Queue_LinkedList{}

	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	// Queue Class
	class Queue {
	    Node front, rear;
	    int length;

	    public Queue() {
	        this.front = this.rear = null;
	        this.length = 0;
	    }

	    void enqueue(int key) {
	        this.length++;
	        Node temp = new Node(key);
	        if (this.rear == null) {
	            this.front = this.rear = temp;
	            return;
	        }
	        this.rear.next = temp;
	        this.rear = temp;
	    }

	    void dequeue() {
	        if (this.front == null)
	            return;
	        this.length--;
	        Node temp = this.front;
	        this.front = this.front.next;
	        if (this.front == null)
	            this.rear = null;
	        temp.next = null;
	    }

	    int peek() {
	        if (this.front != null)
	            return this.front.data;
	        throw new IllegalStateException("Queue is empty");
	    }

	    int size() {
	        return this.length;
	    }

	    void printQueue() {
	        Node temp = this.front;
	        System.out.print("Elements of Queue: ");
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    // Driver Class
	    public static void main(String[] args) {
	        Queue q = new Queue();
	        q.enqueue(108);
	        q.enqueue(52);
	        q.enqueue(83);
	        q.printQueue();
	        System.out.println("Size: " + q.size());
	        q.dequeue();
	        q.dequeue();
	        q.enqueue(16);
	        q.enqueue(6);
	        q.enqueue(69);
	        q.printQueue();
	        System.out.println("Size: " + q.size());
	        System.out.println("Front item is: " + q.peek());
	    }
	}

