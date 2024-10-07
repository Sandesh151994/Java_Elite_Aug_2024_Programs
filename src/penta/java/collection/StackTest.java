package penta.java.collection;

import java.util.Collections;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		
		Stack<Integer> stack=new Stack<Integer>();
		
		Collections.addAll(stack, 22,33,44,55,77,20);
		
		System.out.println(stack);
		System.out.println("Removing elements in a last int first out fashion");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		

	}

}
