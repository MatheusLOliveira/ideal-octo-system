package aula04.repository;

import aula04.modals.Plate;
import aula04.modals.Restaurant;

import java.util.ArrayList;

public class PlateRepository {

    private ArrayList<Plate> platesData;

    public void addPlate(String name, double price, String description) {
        platesData.add(new Plate(name, price, description));
    }

    public void addPlate(Plate plate) {
        platesData.add(plate);
    }

    public void removePlatet(Plate plate) {
        platesData.remove(plate);
    }

    public Plate getPlate(Integer identificator, String name) {
        for (Plate plate : platesData) {
            if (plate.getIdentificator().equals(identificator) && plate.getName().equals(name)) {
                return plate;
            }
        }
        return null;
    }

    public ArrayList<Plate> getAllPlates() {
        return new ArrayList<>(platesData);
    }

}
