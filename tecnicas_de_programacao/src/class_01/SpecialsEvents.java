package class_01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class SpecialsEvents {

    public LocalDate event1() {
        return LocalDate.of(2003, Month.JUNE, 19);
    }

    public LocalTime event2() {
        return LocalTime.of(9, 56);
    }

    public LocalDateTime event3() {
        return LocalDateTime.of(event1(), event2());
    }

    public static void main(String[] args) {
        SpecialsEvents events = new SpecialsEvents();

        LocalDate dateEvent1 = events.event1();
        System.out.println("The day I was born: " + dateEvent1);

        LocalTime timeEvent2 = events.event2();
        System.out.println("The time I was born: " + timeEvent2);

        LocalDateTime dateTimeEvent3 = events.event3();
        System.out.println("The day and time I was born: " + dateTimeEvent3);
    }

}
