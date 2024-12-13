package lv7_;

import java.util.ArrayList;

public class CsvDocument extends Document {

    private ArrayList<String> lines;

    public CsvDocument(String filename, ArrayList<String> lines) {
        super(filename);
        this.lines = lines;
    }

    @Override
    public void printDocument() {
        System.out.println("fileName = " + fileName);

        for (String line : lines) {
            System.out.println("line = " + line);
        }
    }

    public void addLine(String line) {
        lines.add(line);
    }


}
