package lv7_;

import java.util.ArrayList;

public class PrintManager {

    private ArrayList<Document> documents;

    public PrintManager() {
        this.documents = new ArrayList<>();
    }

    public void addDocument(Document doc) {
        this.documents.add(doc);
    }

    public void printAll(){
        for(Document doc : this.documents){
            doc.printDocument();
        }
    }
}
