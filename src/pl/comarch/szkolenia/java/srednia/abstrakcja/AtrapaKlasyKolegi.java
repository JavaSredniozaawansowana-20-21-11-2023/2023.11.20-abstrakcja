package pl.comarch.szkolenia.java.srednia.abstrakcja;

public class AtrapaKlasyKolegi implements JakisInterfejs {
    @Override
    public void metoda1() {
        System.out.println("123");
    }

    @Override
    public String metoda2(int x) {
        return "dane" + x;
    }

    @Override
    public int metoda3() {
        return 60;
    }
}
