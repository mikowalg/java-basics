package zad1;

public abstract class Shake implements Jadalne, Pijalne {

    protected final int kcal;

    public Shake(final int kcal) {
        this.kcal = kcal;
    }

    @Override
    public void jedz() {
        pij();
    }

    public static void testMethod(int testVar){
        testVar = 10;
    }

}