package lv7_abstract_interfaces;

import java.util.ArrayList;

public class DocumentDemo {

    public static void main(String[] args) {

        TextDocument textDocument = new TextDocument("Hello_Text.txt", "Lorem ipsum dolor sit amet");

        ImageDocument imageDocument = new ImageDocument("Hello_Image.png", 60, 200, "red");

        CsvDocument csvDocument = new CsvDocument("Hello_Csv.csv", new ArrayList<>());

        csvDocument.addLine("Spalte1;S2;S3");
        csvDocument.addLine("SpalteC;SB;SA");

        PrintManager pm = new PrintManager();
        pm.addDocument(textDocument);
        pm.addDocument(imageDocument);
        pm.addDocument(csvDocument);

        pm.printAll();

        Document wd = new WordDocument("hallo.docx", "word sinnlos");

        pm.addDocument(wd);
        pm.printAll();

        Document d = new Document("name") {
            @Override
            public void printDocument() {
                System.out.println("mega geil");
            }
        };

        d.printDocument();


    }
}
