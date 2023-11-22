package pl.comarch.szkolenia.java.srednia.abstrakcja.algorytm;

public abstract class Algorytm {

    public void policz() {
        loadData();
        firstStep();
        secondStep();
        thirdStep();
        saveResults();
    }

    public abstract void loadData();

    private void firstStep() {
        System.out.println("1 krok liczenia !!");
    }

    private void secondStep() {
        System.out.println("2 krok liczenia !!");
    }

    private void thirdStep() {
        System.out.println("3 krok liczenia !!");
    }

    public abstract void saveResults();
}
