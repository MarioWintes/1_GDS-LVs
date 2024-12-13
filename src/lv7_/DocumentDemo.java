package lv7_;

import java.util.ArrayList;

public class DocumentDemo {

    public static void main(String[] args) {

        Document document = new Document("Hello_World");

        TextDocument textDocument = new TextDocument("Hello_Text", "inhalt");

        ImageDocument imageDocument = new ImageDocument("Hello_Image", 60, 200, "red");

        CsvDocument csvDocument = new CsvDocument("Hello_Csv", new ArrayList<>(50));

        textDocument.printDocument();
    }
}
