package ch15_3;

import java.util.*;

public interface Queue {
	
	void enQueue(String title);
	String deQueue();
	
	int getSize();
	ArrayList<String> getShelf();
	
}
