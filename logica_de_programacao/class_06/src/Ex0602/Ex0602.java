package Ex0602;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Ex0602 {

    public static void main(String[] args) throws InvalidStateException {
        System.out.println(finalPrice(250.10, "MG") == 267.607);
        System.out.println(finalPrice(250.10, "RJ") == 287.615);
        System.out.println(finalPrice(250.10, "SP") == 280.112);

        try {
            finalPrice(250.10, "DF");
        } catch (InvalidStateException e) {
            System.out.println("Estado inválido");
        }
    }

    public static double finalPrice(double productValue, String stateDestination) throws InvalidStateException{
        try {
            States state = States.valueOf(stateDestination);
            double finalPrice = productValue * (1.0 + state.getTax());
            return arredondar(finalPrice);
        } catch (IllegalArgumentException e) {
            throw new InvalidStateException(e.getMessage());
        }
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
}