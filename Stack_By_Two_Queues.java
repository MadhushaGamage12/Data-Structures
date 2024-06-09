package dataStructure;

	import java.util.*;

	public class Stack_By_Two_Queues {
		  static class Stack {
		       
		        static Queue<Integer> q1
   = new LinkedList<Integer>();
		        static Queue<Integer> q2
	 = new LinkedList<Integer>();
		 
		        static int curr_size;
		 
		        static void push(int x) {
		  
		            q2.add(x);
		 
				            while (!q1.isEmpty()) {
		                q2.add(q1.peek());
		                q1.remove();
		            }
		 		          
		            Queue<Integer> q = q1;
		            q1 = q2;
		            q2 = q;
		        }
		 
		        static void pop() {
	        

		            if (q1.isEmpty())
		                return;
		            q1.remove();
		        }
		 
		        static int top() {
		        
		            if (q1.isEmpty())
		                return -1;
		            return q1.peek();
		        }
		 
		        static int size() { return q1.size(); }
		    }

		    public static void main(String[] args) {
		    
		    	
		              
		        Stack st = new Stack();
		        st.push(108);
		        st.push(82);
		        st.push(57);
		 
		        System.out.println("current size: " + st.size());
		        System.out.println("current 1st pop number : " + st.top());
		        st.pop();
		        System.out.println("current 2nd pop number : " +st.top());
		        st.pop();
		        System.out.println("current  number : " +st.top());
		 
		        System.out.println("current size: " + st.size());
		    }

	}

