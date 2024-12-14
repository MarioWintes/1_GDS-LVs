package lv8_practice.bookstore;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Book {

    protected String title;
    protected double price;
    protected String author;
    protected String category;
    protected ArrayList<Rating> ratings; // auch hier initialisieren
    protected int bookID;

    private static int BOOKCOUNTER = 1;


    public Book(String title, String author, String category, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        ratings = new ArrayList<>();

        this.bookID = BOOKCOUNTER++;

        switch (category){
            case "Sachbuch":
            case "Roman":
            case "Krimi":
            case "Kinderbuch":
                this.category = category;
                break;
            default:
                this.category = "Sonstiges";
        }


    }

    public void addRating(Rating r){
        this.ratings.add(r);
    }

    public double calculateRating(){
        if (ratings.size() == 0){
            return -1;
        }

        double ratingSum = 0;
        for (Rating r : ratings){
            ratingSum += r.getStars();
        }
        return ratingSum / (ratings.size() * 1.0);
    }

    public abstract void printPresentationPage();

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public ArrayList<Rating> getRatings() {
        return ratings;
    }

    public int getBookID() {
        return bookID;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", ratings=" + ratings +
                ", bookID=" + bookID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && bookID == book.bookID && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(category, book.category) && Objects.equals(ratings, book.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, author, category, ratings, bookID);
    }
}
