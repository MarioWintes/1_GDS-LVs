package lv8_practice.bookstore;

public class PrintedBook extends Book{

    private int countPages;

    public PrintedBook(String title, String author, String category, double price, int countPages) {
        super(title, author, category, price); // Konstruktor der basisklasse
        this.countPages = countPages;
    }

    @Override
    public void printPresentationPage() {
        System.out.println("Titel: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Buchkategorie: " + category);
        System.out.println("Rating: " + calculateRating());
        System.out.println("Preis: " + price);
        System.out.println("Seiten: " + countPages);
    }
}
