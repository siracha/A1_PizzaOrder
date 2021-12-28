package thomjade.prog32758.Pizza;


public class Pizza {
	private String[] toppings;
	private String size;
	private double price;
	
	public Pizza(String[] toppings, String size) {
		super();
		this.toppings = toppings;
		this.size = size;
//		switch(this.size) {
//		case "S":
//			price += 9.99;
//			break;
//		case "M":
//			price += 12.99;
//			break;
//		case "L":
//			price += 14.99;
//			break;
//		case "XL":
//			price += 19.99;
//			break;
//		}
		if(size == "S") {
			price += 9.99;
		}
		else if(size == "M") {
			price += 12.99;
		}
		else if(size == "L") {
			price += 14.99;
		}
		else if(size == "XL") {
			price += 19.99;
		}
		
		for(int i = 0; i < toppings.length; i++) {
			if(i%4 == 0) continue;
			price += 1;
		}
	}
	
	public double getPrice() {
		return price;
	}

	public Pizza() {
		super();
		this.size = "L";
	}

	public String[] getToppings() {
		return toppings;
	}

	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return size + "pizza \n\t -" + toppings;
	}
	
	
}
