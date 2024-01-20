package udemy;

import udemy.shop.Door;

public class Shop {

	public static void main(String[] args) {
		Door d1 = new Door ();
		d1.shopStatus();
		d1.getLock().setLock(false);
		d1.shopStatus();
	}

}
