package tw.jerry.designpattern.iterator.main;

import tw.jerry.designpattern.iterator.clazz.DinnerMenu;
import tw.jerry.designpattern.iterator.clazz.PancakeHouseMenu;
import tw.jerry.designpattern.iterator.clazz.Waitress;

public class ShowMenu {
	public static void main(String[] args) {

		
		PancakeHouseMenu PancakeHouseMenu =new PancakeHouseMenu();
		DinnerMenu dinnerMenu = new DinnerMenu();
		
		Waitress waitress=new Waitress(PancakeHouseMenu, dinnerMenu);
		
		waitress.printMenu();
		
		
		
	}
}
