package lv7_abstract_interfaces;

public class ImageDocument extends Document {

    private int sizeX;
    private int sizeY;
    private String color;

    public ImageDocument(String fileName, int SizeX, int SizeY, String color) {
        super(fileName);
        this.sizeX = SizeX;
        this.sizeY = SizeY;
        this.color = color;
    }

    @Override
    public void printDocument() {
        System.out.println("fileName = " + fileName);
        System.out.println("sizeX = " + sizeX);
        System.out.println("sizeY = " + sizeY);
        System.out.println("color = " + color);
    }
}
