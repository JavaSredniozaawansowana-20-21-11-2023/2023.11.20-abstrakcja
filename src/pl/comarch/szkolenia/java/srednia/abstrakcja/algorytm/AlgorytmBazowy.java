package pl.comarch.szkolenia.java.srednia.abstrakcja.algorytm;

public class AlgorytmBazowy extends Algorytm {
    @Override
    public void loadData() {
        System.out.println("Wczytuje z bazy !!");
    }

    @Override
    public void saveResults() {
        System.out.println("Zapisuje do bazy !!");
    }
}
