package lv7_abstract_interfaces;

public class TextDocument extends Document {

    private String content;

    public TextDocument(String fileName, String content) {
        super(fileName);
        this.content = content;
    }

    @Override
    public void printDocument() {
        System.out.println("fileName = " + fileName);
        System.out.println("content = " + content);
    }
}
