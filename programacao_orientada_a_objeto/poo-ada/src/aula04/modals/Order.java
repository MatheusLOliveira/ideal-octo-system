package aula04.modals;

import java.util.ArrayList;
import java.util.Objects;

public class Order  {

    public static Integer lastNumberOrder = 0;
    private Integer numberOrder;
    private Client client;
    private Restaurant restaurant;
    private String addressToDelivery;
    private ArrayList<Plate> plates;

    public Order(Client client, Restaurant restaurant, String addressToDelivery, ArrayList<Plate> plates) {
        this.numberOrder = lastNumberOrder++;
        this.client = client;
        this.restaurant = restaurant;
        this.addressToDelivery = addressToDelivery;
        this.plates = plates;
    }

    public Integer getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(Integer numberOrder) {
        this.numberOrder = numberOrder;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String getAddressToDelivery() {
        return addressToDelivery;
    }

    public void setAddressToDelivery(String addressToDelivery) {
        this.addressToDelivery = addressToDelivery;
    }

    public ArrayList<Plate> getPlates() {
        return plates;
    }

    public void setPlates(ArrayList<Plate> plates) {
        this.plates = plates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(numberOrder, order.numberOrder) && Objects.equals(client, order.client) && Objects.equals(restaurant, order.restaurant) && Objects.equals(plates, order.plates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOrder, client, restaurant, plates);
    }

    @Override
    public String toString() {
        return "Order:" +
                "NumberOrder = " + numberOrder + "\n" +
                "Client = " + client + "\n" +
                "Restaurant = " + restaurant + "\n" +
                "Address to Delivery = " + addressToDelivery + '\'' +
                "Plates = " + plates;
    }
}
