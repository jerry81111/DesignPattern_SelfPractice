package tw.jerry.designpattern.iterator.main;

import tw.jerry.designpattern.iterator.clazz.CafeMenu;
import tw.jerry.designpattern.iterator.clazz.DinnerMenu;
import tw.jerry.designpattern.iterator.clazz.PancakeHouseMenu;
import tw.jerry.designpattern.iterator.clazz.Waitress;
import tw.jerry.designpattern.iterator.inter.Menu;

public class ShowMenu {
	public static void main(String[] args) {

		
		Menu PancakeHouseMenu =new PancakeHouseMenu();
		Menu dinnerMenu = new DinnerMenu();
		Menu cafeMenu = new CafeMenu();
		
		Waitress waitress=new Waitress(PancakeHouseMenu, dinnerMenu,cafeMenu);
		
		waitress.printMenu();
		
		
		
	}
}
