
public class Product {
	
	private String description = null;
	private int quantity = 0;
	private double cost = 0;
	
	public Product() {
		
	}
	
	public Product(String description, int quantity, double cost) {
		this.description = description;
		this.quantity = quantity;
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		String co = cost + "";
		co.trim().replaceAll(".", ",");
		this.cost = Double.parseDouble(co);
	}
	
	
}
