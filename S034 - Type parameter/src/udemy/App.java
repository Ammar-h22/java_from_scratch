package udemy;

class Data<K, V> { // Generic class
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

	public <E, N> void display(E element, N number) { // Generic method
		System.out.println("Element:" + element + ", Number:" + number);
	}
}

public class App {

	public static void main(String[] args) {

		Data<Integer, String> d1 = new Data<Integer, String>(241, "Ammar");

//		This will use the "toString" method to print the output
		System.out.println(d1);

//		This will use the "getters" method to print the output
		System.out.println("key:" + d1.getKey() + ", Value:" + d1.getValue());

//		This will use the "Generic" method to print the output
		d1.display("GraphicsCard", 1650);
	}

}

// Note: 
// The naming conventions are as follows: 
// T - type 
// E - Element 
// K - key 
// N - Number 
// V - Value

// Note, it is not necessary that the generic methods should be inside generic class
// only, (it can be anywhere in the program).
