package Lecture16;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 50 3 18 2 63 0 21 0 24 0 39 1 84 0
		GenericTree tree = new GenericTree();
		tree.display();
		// System.out.println(tree.size2());
		//
		// System.out.println(tree.max());
		// System.out.println(tree.height());
		// System.out.println(tree.find(41));
		// System.out.println("****************");
		// tree.mirror();
		// tree.display();

		tree.printAtlevel(2);
	}

}
