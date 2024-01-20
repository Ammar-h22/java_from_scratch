// Custom sorting using Comparator:

package udemy;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Data<K, V> {
	private K key;
	private V value;

	public Data(K key, V value) {
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
		return "Data [key=" + key + ", value=" + value + "]";
	}
}

public class App3 {

	public static void main(String[] args) {

		Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<>() {

			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				
				if (obj1.getKey() < obj2.getKey()) {
					return -1;
				} else if (obj1.getKey() > obj2.getKey()) {
					return 1;
				} else {
					return 0;
				}
			}

		};

//		Set<Data<Integer, String>> info = new HashSet<>();  // This will work
//		Set<Data<Integer, String>> info = new LinkedHashSet<>(); // This will work

		Set<Data<Integer, String>> info = new TreeSet<>(COMPARE_KEY); // This will not work
//		Because as TreeSet sorts the elements before displaying them, and here natural   
//		sorting is not possible because of two parameters, so here we need to make
//		use of "comparator" for making our own custom sorting.

		info.add(new Data<>(1, "One"));
		info.add(new Data<>(2, "Two"));
		info.add(new Data<>(9, "Nine"));
		info.add(new Data<>(4, "Four"));
		info.add(new Data<>(7, "Seven"));
		info.add(new Data<>(5, "Five"));

		for (Data<Integer, String> i : info) {
			System.out.println(i);
		}
	}

}

// Note:
// There would be a confusion that why aren't we making use of the comparable interface
// for making custom sorting, like we use to do before.

// So in the current scenario as there are two parameters (Key, Value), we cannot 
// use 'comparable' because comparable interface is not capable of handling more than entity.
// Hence here we will make use of "Comparator" which can multiple parameters/entities
// for making our own custom algorithms.
