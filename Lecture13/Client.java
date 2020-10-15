package Lecture13;

import Lecture13.DynamicQueue;
import Lecture13.DynamicStack;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack stack = new DynamicStack(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i);
		}
		DynamicStack helper = new DynamicStack(5);
		stack.display();
		reverseStack(stack, helper, 0);
		stack.display();

		DynamicQueue queue = new DynamicQueue(5);
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i);
		}
		queue.display();
		reverseQueue(queue);
		queue.display();

		String str = "([{(a+b)+(c+d)}]";
		System.out.println(isBalanced(str));

	}

	public static void reverseStack(DynamicStack stack, DynamicStack helper, int index) throws Exception {
		if (stack.isEmpty()) {
			return;
		}
		int item = stack.pop();
		reverseStack(stack, helper, index + 1);
		helper.push(item);
		if (index == 0) {
			while (!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
	}

	public static void reverseQueue(DynamicQueue queue) throws Exception {
		if (queue.isEmpty()) {
			return;
		}
		int item = queue.dequeue();
		reverseQueue(queue);
		queue.enqueue(item);
	}

	public static boolean isBalanced(String str) throws Exception {
		DynamicStack stack = new DynamicStack();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
				stack.push(str.charAt(i));
			} else if (str.charAt(i) == ']') {
				if (stack.isEmpty()) {
					return false;
				} else {
					char top = (char) stack.top();
					if (top == '[') {
						stack.pop();
					} else {
						return false;
					}
				}
			} else if (str.charAt(i) == ')') {
				if (stack.isEmpty()) {
					return false;
				} else {
					char top = (char) stack.top();
					if (top == '(') {
						stack.pop();
					} else {
						return false;
					}
				}
			} else if (str.charAt(i) == '}') {
				if (stack.isEmpty()) {
					return false;
				} else {
					char top = (char) stack.top();
					if (top == '{') {
						stack.pop();
					} else {
						return false;
					}
				}
			} else {

			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
