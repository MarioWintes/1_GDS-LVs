package lv2_oop;

public class Car {
    public String color;
    public int currentGear;
    public String manufacturer;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", currentGear=" + currentGear +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}



