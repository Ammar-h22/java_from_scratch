package udemy;
	
import udemy.phone.*;
public class Main {

	public static void main(String[] args) {
		
//		Phone p1 = new Iphone13();
		Phone p1 = new Oneplus9();
		System.out.println("Processor is: "+ p1.processor());
		System.out.println("Operating system is: "+ p1.OS());
		
	}

}

