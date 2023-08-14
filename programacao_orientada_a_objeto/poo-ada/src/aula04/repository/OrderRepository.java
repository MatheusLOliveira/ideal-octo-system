package aula04.repository;

import aula04.modals.Client;
import aula04.modals.Order;
import aula04.modals.Restaurant;

import java.util.ArrayList;

public class OrderRepository {

    private ArrayList<Order> orders;

    public void addOrder(Client client, Restaurant restaurant) {
        orders.add(new Order(client, restaurant));
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public Order getOrder(Integer numberOrder) {
        for (Order order : orders) {
            if (order.getNumberOrder().equals(numberOrder)) {
                return order;
            }
        }
        return null;
    }

    public ArrayList<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }

}
