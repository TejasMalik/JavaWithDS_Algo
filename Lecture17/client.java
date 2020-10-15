package Lecture17;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 50 true 25 true 14 false false true 11 false false true 18 true 31 false false true 84 false false
		BinaryTree tree = new BinaryTree();
		tree.display();

		System.out.println(tree.size2());
		System.out.println(tree.height());
		System.out.println(tree.max());

		tree.preOrder();
		tree.inOrder();
		tree.postOrder();

		System.out.println(tree.lca(14, 11));
		
		System.out.println(tree.isbst());
		tree.levelOrder();
		
		tree.preOrderIterative();

	}

}
