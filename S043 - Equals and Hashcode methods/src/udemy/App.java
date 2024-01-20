package udemy;

import java.util.Objects;

class Code {
	private String var1;

	public Code(String var1) {
		this.var1 = var1;
	}

	public String getVar1() {
		return var1;
	}

	@Override
	public String toString() {
		return "Code [var1=" + var1 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(var1);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		return Objects.equals(var1, other.var1);
	}
}

public class App {

	public static void main(String[] args) {

//		Creating 2 objects of String classes and comparing them: 
		String s1 = new String("Ammar");
		String s2 = new String("Ammar");
		System.out.println("s1 HashCode:" + s1.hashCode() + ", s2 HashCode:" + s2.hashCode());
		System.out.println(s1.equals(s2));

//		Now creating 2 objects of custom class and let's compare them:
		Code c1 = new Code("Ammar");
		Code c2 = new Code("Ammar");
		System.out.println("c1 HashCode:" + c1.hashCode() + ", c2 HashCode:" + c2.hashCode());
		System.out.println(c1.equals(c2));

	}

}

// Note:
// Now as we can see in the above example, if we create 2 objects of String class with the 
// same value and compare them with .equals() method then the output will be true.
// But if we create 2 objects of our own custom class with the same value and compare them
// with .equals() method then the output will be false.
// So why it is like that?
// Because as String class is already defined by java, it already contains the 'equals' method
// and the 'hashCode' method in it. 
// Hence while creating a custom class, we need to add the equals method and hashCode method
// if we want to compare the objects in case of strings.
