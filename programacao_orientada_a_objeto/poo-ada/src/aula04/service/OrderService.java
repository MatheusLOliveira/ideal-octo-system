package aula04.service;

import aula04.modals.Client;
import aula04.modals.Order;
import aula04.modals.Plate;
import aula04.modals.Restaurant;
import aula04.repository.ClientRepository;
import aula04.repository.OrderRepository;
import aula04.repository.RestaurantRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderService {

    private OrderRepository orderRepository;
    private RestaurantRepository restaurantRepository;
    private ClientRepository clientRepository;

    public OrderService(OrderRepository orderRepository, RestaurantRepository restaurantRepository, ClientRepository clientRepository) {
        this.orderRepository = orderRepository;
        this.restaurantRepository = restaurantRepository;
        this.clientRepository = clientRepository;
    }

    public void addOrder(Client client, Restaurant restaurant, String addressToDelivery, ArrayList<Plate> plates) {
        orderRepository.addOrder(client, restaurant, addressToDelivery, plates);
    }

    public void addOrder(Order order) {
        orderRepository.addOrder(order);
    }

    public void removeOrder(Order order) {
        orderRepository.removeOrder(order);
    }

    public Order getOrder(Integer numberOrder) {
        return orderRepository.getOrder(numberOrder);
    }

    public ArrayList<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    public List<Order> listRestaurantOrders(Integer identificator, String restaurantName) {
        Restaurant restaurant = restaurantRepository.getRestaurant(identificator, restaurantName);

        if (restaurant != null) {
            return orderRepository.getAllOrders().stream().filter(order -> order.getRestaurant().equals(restaurant)).collect(Collectors.toList());
        }
        return null;
    }

    public List<Order> listClientOrders(Integer identificator, String name) {
        Client client = clientRepository.getClient(identificator, name);

        if (client != null) {
            return orderRepository.getAllOrders().stream().filter(order -> order.getClient().equals(client)).collect(Collectors.toList());
        }
        return null;
    }

}
