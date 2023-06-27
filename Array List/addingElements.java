import java.util.*;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }
}

public class addingElements {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<Book>(); // declaring new arraylist of name list
        Book b1 = new Book(101, "DSA", "Yash", 8); // intialising the variables of object b1 of class book
        Book b2 = new Book(102, "Data Communications and Networking", "Ayush", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", 6);
        list.add(b1); // adding the object into the list
        list.add(b2);
        list.add(b3);
        for (Book b : list) { // traversing through list and accessing the element by object b of class book
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.quantity);
        }
    }
}
