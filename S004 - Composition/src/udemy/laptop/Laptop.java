package udemy.laptop;

import udemy.laptop.components.Processor;
import udemy.laptop.components.GraphicsCard;

public class Laptop {

	private float screen;
	private Processor p1;  // This "p1" is the object of "Processor" class
	private String ram;
	private String hardDrive;
	private GraphicsCard g1;  // This "g1" is the object of "GraphicsCard" class
	private String opticalDrive;
	private String keyboard;

	public Laptop() {
		screen = 15.6f;
		p1 = new Processor();
		ram = "DDR4";
		hardDrive = "2TB";
		g1 = new GraphicsCard();
		opticalDrive = "Multi-layer";
		keyboard = "Backlit";

	}

	public Laptop(float screen, Processor p1, String ram, String hardDrive, GraphicsCard g1,
			String opticalDrive, String keyboard) {
		this.screen = screen;
		this.p1 = p1;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.g1 = g1;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + p1 + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphicsCard=" + g1 + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}

	public float getScreen() {
		return screen;
	}

	public Processor getProcessor() {
		return p1;
	}

	public String getRam() {
		return ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public GraphicsCard getGraphicsCard() {
		return g1;
	}

	public String getOpticalDrive() {
		return opticalDrive;
	}

	public String getKeyboard() {
		return keyboard;
	}
	
//	Adding functionality:
	public String gamingMode()
	{
		p1.setFrequency(p1.getMaxFrequency());
		return "Gaming mode is on";
	}
	
}
