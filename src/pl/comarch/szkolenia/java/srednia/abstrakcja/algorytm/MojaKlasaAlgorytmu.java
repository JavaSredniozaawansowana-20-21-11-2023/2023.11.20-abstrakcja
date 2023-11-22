package pl.comarch.szkolenia.java.srednia.abstrakcja.algorytm;

public class MojaKlasaAlgorytmu extends Algorytm {
    @Override
    public void loadData() {
        System.out.println("Wczytaj dane z pliku !!");
    }

    @Override
    public void saveResults() {
        System.out.println("Zapisz wyniki do pliku !!");
    }
}
