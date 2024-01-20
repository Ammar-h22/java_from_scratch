package udemy;

public class ExceptionHadlingBasics {
	public static void main(String[] args) {
		
		ExceptionHadlingBasics a1 = new ExceptionHadlingBasics();
		a1.case1(10, 0);
		a1.case1(10, 5);
		a1.case2(12, 0);
		a1.case2(12, 2);
	}

//	In this method we have taken prior precaution that for the division operation 
//	the value of the denominator should not be 0.
	public void case1(int x, int y) {
		if (y != 0) {
			System.out.println("The value of x/y is " + x / y);
		} else {
			System.out.println("The value of y is 0");
		}
	}
	
//	Here we have not taken any kind of prior precaution.
//	But we will implement the try-catch block in this method.
	public void case2(int x, int y) {
		try {			
			System.out.println("The value of x/y is " + x / y);
		}catch(Exception e) {
			System.out.println("The value of y is 0");
		}

	}
}







