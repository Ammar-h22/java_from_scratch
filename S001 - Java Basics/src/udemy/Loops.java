package udemy;

public class Loops {

	public static void main(String[] args) {

//		For loop:
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		for (int j = 10; j >= 1; j--) {
			System.out.println(j);
		}

//		Creating infinite loop using for loop:
//		for(;;)
//		{
//			System.out.println("Infinite loop!");
//		}

//		While loop:
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

//		Creating infinite loop using while loop:
//		while(true)
//		{
//			System.out.println("Infinite loop!");
//		}

//		Do-while loop:
		int n = 0;
		do {
			System.out.println(n);
			n++;
		} while (n <= 10);
//		In do-while loop even if the very first condition is false then also atleast one time the 
//		statement will get executed.

//		Initializing 2 variables in loops:
		for (int p = 1, q = 1; p < 10 && q < 10; p++, q++) {
			System.out.println("p = " + p + " and q = " + q);
		}

		int r = 1, s = 1;
		while (r < 10 && s < 10) {
			System.out.println("r = " + r + " and s = " + s);
			r++;
			s++;
		}

		int v = 1, w = 1;
		do {
			System.out.println("v = " + v + " and w = " + w);
			v++;
			w++;
		} while (v <= 10 || w <= 10);

//		break and continue statements:
//		('break' terminates the execution cycle and 'continue' terminates the specific iteration.)
		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
			if (a == 4) {
				break;
			}
		}

		for (int b = 1; b <= 10; b++) {
			if (b == 4) {
				continue;
			}
			System.out.println(b);
		}

//		Nested loops: (Another loop inside a loop)
		for (int c = 1; c <= 10; c++) {
			for (int d = 1; d <= 10; d++) {
				System.out.println("c : d ==> " + c + " : " + d);
			}
			System.out.println("*******************");
		}

		// Note:
		// In Nesting of loops, the complete execution cycle of inner loop is a single
		// iteration for the outer loop.

//		Printing pattern exercise:
		for (int e = 1; e <= 5; e++) {
			for (int f = 1; f <= e; f++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
