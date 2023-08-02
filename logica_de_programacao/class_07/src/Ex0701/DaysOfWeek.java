package Ex0701;

public enum DaysOfWeek {
    DOMINGO(new String[]{"domingo", "dom"}, 1),
    SEGUNDA(new String[]{"segunda-feira","seg"}, 2),
    TERCA(new String[]{"terça-feira","ter"}, 3),
    QUARTA(new String[]{"quarta-feira", "qua"}, 4),
    QUINTA(new String[]{"quinta-feira", "qui"}, 5),
    SEXTA(new String[]{"sexta-feira", "sex"}, 6),
    SABADO(new String[]{"sábado", "sab"}, 7);

    final String[] keywords;
    final int day;

    DaysOfWeek(String[] keywords, int day) {
        this.keywords = keywords;
        this.day = day;
    }
    public String[] getKeywords() {
        return keywords;
    }

    public int getDay() {
        return day;
    }

    public static DaysOfWeek nameEnum(String name) {
        for (DaysOfWeek regularName : DaysOfWeek.values()){
            for (String dayWeek : regularName.getKeywords()){
                if(dayWeek.equalsIgnoreCase(name)){
                    return regularName;
                }
            }
        }
        throw new NotAValidDayException("Not a valid day");
    }
}
