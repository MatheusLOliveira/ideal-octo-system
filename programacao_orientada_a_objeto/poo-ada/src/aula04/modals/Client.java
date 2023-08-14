package aula04.modals;

import java.util.ArrayList;
import java.util.Objects;

public class Client {

    private static Integer lastIdentificator = 0;
    private Integer identificator;
    private String name;

    public Client(String name) {
        this.identificator = lastIdentificator++;
        this.name = name;
    }

    public Integer getIdentificator() {
        return identificator;
    }

    public void setIdentificator(Integer identificator) {
        this.identificator = identificator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(identificator, client.identificator) && Objects.equals(orders, client.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificator, orders);
    }

    @Override
    public String toString() {
        return "Client: \n" +
                "Identificator = " + identificator + "\n" +
                "Orders = " + orders;
    }
}
