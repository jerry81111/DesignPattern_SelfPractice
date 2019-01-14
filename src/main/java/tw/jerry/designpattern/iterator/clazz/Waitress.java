package tw.jerry.designpattern.iterator.clazz;

import java.util.Iterator;

public class Waitress {

	PancakeHouseMenu pancakeHouseMenu;
	DinnerMenu dinnerMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
	}
	
	public void printMenu(){
		Iterator<MenuItem> pancake= pancakeHouseMenu.createIterator();
		printIterator(pancake);
		Iterator<MenuItem> dinner= dinnerMenu.createIterator();
		printIterator(dinner);
	}
	
	private void printIterator(Iterator<MenuItem> iter) {
		while(iter.hasNext()) {
			MenuItem menuItem = iter.next();
			System.out.println(menuItem.toString());
		}
	}
	
	
	
}
