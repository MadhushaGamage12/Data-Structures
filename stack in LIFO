public class stackmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack nums = new stack();
		nums.push(104);
		nums.push(25);
		nums.push(88);
		nums.push(52);
		nums.push(11);
		
		System.out.println(nums. peek());
		nums.push(7);
		
		 System.out.println(nums.pop());
		nums.show();
	}

}


public class stack {
	  int stack[] = new int[7];
	  int top=0;
	  
	  public void push(int data) {
		  stack[top]= data;
		  top++;
	  }
	  public int pop() {
		  int data;
		  top--;
		  data = stack[top];
		  stack[top]=0;
		  return data;
		  
	  }
	  public int peek() {
		  int data;
		  data = stack[top-1];
		  return data;
		  
	  }
	  public void show() {
		  for(int n:stack) {
			  System.out.print(n + " ");
		  }
		  
	  }
	
}
