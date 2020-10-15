package Lecture13;

import Lecture11.StackUsingArrays;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingArrays stack = new DynamicStack(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
			displayStackInfo(stack);
		}
		for (int i = 1; i <= 5; i++) {
			stack.push(i * 100);
			displayStackInfo(stack);
		}

		stack.pop();
		displayStackInfo(stack);
//		while (!stack.isEmpty()) {
//			displayStackInfo(stack);
//			stack.pop();
//		}
//		stack.pop();
	}

	public static void displayStackInfo(StackUsingArrays stack) throws Exception {
		System.out.println("*************************************");
		stack.display();
		System.out.println(stack.size());
		System.out.println(stack.top());
		System.out.println("*************************************");

	}


}
