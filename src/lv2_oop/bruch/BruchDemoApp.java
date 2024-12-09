package lv2_oop.bruch;

public class BruchDemoApp {
    public static void main(String[] args) {

        Bruch n = new Bruch(1,2);
        Bruch n2 = new Bruch(3,4);
        n.print();

        System.out.println(n2.toDecimal());

        Bruch n3 = n.multiplicate(n2);
        n3.print();

        Bruch n4 = n.multiplicate(n2, n3);
        n4.print();

    }
}
