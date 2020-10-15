package Lecture19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Russia", 175);
		map.put("India", 300);
		map.put("USA", 200);
		map.put("RSA", 150);
		map.put("China", 350);
		map.put("Japan", 125);
		System.out.println(map);

		map.put("India", 325);
		System.out.println(map);

		System.out.println(map.size());

		System.out.println(map.get("India"));
		System.out.println(map.get("UK"));

		System.out.println(map.remove("UK"));
		System.out.println(map);

		System.out.println(map.containsKey("India"));

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}

		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}

		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}

		String str = "abbcddefggb";
		System.out.println(getMaxFreq(str));
	}

	public static char getMaxFreq(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (map.containsKey(cc)) {
				int ov = map.get(cc);
				ov = ov + 1;
				map.put(cc, ov);
			} else {
				map.put(cc, 1);
			}
		}
		System.out.println(map);
		char maxChar = '\0';
		int maxFreq = 0;
		Set<Map.Entry<Character, Integer>> entries = map.entrySet();
		for (Map.Entry<Character, Integer> entry : entries) {
			if (entry.getValue() > maxFreq) {
				maxChar = entry.getKey();
				maxFreq = entry.getValue();
			}
		}
		return maxChar;
	}

}
