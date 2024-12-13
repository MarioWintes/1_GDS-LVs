package lv7_abstract_interfaces;

public class LogisticDemo {

    public static void main(String[] args) {

        Car vw = new Car("VW Guif", "süwa", 8000);

        Shirt vans = new Shirt("Vans", "weiß", "L");

        LogisticManager lm = new LogisticManager();

        lm.addMoveable(vw);
        lm.addMoveable(vans);

        vw.move("Auto Lager");
        vans.move("Shirt Lager");
        lm.moveAll("Graz");
    }
}
