package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> orderitem = new ArrayList<>();
	

	public Order() {
	}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}




	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderitem() {
		return orderitem;
	}
	
	public void addItem(OrderItem item) {
		orderitem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderitem.add(item);
	}
	
	public double total() {
		double total = 0;
		for (OrderItem o: orderitem) {
			total += o.subTotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf2.format(moment) + "\n");
		sb.append("Order Status: " + status + "\n");
		sb.append(client);
		sb.append("\nOrder items: \n\n");
		for (OrderItem o : orderitem) {
		sb.append(o + "\n");
		}
		sb.append("\nTotal price: " + total());
		
		return sb.toString();
	}
	
	
	
	

}
