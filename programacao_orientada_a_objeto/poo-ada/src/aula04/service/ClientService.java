package aula04.service;

import aula04.modals.Client;
import aula04.modals.Order;
import aula04.repository.ClientRepository;
import aula04.repository.OrderRepository;

import java.util.ArrayList;

public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void addClient(Client client) {
        clientRepository.addClient(client);
    }

    public void addClient(String name) {
        clientRepository.addClient(name);
    }

    public void removeClient(Client client) {
        clientRepository.removeClient(client);
    }

    public Client getClient(Integer identificator, String name) {
        return clientRepository.getClient(identificator, name);
    }

    public ArrayList<Client> getAllClients() {
        return clientRepository.getAllClients();
    }
}
