package brueckenkurse;

public class DemoRezeptApp {

    public static void main(String[] args) {

        Zutat mehl = new Zutat();
        mehl.setName("Mehl");
        mehl.setMenge(300);

        Zutat zucker = new Zutat();
        zucker.setName("Wiener Zucker");
        zucker.setMenge(300);

        Zutat butter = new Zutat();
        butter.setName("BIO Butter");
        butter.setMenge(300);

        Zutat[] zutaten = new Zutat[] {mehl, zucker, butter};

        Rezept butterKeks = new Rezept();
        butterKeks.setName("Butter Kekse");
        butterKeks.setPersonen_anzahl(4);
        butterKeks.setZutaten(zutaten);

        butterKeks.printRezept();

        Rezept butterKeks8 = butterKeks.umrechnen(20);
        butterKeks8.printRezept();

    }
}
