package pl.comarch.szkolenia.java.srednia.abstrakcja;

public interface B {
    void m();

    default void metoda() {
        System.out.println("metoda z interfejsu B");
    }
}
