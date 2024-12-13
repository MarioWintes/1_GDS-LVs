package lv7_abstract_interfaces;

public class Shirt implements Moveable {

    private String brand;
    private String color;
    private String size;

    public Shirt(String brand, String color, String size) {
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    public void printShirt() {
        System.out.print(color + " " + brand);
    }

    @Override
    public void move(String destination) {
        printShirt();
        System.out.println(" will be shipped to: " + destination);
    }

}
