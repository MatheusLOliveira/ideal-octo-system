package aula04.service;

import aula04.modals.Plate;
import aula04.modals.Restaurant;
import aula04.repository.RestaurantRepository;
import aula04.repository.PlateRepository;

import java.util.ArrayList;

public class RestaurantService {

    private RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public void addRestaurant(Restaurant restaurant) {
       restaurantRepository.addRestaurant(restaurant);
    }

    public void addRestaurant(String name, String address) {
       restaurantRepository.addRestaurant(name, address);
    }

    public void removeRestaurant(Restaurant restaurant) {
        restaurantRepository.removeRestaurant(restaurant);
    }

    public void addPlate(Integer identificator, String restaurantName, Plate plate) {
        Restaurant restaurant = restaurantRepository.getRestaurant(identificator, restaurantName);

        if (restaurant != null) {
            restaurant.getPlatesAvaiable().add(plate);
        }
    }

    public void addPlate(Integer identificator, String restaurantName, String name, double price, String description) {
        Restaurant restaurant = restaurantRepository.getRestaurant(identificator, restaurantName);

        if (restaurant != null) {
            restaurant.getPlatesAvaiable().add(new Plate(name, price, description));
        }
    }

    public Restaurant getRestaurant(Integer idenfiticator, String name) {
        return restaurantRepository.getRestaurant(idenfiticator, name);
    }

    public ArrayList<Restaurant> getAllRestaurant() {
        return restaurantRepository.getAllRestaurants();
    }

    public ArrayList<Plate> listAllRestaurantPlates(Integer identificator, String restaurantName) {
        Restaurant restaurant = restaurantRepository.getRestaurant(identificator, restaurantName);

        if (restaurant != null) {
           return restaurant.getPlatesAvaiable();
        }
        return null;
    }
}
