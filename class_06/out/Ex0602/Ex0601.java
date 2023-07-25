package Ex0601;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Ex0601 {

    public static void main(String[] args) {
        System.out.println(finalPrice(250.10, States.MG) == 267.607);
        System.out.println(finalPrice(250.10, States.RJ) == 287.615);
        System.out.println(finalPrice(250.10, States.SP) == 280.112);
    }

    public static double finalPrice(double valorProduto, States state) {
        double finalPrice = valorProduto * (1.0 + state.getTax());
        return arredondar(finalPrice);
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
}