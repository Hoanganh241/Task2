package task6;

import java.awt.*;

public class TestBook {
    public static void main (String[] args) {
        //We need an Author instance to creat a Book instance
        Author ahTeck = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
        System.out.println(ahTeck);
        //Tan Ah Teck (m) at ...

        //Test Book's constructors and toString()
        Book dummyBook = new Book("Java for dummiew", ahTeck, 9.99, 99);
        System.out.println(dummyBook);

        System.out.println("name is: " + dummyBook.getName());

        System.out.println("price is: " + dummyBook.getPrice());

        System.out.println("qty is: " + dummyBook.getQty());

        System.out.println("Author is: " + dummyBook.getAuthor());

        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());

        System.out.println("Author's email is: " +dummyBook.getAuthor().getEmail());

        System.out.println("Author's gender is: " + dummyBook.getAuthor().getGender());

        //Using an anonymous Author...
        Book moreDummnyBook = new Book("Java for more dummies", new Author("Peter Lee", "peter@nowhere.com", 'm'), 19.99, 8);
        System.out.println(moreDummnyBook);
    }
}
