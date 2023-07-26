package Ex0603;

public class Ex0603 {

    public static void main(String[] args) {
        DaysOfWeek[] days = {
                DaysOfWeek.nameEnum("segunda-feira"),
                DaysOfWeek.nameEnum("terça-feira"),
                DaysOfWeek.nameEnum("quarta-feira"),
                DaysOfWeek.nameEnum("quinta-feira"),
                DaysOfWeek.nameEnum("sexta-feira"),
                DaysOfWeek.nameEnum("sábado"),
                DaysOfWeek.nameEnum("domingo"),
                DaysOfWeek.nameEnum("teste")
        };

        for (DaysOfWeek day : days) {
            if (day != null) {
                System.out.println("Day of week: " + day);
            } else {
                System.out.println("Not a valid day.");
            }
        }

    }
}
