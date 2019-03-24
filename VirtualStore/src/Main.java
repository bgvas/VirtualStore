import java.util.ArrayList;
import java.util.Scanner;

/**
 * In this app, you can add a customer
 * and as many products as you want
 * and in the end, you take a print of 
 * invoice with the the customers name and address
 * ,the list of products and the total amount 
 * 
 * 
 */


public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Create Customer with entered elements 
		System.out.print("Enter Customer name:");
		String name = input.nextLine();
		System.out.print("Enter Customers code:");
		String code = input.nextLine();
		System.out.print("Enter Customers billing address:");
		String address = input.nextLine();
		Customer customer = new Customer(name,code,address);
		Transaction custom = new Transaction(customer);
				
		// Create the products list 
		boolean end = false;
		System.out.println();
		while(!end) {
			System.out.print("Enter Product name:");
			String prod = input.next();
			System.out.print("Enter quantity:");
			int quantity = input.nextInt();
			System.out.print("Enter cost per unit:");
			String c = input.next();
			c= c.trim().replaceAll(",", ".");
			Double cost = Double.parseDouble(c);
			System.out.println("Do you want to add an other product?(1-Yes/2-No)");
			int add = input.nextInt();
			custom.addProduct(new Product(prod,quantity, cost));
			if(add == 2) {
				end = true;
			}
		}
		
		// calculate the total amount and print invoice
		custom.amountOfTransaction();
		custom.printInvoice();
	}

}
