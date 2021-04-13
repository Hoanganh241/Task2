package task6;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    /** construct a book instance with the given author */
    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    //Getters and Setters
    /** Returns the name of this book */
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }

    public String toString() {
        return "'" + name + "' by" + author;
    }
}
