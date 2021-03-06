package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	
	
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
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

	public List<OrderItem> getItems() {
		return items;
	}

	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
		
	}
	public void removeItem(OrderItem item) {
		items.remove(item);
		
	}
	
	public Double total() {
		double soma = 0;
		for (OrderItem c : items) {
			soma += c.subTotal();
		}
		return soma;
	}

	@Override
	public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMMARY:\n");
        sb.append("Order moment: ").append(sdf.format(getMoment())).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append(client).append("\n");
        sb.append("Order items:\n");
        for(OrderItem item : items){
            sb.append(item).append("\n");
        }
        sb.append("Total price: $").append(total());
        
        return sb.toString();
    }
	
	
	
	
	
	
	

}
