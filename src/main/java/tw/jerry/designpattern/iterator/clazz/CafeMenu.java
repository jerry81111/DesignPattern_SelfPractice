package tw.jerry.designpattern.iterator.clazz;

import java.util.Hashtable;
import java.util.Iterator;

import tw.jerry.designpattern.iterator.inter.Menu;

public class CafeMenu implements Menu {

	Hashtable<String,MenuItem> menuItems=new Hashtable<>();
	
	public CafeMenu() {
		addItem("cafe one", "one", false, 30);
		addItem("cafe two", "two", false, 40);
		addItem("cafe three", "three", false, 50);
	}
	
	
	public void addItem(String name, String description, boolean vegetarian, int price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(),menuItem);
	}
	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}

}
