// Another example of Comparator:
// In this example we are sorting names according to their length:
package udemy;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Names<K, V> {
	private K key;
	private V value;

	public Names(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Names [key=" + key + ", value=" + value + "]";
	}
}

public class App4 {

	public static void main(String[] args) {

		Comparator<Names<String, String>> COMPARE_NAME_LENGTH = new Comparator<>() {

			@Override
			public int compare(Names<String, String> obj1, Names<String, String> obj2) {

				if (obj1.getValue().length() < obj2.getValue().length()) {
					return -1;
				} else if (obj1.getValue().length() > obj2.getValue().length()) {
					return 1;
				} else {
					return 0;
				}
			}

		};

		Set<Names<String, String>> info = new TreeSet<>(COMPARE_NAME_LENGTH);
		info.add(new Names<>("Female", "Ed"));
		info.add(new Names<>("Male", "Ammar"));
		info.add(new Names<>("Male", "Ali"));
		info.add(new Names<>("Female", "Lubaina"));

		for (Names<String, String> i : info) {
			System.out.println(i);
		}
	}

}
