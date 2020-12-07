package amrib.hashtable;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// Key: Employee number (Integer)
		// Value: Name (String)
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Bilal");
		map.put(2, "Amri");
		map.put(3, "John");
		map.put(3, "Salim");
		map.put(4, null);
		map.put(null, null);
		map.remove(null);
		var value = map.get(2);
		System.out.println(value);
		System.out.println(map);

		for (var item : map.keySet()) {
			System.out.println(item);
		}
		for (var item : map.entrySet()) {
			System.out.println(item);
		}
	}

}
