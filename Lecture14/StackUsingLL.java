package Lecture14;

public class StackUsingLL {
	private LinkedList list;

	public StackUsingLL() {
		// TODO Auto-generated constructor stub
		this.list = new LinkedList();
	}

	public int size() {
		return this.list.size();
	}

	public boolean isEmpty() {
		return this.list.size() == 0;
	}

	public void push(int data) {
		this.list.addFirst(data);
	}

	public void pop() throws Exception {
		this.list.removeFirst();
	}

	public int top() throws Exception {
		return this.list.getFirst();
	}

	public void display() {
		this.list.display();
	}
}
