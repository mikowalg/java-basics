package zad1;

public class Application {

    public static void  main(String[] args) {
        ShakeTruskawkowy shakeTruskawkowy = new ShakeTruskawkowy(300,RodzajTruskawki.ANNASOWA);


        shakeTruskawkowy.pij();
        shakeTruskawkowy.jedz();
        RodzajTruskawki rodzajTruskawki = RodzajTruskawki.ANNASOWA;

        switch (rodzajTruskawki){
            case ANNASOWA;
                break;
            case KENT;
        }

    }
}
