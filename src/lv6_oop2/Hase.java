package lv6_oop2;

public class Hase {
    private String name;

    public Hase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void hoppeln(){
        System.out.println(this.name + " ist ein Hase und hoppelt");
    }

    public void schlafen(){
        System.out.println(this.name + " ist ein Hase und schläft");
    }

    public void fressen(){
        System.out.println(this.name + " ist ein Hase und frisst");
    }

    public void verteilen(){
        System.out.println(this.name + " ist ein Hase und verteilt nichts");
    }
}
