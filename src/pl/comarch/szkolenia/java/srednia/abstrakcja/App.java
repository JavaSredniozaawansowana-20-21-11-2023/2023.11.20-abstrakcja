package pl.comarch.szkolenia.java.srednia.abstrakcja;

public class App {
    public static void main(String[] args) {
        JakisInterfejs obiektKolegi = new JakasKlasa();
        obiektKolegi.metoda1();
        String s = obiektKolegi.metoda2(5);
        int x = obiektKolegi.metoda3();

        System.out.println(s);
        System.out.println(x);

        obiektKolegi.metodaDomyslna();

        System.out.println(JakisInterfejs.a);
        System.out.println(Constants.PI);

        /*Y y = new Y();
        y.y();
        KlasaAbstrakcyjna klasaAbstrakcyjna = new KlasaAbstrakcyjna();
        klasaAbstrakcyjna.metodaAbstrakcyjna();*/
    }
}
