package udemy;

public class Methods {

	public static void main(String[] args) {
		loop(1, 10);
		loop(11, 20);
		areaOfRectangle(5.4d, 3.2d);
		System.out.println("Volume of rectangle is " + volume(6.2d, 3.6d, 5.1d));
		System.out.println("Volume of cylinder is " + volume(2.2d, 4.1d));
		System.out.println("Volume of square is " + volume(3.7d));
		System.out.println("Volume of square is " + volume(7));
		System.out.println("Sum of two int entities are " + sum(4, 8));
		System.out.println("Sum of one int & one float entity is " + sum(4, 8.4f));
		System.out.println("Sum of two double entities are " + sum(4.2d, 8.7d));
		System.out.println("Sum of three int entities are " + sum(4, 8, 5));
	}

	public static void loop(int initialValue, int finalValue) {
		for (int i = initialValue; i <= finalValue; i++) {
			System.out.println(i);
		}
	}

	public static void areaOfRectangle(double length, double breadth) {
		System.out.println("Area of Rectangle is " + length * breadth);
	}

// Method overloading:
	public static double volume(double length, double width, double height) {
		return length * width * height;
	}

	public static double volume(double radius, double height) {
		return 3.14 * radius * radius * height;
	}

	public static double volume(double side) {
		return side * side * side;
	}

	public static int volume(int side) {
		return side * side * side;
	}

//	Another example on method overloading:
	public static int sum(int x, int y) {
		return x + y;
	}

	public static float sum(int x, float y) {
		return x + y;
	}

	public static double sum(double x, double y) {
		return x + y;
	}

	public static int sum(int x, int y, int z) {
		return x + y + z;
	}
}
