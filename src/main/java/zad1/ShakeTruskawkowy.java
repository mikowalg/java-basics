package zad1;

public class ShakeTruskawkowy extends Shake implements Smak {
    private final RodzajTruskawki rodzajTruskawki;


    public ShakeTruskawkowy(final int kcal
                            final RodzajTruskawki rodzajTruskawki){
        super(kcal);
        this.rodzajTruskawki = rodzajTruskawki;
    }


//    public ShakeTruskawkowy() {
//        super(kcal);
//    }

    @Override
    public void pij () {
        String.format("Pije koktajl %s, która cechuje się ")
        System.out.println("Pije koktail" + smak() + ", która cechuje się " + rodzajTruskawki.cecha(()));
        System.out.println(messsage);
    }



    @Override
    public String smak(){
        return "Truskawkowy";
    }
}
