package udemy;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Information<T> { // Generic class
	private T info;

	public Information(T info) {
		this.info = info;
	}

	public T getInfo() {
		return info;
	}

	@Override
	public String toString() {
		return "Information [info=" + info + "]";
	}
}

public class App2 {

	public static void main(String[] args) {

		List<Information<Object>> people = new LinkedList<>();
		people.add(new Information<Object>("Ammar "));
		people.add(new Information<Object>(12.22));
		people.add(new Information<Object>(50));
		people.add(new Information<Object>('*'));
		people.add(new Information<Object>(14.6f));

// Or, we can also add a particular data-type restriction to the generic class, by
// simply just changing one name:
		List<Information<Integer>> marks = new LinkedList<>();
		marks.add(new Information<Integer>(78));
		marks.add(new Information<Integer>(84));
		marks.add(new Information<Integer>(50));
		marks.add(new Information<Integer>(49));
		marks.add(new Information<Integer>(92));

		App2 a1 = new App2();
		a1.display1(people);
		System.out.println("*****************");
		a1.display2(marks);
	}

	void display1(List<Information<Object>> l) {
		ListIterator<Information<Object>> itr = l.listIterator();
		while (itr.hasNext()) {
			System.out.println("Info: " + itr.next().getInfo());
		}
	}

	void display2(List<Information<Integer>> l) {
		ListIterator<Information<Integer>> itr = l.listIterator();
		while (itr.hasNext()) {
			System.out.println("Marks: " + itr.next().getInfo());
		}
	}

}

// This type of approach of avoiding type-casting and making use of generic class
// for creating different Lists is recommended in the corporate industry.

// Because by this approach the processing time is reduced and we get compile time
// errors & not run-time errors, which is a good thing (To get the errors before
// the program execution.)
