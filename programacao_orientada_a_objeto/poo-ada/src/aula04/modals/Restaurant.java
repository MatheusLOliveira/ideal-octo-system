package aula04.modals;

import java.util.ArrayList;
import java.util.Objects;

public class Restaurant {

    private static Integer lastIdentificator = 0;
    private Integer identificator;
    private String name;
    private String address;
    private ArrayList<Plate> platesAvaiable;

    public Restaurant(String name, String address) {
        this.identificator = lastIdentificator;
        this.name = name;
        this.address = address;
        this.platesAvaiable = new ArrayList<Plate>();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Plate getPlate(int option) {
        return platesAvaiable.get(option);
    }

    public ArrayList<Plate> getPlatesAvaiable() {
        return platesAvaiable;
    }

    public void setPlatesAvaiable(ArrayList<Plate> platesAvaiable) {
        this.platesAvaiable = platesAvaiable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(platesAvaiable, that.platesAvaiable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, platesAvaiable);
    }

    @Override
    public String toString() {
        boolean thereIsPlate = true;
        if (this.platesAvaiable.toArray().length == 0) { thereIsPlate = false; }

        if (thereIsPlate) {
            return "Restaurant: \n" +
                    "Restaurant's id: " + identificator + '\n' +
                    "Restaurant's name ='" + name + '\n' +
                    "Address = " + address + '\n' +
                    "Plates = " + platesAvaiable + '\n';
        }
        return "Restaurant: \n" +
                "Restaurant's id: " + identificator + '\n' +
                "Restaurant's name = " + name + '\n' +
                "Address = " + address + '\n' +
                "Plates = There's no plate register";
    }
}
