package udemy;

import udemy.laptop.Laptop;
import udemy.laptop.components.*; // This will include both Processor class and GraphicsCard class.

public class Main {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
//		System.out.println(l1);
		
		System.out.println(l1.getKeyboard());
		System.out.println(l1.getProcessor().getBrand());
		System.out.println(l1.getGraphicsCard().getSeries());
		
		
		
		Processor p1 = new Processor("Ryzen", "4800H", 7, 12, 8, "6MB", "2.5Ghz", "2.3Ghz", "3.1Ghz");
		GraphicsCard g1 = new GraphicsCard("Nvidia", 1080, "6GB");
		Laptop gamingLaptop = new Laptop(17f, p1, "DDR5", "2TB", g1, null, "RGB");
		System.out.println(gamingLaptop);
		
		System.out.println(gamingLaptop.getProcessor().getFrequency());
		System.out.println(gamingLaptop.gamingMode());
		System.out.println(gamingLaptop.getProcessor().getFrequency());
	}

}
