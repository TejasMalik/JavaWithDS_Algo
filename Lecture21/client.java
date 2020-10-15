package Lecture21;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie trie = new Trie();
		trie.add("art");
		trie.add("arts");
		trie.add("see");
		trie.add("sea");
		trie.add("seen");
		trie.add("boy");
		trie.add("bug");
		trie.add("amit");

		trie.display();

		trie.displayAsTree();

		trie.remove("art");
		trie.remove("arts");
		System.out.println("**********************");
		trie.displayAsTree();

		trie.display();

	}

}
