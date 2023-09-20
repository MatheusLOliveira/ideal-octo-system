import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class VaccineExercise {

    public static void main(String[] args) {

        DateTimeFormatter brazilianFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate firstDose = LocalDate.of(2022, Month.APRIL, 1);
        LocalDate secondDose = firstDose.plusMonths(1);
        LocalDate thirdDose = firstDose.plusMonths(2);

        System.out.println("Dose 1: " + firstDose.format(brazilianFormater));
        System.out.println("Dose 2: " + secondDose.format(brazilianFormater));
        System.out.println("Dose 3: " + thirdDose.format(brazilianFormater));
    }
}