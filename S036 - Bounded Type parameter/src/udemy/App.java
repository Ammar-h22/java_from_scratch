package udemy;

class Data<K extends Integer, V extends String> {
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

	public <E extends Character, N extends Number> void display(E element, N number) {
		System.out.println("Element: " + element + ", Number: " + number);
	}
}

public class App {

	public static void main(String[] args) {

		Data<Integer, String> d1 = new Data<Integer, String>(20133, "DSA");
		System.out.println(d1); // Using toString method
		d1.display('$', 241); // Using generic method
		System.out.println("Key is " + d1.getKey() + " and value is " + d1.getValue());
		// Using getters method
	}

}

// In Java, bounded type parameters are a way of specifying restrictions on the types that
// can be used as arguments for a generic class or method. By using a bounded type parameter,
// you can ensure that only certain types of objects can be passed to the generic class or method.
// Bounded type parameters are declared using the "extends" keyword.

// As we can see in the 'display' method, the type parameter 'N' is bounded by the Number 
// class, which is a superclass of all numeric types in Java (such as Integer, Double, etc.)
// This means that we can use any number type for this parameter, but we can't use it
// with any other type of object.
// Similarly, the type parameter 'E' is bounded with Character.
// And similarly, specific restrictions we have applied on the type parameter 'K' & 'V' 
// of the class 'Data'.

