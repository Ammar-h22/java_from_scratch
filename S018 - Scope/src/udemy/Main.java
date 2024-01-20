package udemy;

public class Main {

	static int x = 50;
	public int y = 100;

	public static void main(String[] args) {

		System.out.println(x);
		System.out.println(new Main().y);
//		So as we can see that we have done 2 different global variable declarations as the way of 
//		accessing them is also different.

//		We can also create a small scope for a particular variable:
//		Example:
		{
			int a = 12;
			System.out.println(a);
		}

	}

}
