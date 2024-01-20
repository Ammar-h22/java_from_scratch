package udemy;

import java.util.ArrayList;
import java.util.List;

class Data { // Normal class

	public <E> void displayList(List<E> listData) // Generic method (List of elements)
	{
		for (E element : listData) {
			System.out.println(element);
		}
	}

	public <E> void displayArray(E[] arrayData) // Generic method (Array of elements)
	{
		for (E elements : arrayData) {
			System.out.println(elements);
		}
	}
}

public class App {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(201);
		list1.add(202);
		list1.add(203);
		list1.add(204);
		list1.add(205);
		Data d1 = new Data();
		d1.displayList(list1);

		List<String> list2 = new ArrayList<>();
		list2.add("Maths");
		list2.add("Physics");
		list2.add("Chemistry");
		list2.add("Biology");
		list2.add("Geography");
		d1.displayList(list2);

		String[] names = { "Ali", "Raj", "Ammar", "Lubaina" };
		d1.displayArray(names);

		Integer[] marks = { 67, 87, 88, 76 };
		d1.displayArray(marks);

	}

}

// Note:
// 1) In Java, a generic method is a method that is declared with one or more type 
//    parameters, allowing it to operate on objects of different types. 
// 2) The use of generic methods can lead to more versatile and reusable code, as
//    they allow us to write methods that can work with multiple types of objects, 
//    rather than just a single specific type.
// 3) So as we can see that we can create various Lists of any type and by just making
//    one generic method we can easily display each and every type of Lists without 
//    any tension. And same goes for Array as-well.

