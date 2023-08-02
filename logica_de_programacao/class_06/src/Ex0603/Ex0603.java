package Ex0603;

public class Ex0603 {

    public static void main(String[] args) {
        String[] days = {
                "segunda-feira",
                "terça-feira",
                "quarta-feira",
                "quinta-feira",
                "sexta-feira",
                "sábado",
                "domingo",
                "teste"
        };

        try {
            for (String day : days) {
                System.out.println("Day of week: " + DaysOfWeek.nameEnum(day));
            }
        } catch (NotAValidDayException e) {
            System.out.println(e.getMessage());
        }
    }
}
