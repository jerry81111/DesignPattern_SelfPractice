package tw.jerry.designpattern.iterator.inter;

import java.util.Iterator;

import tw.jerry.designpattern.iterator.clazz.MenuItem;

public interface Menu {

	public Iterator<MenuItem> createIterator();
}
