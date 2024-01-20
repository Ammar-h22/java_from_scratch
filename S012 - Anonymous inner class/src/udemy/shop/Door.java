package udemy.shop;

public class Door {
	private Lock l1 = new Lock() {

		@Override
		public boolean isUnlocked(String keyCode) {
			if (keyCode.equals("qwerty")) {
				return true;
			} else {
				return false;
			}
		}
	};

	public Lock getL1() {
		return l1;
	}

}

// Note:
// 1) Anonymous means nameless.
// 2) Anonymous object is used whenever we want to use the object only once.
// 3) We can write anonymous object in this way, Instead of writing "object_name.method_name()" we 
//    write "new class_name().method_name()".
// 3) Also note that, there cannot be 2 public classes in the same file in java. 
// And if there are two public classes in the same file, then there are 2 solutions for that:
// I) Bring all the files in one single package.
// II) Or if we don't want to bring all the files in one package then we can cut one of the public 
//    class from that file which contains 2 public classes and we can create a class in another file.





