package lv6_oop2;

public class Weihnachtshase extends Hase{

    public Weihnachtshase(String name) {
        super(name);
    }

    @Override
    public void verteilen() {
        System.out.println(this.getName() + " verteilt Geschenke unter dem Christbaum");
    }
}
