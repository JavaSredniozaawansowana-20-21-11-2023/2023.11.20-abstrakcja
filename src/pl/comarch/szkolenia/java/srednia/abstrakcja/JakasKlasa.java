package pl.comarch.szkolenia.java.srednia.abstrakcja;

import java.util.Random;

public class JakasKlasa implements JakisInterfejs {

    final int a = 6;

    @Override
    public void metoda1() {
        System.out.println("metoda1");
    }

    @Override
    public String metoda2(int x) {
        return String.valueOf(x+55);
    }

    @Override
    public int metoda3() {
        return new Random().nextInt(100);
    }
}
