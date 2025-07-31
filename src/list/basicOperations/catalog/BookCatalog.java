package list.basicOperations.catalog;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private List<Book> catalog;

    public BookCatalog() {
        this.catalog = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.catalog.add(book);
    }

    public List<Book> filterByAuthor(String name) {
        List<Book> byAuthor = new ArrayList<>();
        if (catalog.isEmpty()) {
            throw new RuntimeException("Catalogo está vazio.");
        }

        for (Book book : catalog) {
            if (name.equalsIgnoreCase(book.getAuthor())){
                byAuthor.add(book);
            }
        }

        return byAuthor;
    }

    public List<Book> filterByPublication(int initial, int end) {
        List<Book> byPublication = new ArrayList<>();

        if (catalog.isEmpty()){
            throw new RuntimeException("Catalogo está vazio.");
        }

        for (Book book : catalog) {
            if(book.getPublicationYear() >= initial && book.getPublicationYear() <= end) {
                byPublication.add(book);
            }
        }

        return byPublication;
    }

    public List<Book> filterByTitle(String title) {
        List<Book> byTitle = new ArrayList<>();

        if (catalog.isEmpty()){
            throw new RuntimeException("Catalogo está vazio.");
        }

        for (Book book : catalog) {
            if(book.getTitle().equalsIgnoreCase(title)) {
                byTitle.add(book);
            }
        }

        return byTitle;
    }

    public static void main(String[] args) {
        var catalog = new BookCatalog();

        catalog.addBook(new Book("Livro 1", "Autor 1", 1980));
        catalog.addBook(new Book("Livro 2", "Autor 1", 1990));
        catalog.addBook(new Book("Livro 3", "Autor 2", 1985));
        catalog.addBook(new Book("Livro 4", "Autor 3", 2000));
        catalog.addBook(new Book("Livro 5", "Autor 3", 2005));
        catalog.addBook(new Book("Livro 6", "Autor 3", 2020));
        catalog.addBook(new Book("Livro 7", "Autor 4", 1997));

        System.out.println(catalog.filterByAuthor("Autor 1"));
        System.out.println(catalog.filterByPublication(1980, 1997));
        System.out.println(catalog.filterByTitle("Livro 2"));
    }
}
