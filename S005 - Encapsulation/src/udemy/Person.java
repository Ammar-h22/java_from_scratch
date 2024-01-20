package udemy;

public class Person {
	private String name;
	private int age;
	private String gender;

	public Person() {
		name = "John";
		age = 25;
		gender = "Male";
	}

	public Person(String name, int age, String gender) {

		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

}

/*
 * Note: 
 * We can also set a particular condition in the "setters" method: 
 * For example:
 * 
 * public boolean setAge(int age) { 
 *    if(age >0 && age<100) 
 *       this.age = age; 
 *       return true; 
 *    else 
 *       return false; }
 */
