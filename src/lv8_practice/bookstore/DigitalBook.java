package lv8_practice.bookstore;

public class DigitalBook extends Book{

    private String fileName;
    private int fileSize;

    public DigitalBook(String title, String author, String category, double price, String fileName, int fileSize) {
        super(title, author, category, price);
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    @Override
    public void printPresentationPage() {
        System.out.println("Titel: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Buchkategorie: " + category);
        System.out.println("Rating: " + calculateRating());
        System.out.println("Datei: " + fileName + ", " + fileSize + " KB");
    }
}
