package lv7_abstract_interfaces;

public class LogisticDemo {

    public static void main(String[] args) {

        Car v = new Car("VW Guif", "red", 8000);
        Car t = new Car("Tesla", "white", 2500);

        Shirt s = new Shirt("Vans", "weiß", "L");
        Shirt n = new Shirt("Nike", "black", "L");

        LogisticManager lm = new LogisticManager();

        lm.addMoveable(v);
        lm.addMoveable(t);
        lm.addMoveable(s);
        lm.addMoveable(n);

        v.move("Auto Lager");
        s.move("Shirt Lager");

        lm.moveAll("Graz");

        lm.moveAll("Müll");
    }
}
