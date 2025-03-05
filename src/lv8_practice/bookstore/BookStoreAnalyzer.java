package lv8_practice.bookstore;

import java.util.ArrayList;
import java.util.HashMap;

public class BookStoreAnalyzer {

    private ArrayList<Book> books; // wenn man hier ein Set verwendet, stellt es sicher dass ein element nur 1 mal drin ist

    public BookStoreAnalyzer(){
        books = new ArrayList<>();
    }

    public void addBooks(Book b){
        if (!books.contains(b)){
            books.add(b);
        }
    }

    public HashMap<String, Integer> getCountBooksInCategory(){
        HashMap<String, Integer> result = new HashMap<>();

        for (Book b : books){
            if (result.containsKey(b.getCategory())){ // nachschauen ob drinnen
                // es gibt schon einen Eintrag, dann manipulieren
                int currentCounter = result.get(b.getCategory());
                currentCounter++;
                result.put(b.getCategory(), currentCounter);

                // result.put(b.getCategory(), result.get(b.getCategory() + 1)); //-> oneliner
            } else { // wenn nicht drinnen dann initialisiereen
                result.put(b.getCategory(), 1);
            }
        }

        return result;
    }
}
