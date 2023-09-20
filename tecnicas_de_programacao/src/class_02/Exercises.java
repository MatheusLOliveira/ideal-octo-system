package class_02;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Exercises {

    public static void main(String[] args) {
        System.out.println("----------Exercise 01----------");
        List<String> datasStrings = new ArrayList<>();
        datasStrings.add("2023-08-10");
        datasStrings.add("2022-05-20");
        datasStrings.add("2021-11-30");

        DateTimeFormatter formatterExercise1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        List<LocalDate> datasFormatadasExercicio1 = formatterDates(datasStrings, formatterExercise1);

        for (LocalDate date : datasFormatadasExercicio1) {
            System.out.print("Data: " + date + " | Tipo de dado: " + date.getClass().getSimpleName() + "\n");
        }
        System.out.println(" ");



        System.out.println("----------Exercise 02----------");
        DateTimeFormatter formatterExercise2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<LocalDate> datas = new ArrayList<>();
        datas.add(LocalDate.of(2023, 8, 10));
        datas.add(LocalDate.of(2022, 5, 20));
        datas.add(LocalDate.of(2021, 11, 30));

        List<String> datasFormatadas = new ArrayList<>();

        for (int i = 0; i < datas.size(); i++) {
            datasFormatadas.add(datas.get(i).format(formatterExercise2));
            System.out.println(datasFormatadas.get(i));
        }
        System.out.println(" ");



        System.out.println("----------Exercise 03----------");
        convertZonedDateTime(ZonedDateTime.now());
    }

    private static List<LocalDate> formatterDates(List<String> dateString, DateTimeFormatter formatter) {
        List<LocalDate> dates = new ArrayList<>();
        for (String str : dateString) {
            dates.add(LocalDate.parse(str, formatter));
        }
        return dates;
    }

    private static void convertZonedDateTime(ZonedDateTime timeZone) {
        DateTimeFormatter formatterExercise3 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");

        System.out.println("Local Time Zone: " + timeZone.format(formatterExercise3));
        System.out.println("New York Time Zone: " + timeZone.withZoneSameInstant(ZoneId.of("America/New_York")).format(formatterExercise3));
        System.out.println("Paris Time Zone: " + timeZone.withZoneSameInstant(ZoneId.of("Europe/Paris")).format(formatterExercise3));
        System.out.println("Tokyo Time Zone: " + timeZone.withZoneSameInstant(ZoneId.of("Asia/Tokyo")).format(formatterExercise3));
    }
}
