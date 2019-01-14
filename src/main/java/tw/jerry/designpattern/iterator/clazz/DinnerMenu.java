package tw.jerry.designpattern.iterator.clazz;

import java.util.Iterator;

public class DinnerMenu {

	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public DinnerMenu() {
		this.menuItems=new MenuItem[MAX_ITEMS];
		addItem("dinner one", "one", false, 111);
		addItem("dinner two", "two", false, 222);
		addItem("dinner three", "three", false, 333);
		addItem("dinner four", "four", false, 444);
	}

	public void addItem(String name, String description, boolean vegetarian, int price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("Sorry, the menu is full");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}

	public Iterator<MenuItem> createIterator() {
		return new DinnerMenuIterator(menuItems);
	}

	
}
