package udemy.shop;

public class Door {
	public boolean isLocked(String key) {
		class Lock {
			public boolean isLocked(String key) {
				if (key.equals("qwerty")) {
					return false; // This means that it is false that the door is locked (it is unlocked).
				} else {
					return true; // This means that it is true that the door is locked.
				}
			}

		}
		return new Lock().isLocked(key);
	}

}
