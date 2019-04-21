package builderPattern;

import java.util.ArrayList;

public class Meal {
	ArrayList<Item> items = new ArrayList<Item>();
	
	public void addItem (Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost = 0;
		for (Item item: items) {
			cost += item.price();
		}
		return cost;
	}
	
	public void showItems() {
		for (Item item: items) {
			System.out.println(item.name());
		}
	}
}
