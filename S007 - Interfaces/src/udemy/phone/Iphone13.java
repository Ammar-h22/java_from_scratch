package udemy.phone;

public class Iphone13 implements Phone {

	@Override
// This "override" means that this method is there in the interface "Phone" and it
// is mandatory to define it here as well because this
// class "Iphone" implements "Phone" interface.
	public String processor() {
		return "A15";
	}

	@Override
	public String OS() {
		return "IOS";
	}

	@Override
	public int spaceInGB() {
		return 128;
	}

}
