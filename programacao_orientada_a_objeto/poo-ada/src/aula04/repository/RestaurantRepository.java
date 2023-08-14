package aula04.repository;

import aula04.modals.Client;
import aula04.modals.Plate;
import aula04.modals.Restaurant;

import java.util.ArrayList;

public class RestaurantRepository {

    private ArrayList<Restaurant> restaurantsData;

    public RestaurantRepository() {
        this.restaurantsData = new ArrayList<Restaurant>();
    }

    public void addRestaurant(String name, String address, ArrayList<Plate> platesAvaiable) {
        restaurantsData.add(new Restaurant(name, address));
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurantsData.add(restaurant);
    }

    public void removeRestaurant(Restaurant restaurant) {
        restaurantsData.remove(restaurant);
    }

    public Restaurant getRestaurant(Integer idenfiticator, String name) {
        for (Restaurant restaurant : restaurantsData) {
            if (restaurant.getIdentificator().equals(idenfiticator) && restaurant.getName().equals(name)) {
                return restaurant;
            }
        }
        return null;
    }

    public ArrayList<Restaurant> getAllRestaurants() {
        return new ArrayList<>(restaurantsData);
    }
}
