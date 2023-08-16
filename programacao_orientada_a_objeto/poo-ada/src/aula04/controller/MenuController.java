package aula04.controller;

// to do: Correct the listRestaurantOrders toString and listClientOrders
// Improve listAllRestaurantPlates toString

import aula04.modals.Client;
import aula04.modals.Order;
import aula04.modals.Plate;
import aula04.modals.Restaurant;
import aula04.service.ClientService;
import aula04.service.OrderService;
import aula04.service.RestaurantService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuController {

    private ClientService clientService;
    private RestaurantService restaurantService;
    private OrderService orderService;
    Scanner scanner = new Scanner(System.in);

    public MenuController(ClientService clientService, RestaurantService restaurantService, OrderService orderService) {
        this.clientService = clientService;
        this.restaurantService = restaurantService;
        this.orderService = orderService;
    }

    public void showMenu(){
        while (true) {
            System.out.println("\nSistema de Pedidos de Restaurantes");
            System.out.println("1. Register Restaurant");
            System.out.println("2. Listar Restaurantes");
            System.out.println("3. Adicionar Prato");
            System.out.println("4. Listar Pratos de um Restaurante");
            System.out.println("5. Fazer um Pedido"); // To do
            System.out.println("6. Listar pedidos de um restaurante");
            System.out.println("7. Cadastrar um cliente");
            System.out.println("8. Ver Pedidos de um Cliente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    registerRestaurant();
                    break;
                case 2:
                    listRestaurants();
                    break;
                case 3:
                    registerPlate();
                    break;
                case 4:
                    listAllRestaurantPlates();
                    break;
                case 5:
                    registerOrder();
                    break;
                case 6:
                    listRestaurantOrders();
                    break;
                case 7:
                    registerClient();
                    break;
                case 8:
                    listClientOrders();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
            }
        }
    }

    private void registerRestaurant() {
        System.out.println("------------------ Register Restaurants ------------------");
        System.out.print("Restaurant's name: ");
        String name = scanner.nextLine();
        System.out.print("Restaurant's address: ");
        String address = scanner.nextLine();
        restaurantService.addRestaurant(name, address);
        System.out.println("Restaurant successfully registered!");
        System.out.println();
    }

    private void listRestaurants() {
        System.out.println("------------------ List all Restaurants ------------------");
        ArrayList<Restaurant> restaurants = restaurantService.getAllRestaurant();

        if (!restaurants.isEmpty()) {
            for (Restaurant restaurant : restaurants) {
                System.out.println(restaurant);
            }
            System.out.println();
        } else {
            System.out.println("There are no restaurants listed!");
            System.out.println();
        }
    }

    private  void registerPlate() {
        System.out.println("------------------ Register Plates ------------------");
        System.out.print("Restaurant's id: ");
        Integer restaurantId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Restaurant's name: ");
        String restaurantName = scanner.nextLine();
        System.out.print("Plate's name: ");
        String plateName = scanner.nextLine();
        System.out.print("Price : ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Plate's description: ");
        String description = scanner.nextLine();

        Restaurant restaurant = restaurantService.getRestaurant(restaurantId, restaurantName);
        if (restaurant != null) {
            restaurantService.addPlate(restaurantId, restaurantName, plateName, price, description);
            System.out.println("Plate added successfully!");
            System.out.println();
        } else {
            System.out.println("Restaurant not found!");
        }
    }

    private void listAllRestaurantPlates() {
        System.out.println("------------------ List all Restaurant's Plates ------------------");
        System.out.print("Restaurant's id: ");
        Integer restaurantId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Restaurant's name: ");
        String restaurantName = scanner.nextLine();

        Restaurant restaurant = restaurantService.getRestaurant(restaurantId, restaurantName);

        if (restaurant != null) {
            ArrayList<Plate> plates = restaurantService.listAllRestaurantPlates(restaurantId, restaurantName);

            if (!plates.isEmpty()) {
                for (Plate plate : plates) {
                    System.out.println(plate);
                }
            } else {
                System.out.println("There's no plate register!");
            }
        } else {
            System.out.println("Restaurant not found!");
        }

    }

    private  void  registerOrder(){
        System.out.println("------------------ Register Order ------------------");
        System.out.print("Client's id: ");
        Integer clientId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Client's name: ");
        String clientName = scanner.nextLine();
        System.out.print("Address to delivery: ");
        String addressToDelivery = scanner.nextLine();

        Client client = clientService.getClient(clientId, clientName);

        if (client != null) {
            System.out.print("Restaurant's id: ");
            Integer restaurantId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Restaurant's name: ");
            String restaurantName = scanner.nextLine();

            Restaurant restaurant = restaurantService.getRestaurant(restaurantId, restaurantName);

            if (restaurant != null) {
                if (restaurant.getPlatesAvaiable() != null) {
                    ArrayList<Plate> platesOrder = new ArrayList<>();
                    boolean ordering = true;
                    do {
                        System.out.println("---- Restaurant's menu ----");
                        for (int i = 0; i < restaurant.getPlatesAvaiable().size(); i++) {
                            System.out.println();
                            System.out.println("(" + (i) + ") " + restaurant.getPlate(i));
                        }

                        System.out.print("Choose one option: ");
                        int option = scanner.nextInt();
                        System.out.print("Quantity of " + restaurant.getPlate(option).getName() + ": ");
                        int quantity = scanner.nextInt(); // Need to do the quantity
                        scanner.nextLine();

                        for (int i = 0; i < quantity; i++) {
                            platesOrder.add(restaurant.getPlate(option));
                        }
                        System.out.println("Plate added successfully to your list!");

                        System.out.print("Do you wanna order anything more? (Y/N): ");
                        String choice = scanner.nextLine();

                        if (choice.equalsIgnoreCase("N")){
                            ordering = false;
                        }
                    } while (ordering);
                    orderService.addOrder(client, restaurant, addressToDelivery, platesOrder);
                    System.out.println("Order created successfully!");
                } else {
                    System.out.println("Sorry, this restaurant has no record of plates");
                }
            }
        } else {
            System.out.println("Client not found");
        }

    }

    private void listRestaurantOrders() {
        System.out.println("------------------ List Restaurant Orders ------------------");
        System.out.print("Restaurant's id: ");
        Integer restaurantId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Restaurant's name: ");
        String restaurantName = scanner.nextLine();

        List<Order> orders = orderService.listRestaurantOrders(restaurantId, restaurantName);

        if (orders != null) {
            for (Order order : orders) {
                System.out.println(order);
            }
        } else {
            System.out.println("There are no order!");
        }

    }

    private void registerClient() {
        System.out.println("------------------ Register Client ------------------");
        System.out.print("Client's name: ");
        String clientName = scanner.nextLine();
        clientService.addClient(clientName);
        System.out.println("Client successfully register!");
    }

    private void listClientOrders() {
        System.out.println("------------------ Register Client ------------------");
        System.out.print("Client's id: ");
        Integer clientId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Client's name: ");
        String clientName = scanner.nextLine();

        List<Order> clientOrders = orderService.listClientOrders(clientId, clientName);

        if (clientOrders != null) {
            for (Order order : clientOrders) {
                System.out.println(order);
            }
        } else {
            System.out.println("There are no order!");
        }
    }

}
