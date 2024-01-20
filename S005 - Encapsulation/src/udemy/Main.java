package udemy;

//Note: The very first basics of encapsulation is to hide the information from the outside world.

public class Main {

	public static void main(String[] args) {
		
		Person john = new Person();
		System.out.println(john);
		
//		john.age  = -10;
//		As we can see in the above line that anyone can change the value of the properties very easily
//		because we have set "public" access modifier in the "Person" class, hence because of this reason
//		always note that the very first condition of "Encapsulation" is to set "private" access modifier for 
//		defining the variables(properties).
		System.out.println(john);
//		
		Person teena = new Person("Teena", 21, "Female");
		System.out.println(teena);
		
		teena.setAge(31);  // Hence we can change a particular value of a property using the setters method.
		System.out.println(teena);
	}

}



 