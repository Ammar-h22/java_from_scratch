package udemy;

class Data<T extends Comparable<T>> implements Comparable<T> {
	private T v1;

	public Data(T v1) {
		this.v1 = v1;
	}

	public T getV1() {
		return v1;
	}

	@Override
	public String toString() {
		return "Data [v1=" + v1 + "]";
	}

	public int compareTo(T v2) {
		return v1.compareTo(v2);
	}

}

public class App {

	public static void main(String[] args) {

		Data<Integer> d1 = new Data<>(1);
		System.out.println(d1.compareTo(3));

	}

}
