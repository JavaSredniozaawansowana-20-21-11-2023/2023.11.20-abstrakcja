package pl.comarch.szkolenia.java.srednia.abstrakcja.algorytm;

public class App {
    public static void main(String[] args) {
        /*Algorytm algorytm = new Algorytm();
        algorytm.policz();

        Algorytm2 algorytm2 = new Algorytm2();
        algorytm2.policz();

        Algorytm3 algorytm3 = new Algorytm3();
        algorytm3.policz();*/

        Algorytm algorytm = new MojaKlasaAlgorytmu();
        algorytm.policz();


        Algorytm algorytm2 = new AlgorytmBazowy();
        algorytm2.policz();

        Algorytm algorytm3 = new AlgowytmInterentowoExcelowy();
        algorytm3.policz();
    }
}
