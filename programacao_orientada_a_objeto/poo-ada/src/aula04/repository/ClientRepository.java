package aula04.repository;

import aula04.modals.Client;
import aula04.modals.Plate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ClientRepository {

    private ArrayList<Client> clientsData;

    public ClientRepository() {
        this.clientsData = new ArrayList<Client>();
    }

    public void addClient(String name){
        clientsData.add(new Client(name));
    }

    public void addClient(Client client){
        clientsData.add(client);
    }

    public void removeClient(Client client){
        clientsData.remove(client);
    }

    public Client getClient(Integer identificator, String name) {
        for (Client client : clientsData) {
            if (client.getIdentificator().equals(identificator) && client.getName().equals(name)) {
                return client;
            }
        }
        return null;
    }

    public ArrayList<Client> getAllClients() {
        return new ArrayList<>(clientsData);
    }

}
