package pl.comarch.szkolenia.java.srednia.abstrakcja;

public interface JakisInterfejs {
    public final static int a = 10;

    void metoda1();
    String metoda2(int x);
    int metoda3();

    default void metodaDomyslna() {
        czynnosc1();
        czynnosc2();
    }

    private void czynnosc1() {
        System.out.println("metoda domyslna");
        //???
        //???
        //???
    }

    private void czynnosc2() {
        System.out.println("Cos tu jest robione");
        //??
        //??
        //??
        //??
    }
}
