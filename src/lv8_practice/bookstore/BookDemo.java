package lv8_practice.bookstore;

public class BookDemo {

    public static void main(String[] args) {

        PrintedBook pbook = new PrintedBook("1984", "George Orwell", "Roman", 8.9, 384);
        pbook.addRating(new Rating(5, "super"));
        pbook.addRating(new Rating(4, "gut"));

        DigitalBook dbook = new DigitalBook("1984", "George Orwell", "Roman", 8.9, "file.epub", 1500);

        PrintedBook pbook2 = new PrintedBook("Frosch", "Nobody", "Kinderbuch", 10, 124);

        pbook.printPresentationPage();
        dbook.printPresentationPage();

        BookStoreAnalyzer bsa = new BookStoreAnalyzer();
        bsa.addBooks(pbook);
        bsa.addBooks(dbook);
        bsa.addBooks(pbook2);

        System.out.println("bsa.getCountBooksInCategory() = " + bsa.getCountBooksInCategory());
    }
}
