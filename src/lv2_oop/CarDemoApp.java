package lv2_oop;

public class CarDemoApp {
    public static void main(String[] args) {
        String name = "Susi";
        Car porsche911 = new Car(); // new macht es verwendbar
        porsche911.manufacturer = "Porsche";
        porsche911.currentGear = 1;
        porsche911.color = "steel-blue";

        Car vwGolf = new Car();
        vwGolf.color = "red";
        vwGolf.manufacturer = "Volkswagen";
        vwGolf.currentGear = 1;

        System.out.println("vwGolf.manufacturer = " + vwGolf.manufacturer);
        System.out.println("vwGolf.color = " + vwGolf.color);
        System.out.println("vwGolf = " + vwGolf);
    }
}
