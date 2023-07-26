package Ex0603;

public enum DaysOfWeek {
    DOMINGO("domingo", 1),
    SEGUNDA_FEIRA("segunda-feira", 2),
    TERCA_FEIRA("terça-feira", 3),
    QUARTA_FEIRA("quarta-feira", 4),
    QUINTA_FEIRA("quinta-feira", 5),
    SEXTA_FEIRA("sexta-feira", 6),
    SABADO("sábado", 7);

    final String name;
    final int day;

    DaysOfWeek(String nome, int dia) {
        this.name = nome;
        this.day = dia;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public static DaysOfWeek nameEnum(String name) {
        for(DaysOfWeek day : values()) {
            if(day.getName().equalsIgnoreCase(name)) {
                return day;
            }
        }
        throw new NotAValidDayException("Not a valid day");
    }
}
