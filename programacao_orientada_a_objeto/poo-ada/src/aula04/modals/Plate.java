package aula04.modals;

import java.text.DecimalFormat;
import java.util.Objects;

public class Plate {

    private static Integer lastIdentificator = 0;
    private Integer identificator;
    private String name;
    private double price;
    private String description;

    public Plate(String name, double price, String description) {
        this.identificator = lastIdentificator++;
        this.name = name;
        this.price = price;
        this.description = description;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plate plate = (Plate) o;
        return Double.compare(price, plate.price) == 0 && Objects.equals(name, plate.name) && Objects.equals(description, plate.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Plate: \n" +
                "Name = " + name + '\n' +
                "Price = " + df.format(price) + '\n' +
                "Description = " + description + '\n';
    }
}
