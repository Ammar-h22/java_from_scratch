package udemy;

public class Demo {

	public static void main(String[] args) {

		Learning learn = Learning.GENERICS;   // "learn" is the object of enumerated type
		switch (learn) {
		case COREJAVA:
			System.out.println("Step 1: Learning Core Java");
			break;
		case COLLECTIONS:
			System.out.println("Step 2: Learning collections framework");
			break;
		case GENERICS:
			System.out.println("Step 3: Learning Generics");
			break;
		case JSPANDSERVLETS:
			System.out.println("Step 4: Learning JSP and Servlets");
			break;
		case MULTITHREADING:
			System.out.println("Step 5: Learning Multithreading");
			break;
		default:
			System.out.println("Element not in the enumerated list");
			break;

		}
	}

}
