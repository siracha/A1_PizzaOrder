package thomjade.prog32758.Pizza;

import java.util.ArrayList;

public class Order {
	private ArrayList<Pizza> orders = new ArrayList<Pizza>();

	public ArrayList<Pizza> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Pizza> orders) {
		this.orders = orders;
	}
	
	public void addPizza(Pizza pizza) {
		this.orders.add(pizza);
	}

	@Override
	public String toString() {
		String order = "";
		if(this.orders.isEmpty()) {
			return "empty";
		}
		else {
			for(int i = 0; i < this.orders.size(); i++) {
				order += this.orders.get(i);
				order += "\n";
			}
			return order;
		}
	}
	
	
	
}
