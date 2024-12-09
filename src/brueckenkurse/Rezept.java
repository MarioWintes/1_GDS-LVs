package brueckenkurse;

public class Rezept {

    private String name;
    private int personen_anzahl;

    private Zutat[] zutaten;

    public void setZutaten(Zutat[] zutaten) {
        this.zutaten = zutaten;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersonen_anzahl(int personen_anzahl) {
        this.personen_anzahl = personen_anzahl;
    }

    public String getName() {
        return name;
    }

    public int getPersonen_anzahl() {
        return personen_anzahl;
    }

    public void printRezept() {
        System.out.println("Name: " + name);
        System.out.println("Rezept passt für " + personen_anzahl + " Personen");

        for (int i = 0; i < zutaten.length; i++){
            zutaten[i].print();
        }
        System.out.println("----------------------------");
    }

    public Rezept umrechnen(int zielPersonen){
        Rezept neu = new Rezept();
        neu.setName(name);
        neu.setPersonen_anzahl(zielPersonen);

        double faktor = zielPersonen / (personen_anzahl * 1.0); //double
        Zutat[] array = new Zutat[zutaten.length];

        for (int i = 0; i < zutaten.length; i++){
            array[i] = new Zutat();
            array[i].setName(zutaten[i].getName());
            array[i].setMenge((int) (zutaten[i].getMenge() * faktor));
        }
        neu.setZutaten(array);
        return neu;

    }
}
