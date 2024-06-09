package dataStructure;

	import java.util.LinkedList;
	import java.util.NoSuchElementException;
	public class StequeImplementation<T> {

		    private LinkedList<T> list;

		    public StequeImplementation() {
		        list = new LinkedList<>();
		    }

		    // Push element onto the front of the steque
		    public void push(T item) {
		        list.addFirst(item);
		    }

		    // Enqueue element onto the back of the steque
		    public void enqueue(T item) {
		        list.addLast(item);
		    }

		    // Pop element from the front of the steque
		    public T pop() {
		        if (isEmpty()) {
		            throw new NoSuchElementException("Steque is empty");
		        }
		        return list.removeFirst();
		    }

		    // Check if the steque is empty
		    public boolean isEmpty() {
		        return list.isEmpty();
		    }

		    // Get the size of the steque
		    public int size() {
		        return list.size();
		    }

		    // Display the elements of the steque
		    public void display() {
		        System.out.println("Steque: " + list);
		    }

		    public static void main(String[] args) {
		        StequeImplementation<Integer> steque = new StequeImplementation<>();
		        steque.enqueue(108);
		        steque.enqueue(52);
		        steque.enqueue(83);
		        steque.display();

		        steque.push(10);
		        steque.display(); 

		        steque.pop();
		        steque.display(); 
		    }
		
}
