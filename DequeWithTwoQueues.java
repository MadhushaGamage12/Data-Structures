package dataStructure;


	import java.util.LinkedList;

	public class DequeUsingTwoFifoQueues<T> {
		 private final LinkedList<T> frontQueue;
		    private final LinkedList<T> backQueue;

		    public DequeUsingTwoFifoQueues() {
		        frontQueue = new LinkedList<>();  // Initialize frontQueue 
		        backQueue = new LinkedList<>();  // Initialize backQueue
		    }
		    // Adds an element to the front of the deque.
		    public void addFirst(T element) {
		        frontQueue.addFirst(element);
		    }

		    // Adds an element to the back of the deque.
		    public void addLast(T element) {
		        if (backQueue.isEmpty()) {
		            backQueue.addLast(element);
		        } else {
		            // Move elements from frontQueue to backQueue (only if needed)
		            transferElements();
		            backQueue.addLast(element);
		        }
		    }

		    // Removes and returns the element from the front of the deque,  or  if the deque is empty "null".
		    public T removeFirst() {
		        if (isEmpty()) {
		            return null;
		        }
		        if (frontQueue.isEmpty()) {
		            transferElements();
		        }
		        return frontQueue.removeFirst();
		    }

		    // Removes and returns the element from the back of the deque,  or  if the deque is empty "null".
		    public T removeLast() {
		        if (isEmpty()) {
		            return null;
		        }
		        if (backQueue.isEmpty()) {
		            transferElements();
		        }
		        return backQueue.removeLast();
		    }

		    // Returns the element at the front of the dequeue without removing it, 
		    // or null if the dequeue is empty.
		    public T peekFirst() {
		        if (isEmpty()) {
		            return null;
		        }
		        if (frontQueue.isEmpty()) {
		            transferElements();
		        }
		        return frontQueue.peek();
		    }

		    // Returns the element at the back of the dequeue without removing it, 
		    // or null if the dequeue is empty.
		    public T peekLast() {
		        if (isEmpty()) {
		            return null;
		        }
		        if (backQueue.isEmpty()) {
		            transferElements();
		        }
		        return backQueue.peekLast();
		    }

		    // Moves all elements from frontQueue to backQueue if backQueue is
		    // not empty. This ensures efficient access from the "active" end.
		    private void transferElements() {
		        if (frontSize() > 0) {
		            while (!frontQueue.isEmpty()) {
		                backQueue.addLast(frontQueue.removeFirst());
		            }
		        }
		    }

		    // Returns the number of elements in the front queue.
		    private int frontSize() {
		        return frontQueue.size();
		    }

		    // Returns the number of elements in the back queue.
		    private int backSize() {
		        return backQueue.size();
		    }

		    // Checks if the deque is empty.
		    public boolean isEmpty() {
		        return frontSize() + backSize() == 0;
		    }

		    // Returns the number of elements in the deque.
		    public int size() {
		        return frontSize() + backSize();
		    }

		    // Removes all elements from the deque.
		    public void clear() {
		        frontQueue.clear();
		        backQueue.clear();
		    }
		

		public static void main(String[] args) {
			
			 DequeUsingTwoFifoQueues<Integer> deque = new DequeUsingTwoFifoQueues<>();


		        // Adding elements to the deque
		        deque.addFirst(108);
		        deque.addLast(52);
		        deque.addFirst(6);

		        // Removing elements from the deque
		        System.out.println("Removed first element: " + deque.removeFirst()); 
		        System.out.println("Removed last element: " + deque.removeLast());   

		        // Peeking at elements without removing them
		        System.out.println("Front element: " + deque.peekFirst()); //108
		        System.out.println("Back element: " + deque.peekLast());   //108

		        // Checking size and emptiness
		        System.out.println("Size of deque: " + deque.size());     //1  
		        System.out.println("Is deque empty? " + deque.isEmpty());  //false
		}

	}

