package lv6_oop2;

import java.util.ArrayList;

public class HasenDemo {
    public static void main(String[] args) {

        Hase rabbit = new Hase("Rabbit");
        Osterhase easerhaze = new Osterhase("Easerhaze");
        Weihnachtshase chrishaze = new Weihnachtshase("Chrishaze");

        rabbit.verteilen();
        easerhaze.verteilen();
        chrishaze.verteilen();

        rabbit.schlafen();
        rabbit.fressen();
        rabbit.hoppeln();

        easerhaze.schlafen();
        easerhaze.fressen();
        easerhaze.hoppeln();

        chrishaze.schlafen();
        chrishaze.fressen();
        chrishaze.hoppeln();

        ArrayList<Hase> hasenstall = new ArrayList<>();
        hasenstall.add(chrishaze);
        hasenstall.add(easerhaze);
        hasenstall.add(rabbit);

        System.out.println("-------list-------");
        for (Hase h : hasenstall){
            h.verteilen();
        }

        System.out.println("------casting------");

        // up casting
        Hase h = chrishaze;
        h.verteilen();
        h.fressen();

        // down casting
        Weihnachtshase wh = (Weihnachtshase) h;
        wh.verteilen();

        /*
        Das funktioniert nicht
        Osterhase oh = (Osterhase) h;
        h.verteilen();
         */
    }
}
