import java.util.ArrayList;

public class Transaction {
	
	private Customer customer = null;
	private ArrayList<Product> product = new ArrayList<>();
	private static double amount = 0;
	
	
	public Transaction() {
		
	}
	
	public Transaction(Customer customer) {
		this.customer = customer;
		
	}
	
	public void addProduct(Product product) {
		this.product.add(product);
		
	}
	
	// calculate total amount of invoice
	public double amountOfTransaction() {
		for(Product p: product) {
			this.amount += (p.getQuantity() * p.getCost()); 
		}
		return this.amount/2;
	}

	// invoice Form
	public void printInvoice() {
		System.out.printf("\t%s\n"," - Invoice - ");
		System.out.println("Customer: " + customer.getName() + " - Id:" + customer.getId());
		System.out.println("Billing Address: " + customer.getAddress());
		System.out.println(" ------------------------------- ");
		for(Product p:product) {
			System.out.println(p.getDescription() + " - " + p.getQuantity() + " kgr * " + p.getCost() + " euro = " + p.getCost()*p.getQuantity() + " euro");
		}
		System.out.println(" ------------------------------- ");
		System.out.println("Total amount of invoice: " + amountOfTransaction() + " euro.");
	}
	
	
}
