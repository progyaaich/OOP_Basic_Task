import java.util.ArrayList;

class Book {
    String title, author, ISBN;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String toString() {
        return title + " by " + author + " (ISBN: " + ISBN + ")";
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book);
    }

    void removeBook(Book book) {
        books.remove(book);
        System.out.println("Removed: " + book);
    }

    public static void main(String[] args) {
        Library lib = new Library();
        Book b1 = new Book("Java Basics", "James", "123");
        Book b2 = new Book("OOP Concepts", "John", "456");

        lib.addBook(b1);
        lib.addBook(b2);
        lib.removeBook(b1);
    }
}
