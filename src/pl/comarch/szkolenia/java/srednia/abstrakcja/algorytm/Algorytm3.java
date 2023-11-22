package pl.comarch.szkolenia.java.srednia.abstrakcja.algorytm;

public class Algorytm3 {
    public void policz() {
        loadData();
        firstStep();
        secondStep();
        thirdStep();
        saveResults();
    }

    private void loadData() {
        System.out.println("Wczytuje dane z internetu !!!");
    }

    private void firstStep() {
        System.out.println("1 krok liczenia !!");
    }

    private void secondStep() {
        System.out.println("2 krok liczenia !!");
    }

    private void thirdStep() {
        System.out.println("3 krok liczenia !!");
    }

    private void saveResults() {
        System.out.println("Zapisuej dane do exclea !!");
    }
}
