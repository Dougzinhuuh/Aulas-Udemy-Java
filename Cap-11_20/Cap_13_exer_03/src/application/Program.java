package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String Name = sc.next();
		sc.nextLine();
		System.out.print("Email: ");
		String Email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date Birth = sdf.parse(sc.next());
		Client client = new Client(Name, Email, Birth);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String Status = sc.next();
		Order order = new Order(new Date(), OrderStatus.valueOf(Status), client);
		
		System.out.print("How many items to this order? ");
		int x = sc.nextInt();
		for (int i = 1; i <= x ; i++) {
			System.out.println("Enter #"+ i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem orderitem = new OrderItem(quantity, productPrice, product);
			
			order.addItem(orderitem);
						
		}
		
		
		System.out.println(order);
		
		sc.close();

	}

}
