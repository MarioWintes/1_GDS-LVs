package lv7_;

public class TextDocument extends Document {

    private String content;

    public TextDocument(String fileName, String content) {
        super(fileName);
        this.content = content;
    }

    @Override
    public void printDocument() {
        super.printDocument();
        System.out.println(".txt -> " + content);
    }
}
