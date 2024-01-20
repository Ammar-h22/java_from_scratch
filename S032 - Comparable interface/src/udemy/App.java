package udemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Person other) {
		return this.age - other.age;
	}

	@Override
	public String toString() {
		return name + "(" + age + ")";
	}

}

public class App {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();
		people.add(new Person("Ammar", 21));
		people.add(new Person("Ali", 14));
		people.add(new Person("Mufaddal", 17));
		people.add(new Person("Lubaina", 25));

		System.out.println("List before sorting: " + people);
		Collections.sort(people);
		System.out.println("List after sorting: " + people);

	}
}

// Note:
// The Comparable interface is a part of the Java Collection Framework and is 
// used to order or sort objects of a class that implements it. The Comparable
// interface defines a single method compareTo() that compares the current object 
// with the object passed as a parameter.
