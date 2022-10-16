package zad1;

public enum RodzajTruskawki {
    ANNASOWA("Białe owoce"),
    HONEOYE("Wyrazista"),
    POLKA("Najsmaczniejsza"),
    KENT("Dla fanów słodyczy"),
    CHRISTINE("Zaowocuj szybko i obficie"),
    ;

    public final String cecha;

    RodzajTruskawki(final String cecha){
        this.cecha = cecha;
    }
}
