package lv2_oop.konto;

public class Konto {

    private String inhaber;
    private double kontostand;
    private final int kontonummer;

    private static int anzahlKonto;

    public Konto(String name) {
        this.inhaber = name;
        anzahlKonto++;
        this.kontonummer = anzahlKonto;
    }

    public static int getAnzahlKonto(){
        return anzahlKonto;
    }

    public void setInhaber(String name) {
        this.inhaber = name;
        this.kontostand = 0;
    }

    public String getInhaber() {
        return this.inhaber;
    }

    public int getKontonummer() {
        return this.kontonummer;
    }

    public void aufbuchen(double number){
        this.kontostand += number;
    }

    public void abbuchen(double number) {
        if ((this.kontostand - number) <= 0) {
            System.out.println("Nicht genug Guthaben");
            System.out.println("Dein Restguthaben beträgt " + this.kontostand + "€");
        } else {
            this.kontostand -= number;
        }
    }

    public void print(){
        System.out.println("inhaber = " + inhaber);
        System.out.println("kontostand = " + kontostand);
        System.out.println("kontonummer = " + kontonummer);
    }

    @Override
    public String toString() {
        return "konto.Konto{" +
                "inhaber='" + inhaber + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }

}
