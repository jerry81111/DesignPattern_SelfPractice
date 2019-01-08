package tw.jerry.designpattern.decorate.abstractclazz;

public abstract class Beverage {

	public String description="unknow beverage";

	public String getDescription() {
		return description;
	}
	
	public abstract int cost();
}
