package pl.comarch.szkolenia.java.srednia.abstrakcja;

public interface A {
    void m();

    default void metoda() {
        System.out.println("metoda z interfejsu A");
    }
}
