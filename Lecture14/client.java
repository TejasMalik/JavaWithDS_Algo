package Lecture14;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		try {
			list.addFirst(10);
			list.addLast(20);
			list.addLast(50);
			list.addAt(5, 0);
			list.addAt(30, 3);
			list.addAt(35, 4);
			list.addAt(40, 5);
			list.addLast(60);
			list.display();
			System.out.println(list.getFirst());
			System.out.println(list.getLast());
			System.out.println(list.getAt(3));

			list.removeFirst();
			list.display();

			list.removeAt(3);
			list.display();

			list.removeLast();
			list.display();

			// list.reversePR();
			// list.display();
			System.out.println(list.KthNodeFromEnd(7));
			System.out.println("Inside Try block");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("Java");
		System.out.println(list.mid());
	}

}
