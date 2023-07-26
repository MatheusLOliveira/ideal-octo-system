package Ex0701;

public class Ex0603 {

    public static void main(String[] args) {
        String[] days = {
                "sab",
                "qua",
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
