package Lecture17;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	Node root;
	int size;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, false);
	}

	private Node takeInput(Scanner s, Node parent, boolean isLeftOrRight) {
		if (parent == null) {
			System.out.println("Enter data for root node");
		} else {
			if (isLeftOrRight) {
				System.out.println("Enter the data for left child of " + parent.data);
			} else {
				System.out.println("Enter the data for right child of " + parent.data);
			}
		}

		int nodeData = s.nextInt();
		Node node = new Node(nodeData, null, null);
		this.size++;

		boolean choice = false;
		System.out.println("Do you have left child for " + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.left = this.takeInput(s, node, true);
		}
		System.out.println("Do you have right child for " + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.right = this.takeInput(s, node, false);
		}

		return node;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + "=>");
		} else {
			System.out.print("END=>");
		}
		System.out.print(node.data);
		if (node.right != null) {
			System.out.print("<=" + node.right.data);
		} else {
			System.out.print("<=END");
		}
		System.out.println();
		if (node.left != null) {
			this.display(node.left);
		}
		if (node.right != null) {
			this.display(node.right);
		}
	}

	public int size2() {
		return this.size2(this.root);
	}

	private int size2(Node node) {
		if (node == null) {
			return 0;
		}

		int lsize = this.size2(node.left);
		int rsize = this.size2(node.right);

		return lsize + rsize + 1;
	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
		int lheight = this.height(node.left);
		int rheight = this.height(node.right);

		return Math.max(lheight, rheight) + 1;
	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}

		int lmax = this.max(node.left);
		int rmax = this.max(node.right);

		return Math.max(node.data, Math.max(lmax, rmax));
	}

	public void preOrder() {
		this.preOrder(this.root);
		System.out.println();
	}

	private void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		this.preOrder(node.left);
		this.preOrder(node.right);
	}

	public void inOrder() {
		this.inOrder(this.root);
		System.out.println();
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}

		this.inOrder(node.left);
		System.out.print(node.data + " ");
		this.inOrder(node.right);
	}

	public void postOrder() {
		this.postOrder(this.root);
		System.out.println();
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}

		this.postOrder(node.left);

		this.postOrder(node.right);
		System.out.print(node.data + " ");
	}

	public int lca(int d1, int d2) {
		return this.lca(this.root, d1, d2).data;
	}

	private Node lca(Node node, int d1, int d2) {
		if (node == null) {
			return null;
		}
		if (node.data == d1 || node.data == d2) {
			return node;
		}

		Node llca = this.lca(node.left, d1, d2);
		Node rlca = this.lca(node.right, d1, d2);
		if (llca != null && rlca != null) {
			return node;
		} else if (llca == null) {
			return rlca;
		} else if (rlca == null) {
			return llca;
		} else {
			return null;
		}
	}

	public boolean isbst() {
		return this.isbst(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isbst(Node node, int min, int max) {
		if (node == null) {
			return true;
		}
		if (node.data < min || node.data > max) {
			return false;
		}
		if (!isbst(node.left, min, node.data)) {
			return false;
		}
		if (!isbst(node.right, node.data, max)) {
			return false;
		}
		return true;
	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(this.root);
		while (!queue.isEmpty()) {
			Node rv = queue.remove();
			System.out.print(rv.data + " ");
			if (rv.left != null) {
				queue.add(rv.left);
			}

			if (rv.right != null) {
				queue.add(rv.right);
			}

		}
	}

	public void preOrderIterative() {
		LinkedList<Node> stack = new LinkedList<>();
		stack.add(this.root);
		while (!stack.isEmpty()) {
			Node rv = stack.removeFirst();
			System.out.print(rv.data + " ");
			if (rv.right != null) {
				stack.addFirst(rv.right);
			}
			if (rv.left != null) {
				stack.addFirst(rv.left);
			}

		}
	}

}
