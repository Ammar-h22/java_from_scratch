package udemy;

public class App {

	public static void main(String[] args) {

		String v1 = "c";
		String v2 = "b";
		System.out.println(v1.compareTo(v2));

//		This will not work:
//		int i1 = 1;
//		int i2 = 2;
//		System.out.println(i1.compareTo(i2));

//		We need to make use of Wrapper classes instead of primitive data-types:
		Integer i1 = 2;
		Integer i2 = 2;
		System.out.println(i1.compareTo(i2));

	}

}

// Note:
// In compareTo method (v1.compareTo(v2)):
// 1) If the value of v1 & v2 is same then the method will return "0";
// 2) If the value of v1 is greater then value of v2 then the method will return "1";
// 3) If the value of v1 is smaller then value of v2 then the method will return "-1";

// Also note that the compareTo method does not work with the variables, it only
// works with the objects. 
// Hence we have to always use the classes if we want to make use of compareTo method.
// (We cannot use primitive data-types with compareTo method)
