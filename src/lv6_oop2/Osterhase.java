package lv6_oop2;

public class Osterhase extends Hase{

    public Osterhase(String name) {
        super(name);
    }

    @Override
    public void verteilen() {
        System.out.println(this.getName() + " versteckt Geschenke und Ostereier");
    }
}
