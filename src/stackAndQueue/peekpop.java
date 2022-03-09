package stackAndQueue;
import java.util.*;
import java.io.*;

public class peekpop {

		// Main Method
		public static void main(String args[])
		{
			// Creating an empty Stack
			Stack<Integer> stack = new Stack<Integer>();

			// Use push() to add elements into the Stack
			stack.push(70);
			stack.push(40);
			stack.push(56);
			stack.push(30);
			stack.push(33);

			// Displaying the Stack
			System.out.println("Initial Stack: " + stack);

			// Fetching the element at the head of the Stack
			System.out.println("The element at the top of the"
							+ " stack is: " + stack.peek());

			// Displaying the Stack after the Operation
			System.out.println("Final Stack: " + stack);
		
		System.out.println("Popped element: "
                + stack.pop());
		System.out.println("Popped element: "
                + stack.pop());
		System.out.println("Popped element: "
                        + stack.pop());
		System.out.println("Popped element: "
                + stack.pop());
		System.out.println("Popped element: "
                + stack.pop());
		System.out.println("Final Stack: " + stack);
	}
}


