package Lecture19;

public class HashtableClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashTable<String, Integer> map = new HashTable<>(4);

		map.put("Russia", 175);
		map.put("India", 300);
		map.put("USA", 200);
		map.display();
		map.put("RSA", 150);
		map.put("China", 350);
		map.display();
		map.put("Japan", 125);

		map.display();

		map.put("Nepal", 50);
		map.display();

		// System.out.println(map.get("UK"));
		// System.out.println(map.remove("USA"));
		// map.display();
	}

}
