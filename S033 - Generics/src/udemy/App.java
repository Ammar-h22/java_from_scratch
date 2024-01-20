package udemy;

class Data {
	private Object obj;

	public Data(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
}

class GenericClass<T> // This is a Generic class (We can give any name)
{
	private T data; // T symbolizes type
// (Means we are not sure that 'data' variable should be of which data-type, 
// hence we have declared 'T' and by doing this now the variable can be of any data-type)

	public GenericClass(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
}

public class App {

	public static void main(String[] args) {

		Data d1 = new Data("Hello India");
		System.out.println(d1.getObj());
//		We can directly call the getObj but if we want to store the value in a  
//		variable and then print the variable:
		String s = (String) d1.getObj(); // Here we need to do type-casting otherwise
											// it will give error
		System.out.println(s);

//		Creating object of generic class
		GenericClass<String> g1 = new GenericClass<String>("Hello USA");
		String i = g1.getData();
		System.out.println(i);

		GenericClass<Double> g2 = new GenericClass<Double>(250.33);
		Double number = g2.getData();
		System.out.println(number);

	}

}

// Note:
// Generics are a facility of generic programming that were added to java in 2004.
// Advantages of using generic programming is:
// 1) Reusability
// 2) Stronger type checking, better type safety (Reduces Run-time error).
// 3) Eliminates type-casting statements (Improves performance of the program).

// We will not do type-casting in the main method, instead we will specify the 
// data-type while initializing the object, because by doing type-casting more 
// processing time is required and the performance of the application goes down.
// And this we can do by using generic class, Hence this is the advantage of 
// using generic programming.
