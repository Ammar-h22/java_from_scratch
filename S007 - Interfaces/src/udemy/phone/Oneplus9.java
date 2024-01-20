package udemy.phone;

public class Oneplus9 implements Phone {

	@Override
	public String processor() {
		return "Snapdragon 888";
	}

	@Override
	public String OS() {
		return "Android";
	}

	@Override
	public int spaceInGB() {
		return 64;
	}

}
