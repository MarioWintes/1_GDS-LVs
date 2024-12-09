package lv2_oop.konto;

public class KontoDemoApp {
    public static void main(String[] args) {

        System.out.println("konto.Konto.getAnzahlKonto() = " + Konto.getAnzahlKonto());

        Konto mario = new Konto("Alex");

        System.out.println("konto.Konto.getAnzahlKonto() = " + Konto.getAnzahlKonto());

        Konto alex = new Konto("Al");

        System.out.println(mario.getKontonummer());
        System.out.println(alex.getKontonummer());

        //mario.setInhaber("Mario");
        //konto.Konto.setInhaber("Mario"); so wenn die methode static ist
        mario.aufbuchen(100);
        mario.abbuchen(51);
        mario.abbuchen(51);

        System.out.println(mario.toString());
        mario.print();


    }
}
