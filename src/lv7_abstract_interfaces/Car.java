package lv7_abstract_interfaces;

public class Car implements Moveable {

    private String type;
    private String color;
    private int weight;

    public Car(String type, String color, int weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public void printCar(){
        System.out.print(color + " " + type);
    }

    @Override
    public void move(String destination) {
        printCar();
        System.out.println(" will be moved to: " + destination);
    }

}
