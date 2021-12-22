import java.util.*;

class Book1 {
    private String name;
    private int pages;

    public Book1(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return name + ": " + pages;
    }
}

public class BookSorter {
    public static void main(String[] args) {
        List<Book1> books = new ArrayList<Book1>();
        books.add(new Book1 ("The Mirror and the Light", 489));
        books.add(new Book1 ("The Glass Hotel", 281));
        books.add(new Book1 ("Uncanny Valley", 255));

        System.out.println("Sorted by name");
        books.sort(Comparator.comparing(Book1::getName));
        for (Book1 book: books) System.out.println(book);

        System.out.println();

        System.out.println("Sorted by name then number of pages");
        books.sort(Comparator.comparing(Book1::getName).thenComparing(Book1::getPages));
        for (Book1 book: books) System.out.println(book);
    }
}