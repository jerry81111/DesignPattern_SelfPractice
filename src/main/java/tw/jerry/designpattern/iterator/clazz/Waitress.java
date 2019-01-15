package tw.jerry.designpattern.iterator.clazz;

import java.util.Iterator;

import tw.jerry.designpattern.iterator.inter.Menu;

public class Waitress {

	Menu pancakeHouseMenu;
	Menu dinnerMenu;
	Menu cafeMenu;

	public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
		this.cafeMenu = cafeMenu;
	}

	public void printMenu() {
		Iterator<MenuItem> pancake = pancakeHouseMenu.createIterator();
		printIterator(pancake);
		Iterator<MenuItem> dinner = dinnerMenu.createIterator();
		printIterator(dinner);
		Iterator<MenuItem> cafe = cafeMenu.createIterator();
		printIterator(cafe);
	}

	private void printIterator(Iterator<MenuItem> iter) {
		while (iter.hasNext()) {
			MenuItem menuItem = iter.next();
			System.out.println(menuItem.toString());
		}
	}

}
