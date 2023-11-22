package pl.comarch.szkolenia.java.srednia.abstrakcja.algorytm;

public class AlgowytmInterentowoExcelowy extends Algorytm {
    @Override
    public void loadData() {
        System.out.println("Wczytuje z intenetu !!");
    }

    @Override
    public void saveResults() {
        System.out.println("Zapisuje do excela !!");
    }
}
