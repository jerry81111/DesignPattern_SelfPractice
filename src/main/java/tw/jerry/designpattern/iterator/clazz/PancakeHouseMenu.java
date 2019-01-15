package tw.jerry.designpattern.iterator.clazz;

import java.util.ArrayList;
import java.util.Iterator;

import tw.jerry.designpattern.iterator.inter.Menu;

public class PancakeHouseMenu implements Menu{

	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		this.menuItems=new ArrayList<MenuItem>();
		addItem("Pancake one", "one", false, 100);
		addItem("Pancake two", "two", false, 14440);
		addItem("Pancake three", "three", false, 20);
		addItem("Pancake four", "four", false, 160);

	}

	public void addItem(String name, String description, boolean vegetarian, int price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

//	public ArrayList<MenuItem> getMenuItems() {
//		return menuItems;
//	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}

}
