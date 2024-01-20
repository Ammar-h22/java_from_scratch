package udemy.shop;

public class Door {

	private Lock l1; // Here, this "l1" is the object of "Lock" class.

	public Door() { // Default constructor
		l1 = new Lock(true);
	}

	public Lock getLock() { // Getters method
		return l1;
	}

	public void shopStatus() {
		if (l1.isLock()) {
			System.out.println("Shop is closed, please visit later!");
		} else {
			System.out.println("Welcome, Shop is open!");
		}
	}

	public class Lock { // This is inner class (Because the "Lock" class is created inside the "Door" class)
		private boolean lock; // Here, this "lock" is the local variable in "Lock" class.

		public Lock(boolean lock) { // Parameterized constructor
			this.lock = lock;
		}

		public void setLock(boolean lock) // Setters method
		{
			this.lock = lock;
		}

		public boolean isLock() // Getters method
		{
			return lock;
		}

	}

}

// Note:
// Inner classes are of multiple types, but the most useful type of the inner class is "Non-static" inner class.
// Precisely, the above implementation is the "member inner class".
// 
// Important note:
// "Nested class" is divided into 2 categories:
// 1) Static nested class
// 2) Non-static nested class
// Then the "static" nested class is further not divided.
// But the "non-static" nested class is further divided into 3 different categories:
// 1) Member inner class
// 2) Local inner class
// 3) Anonymous inner class
// The "non-static" class is also called as inner class.

// For proper flowchart refer the video no.94 of section 10.

// Advantages of inner class are:
// 1) Better real life depiction.
// 2) Inner class could be used only by outer class.
// 3) Easy access, as inner object is implicitly available inside outer object.





  