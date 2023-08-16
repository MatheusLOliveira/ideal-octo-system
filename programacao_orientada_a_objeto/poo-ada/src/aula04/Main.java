package aula04;

import aula04.controller.MenuController;
import aula04.repository.ClientRepository;
import aula04.repository.OrderRepository;
import aula04.repository.PlateRepository;
import aula04.repository.RestaurantRepository;
import aula04.service.ClientService;
import aula04.service.OrderService;
import aula04.service.RestaurantService;

public class Main {

    public static void main(String[] args) {
        ClientRepository clientRepository = new ClientRepository();
        OrderRepository orderRepository = new OrderRepository();
        PlateRepository plateRepository = new PlateRepository();
        RestaurantRepository restaurantRepository = new RestaurantRepository();

        RestaurantService restaurantService = new RestaurantService(restaurantRepository);
        ClientService clientService = new ClientService(clientRepository);
        OrderService orderService = new OrderService(orderRepository, restaurantRepository, clientRepository);

        MenuController menu = new MenuController(clientService, restaurantService, orderService);
        menu.showMenu();
    }

}
