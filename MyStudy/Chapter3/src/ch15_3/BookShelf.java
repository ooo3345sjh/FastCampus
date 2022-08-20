package ch15_3;

import java.util.*;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

	@Override
	public ArrayList<String> getShelf() {
		return super.getShelf();
	}

}
