package Ex0601;

public enum States {
    MG("MINAS_GERAIS", 0.07),
    SP("SAO_PAULO", 0.12),
    RJ("RIO_DE_JANEIRO", 0.15);


    final String name;
    final double tax;

    States(String name, double tax) {
        this.name = name;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double getTax() {
        return tax;
    }
}

