package ass2_2;

import java.util.HashMap;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Book{id=" + id + ", name='" + name + "', author='" + author + "', quantity=" + quantity + "}";
    }
}

class Library {
    private HashMap<Integer, Book> bookCollection;

    public Library() {
        bookCollection = new HashMap<>();
    }

    public void addBook(Book book) {
        bookCollection.put(book.getId(), book);
    }

    public boolean isBookPresent(String bookName) {
        for (Book book : bookCollection.values()) {
            if (book.getName().equalsIgnoreCase(bookName)) {
                return true;
            }
        }
        return false;
    }

    public boolean removeBookById(int bookId) {
        if (bookCollection.containsKey(bookId)) {
            bookCollection.remove(bookId);
            return true;
        }
        return false;
    }

    public void displayBooks() {
        if (bookCollection.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : bookCollection.values()) {
                System.out.println(book);
            }
        }
    }
}

public class q5 {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(101, "The Alchemist", "Paulo Coelho", 10);
        Book book2 = new Book(102, "1984", "George Orwell", 5);
        Book book3 = new Book(103, "Java Programming", "James Gosling", 20);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("All books in the library:");
        library.displayBooks();

        String bookToCheck = "1984";
        if (library.isBookPresent(bookToCheck)) {
            System.out.println("\nBook '" + bookToCheck + "' is present in the library.");
        } else {
            System.out.println("\nBook '" + bookToCheck + "' is not present in the library.");
        }

        int bookIdToRemove = 102;
        if (library.removeBookById(bookIdToRemove)) {
            System.out.println("\nBook with ID " + bookIdToRemove + " has been removed from the library.");
        } else {
            System.out.println("\nBook with ID " + bookIdToRemove + " not found.");
        }

        System.out.println("\nBooks in the library after removal:");
        library.displayBooks();
    }
}
