import java.util.Iterator;
import java.util.Stack;

class Book {

    private int bookId ;
    private String title ;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }
    public Book() {}

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                '}';
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static class NamesIterator {

        private String names ;

        public NamesIterator(String names) {
            this.names = names;
        }


        public String getNames() {
            return names;
        }

        public void setNames(String names) {
            this.names = names;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Collection framework");

        // Stack
        Book b1 = new Book(1,"Java Complete Reference") ;
        Book b2 = new Book(2,"Let Us C") ;
        Book b3 = new Book(3, "Let Us C++") ;

        Stack<Book> books = new Stack<>() ;
        books.push(b1) ;
        books.push(b2) ;
        books.push(b3) ;

        // top
        System.out.println(books.peek().toString()); //Book{bookId=3, title='Let Us C++'}

        // all
        System.out.println(books.toString()); // [Book{bookId=1, title='Java Complete Reference'}, Book{bookId=2, title='Let Us C'}, Book{bookId=3, title='Let Us C++'}]

        // pop
        System.out.println(books.pop().toString()); // Book{bookId=3, title='Let Us C++'}

        // Iterating a List

        // 1. for loop
        for (int i = 0 ; i < books.size(); i++){
            System.out.println(books.get(i).toString());

            /*
            OUTPUT:
                    Book{bookId=3, title='Let Us C++'}
                    Book{bookId=1, title='Java Complete Reference'}
                    Book{bookId=2, title='Let Us C'}
             */
        }
        // 2. for-each loop
        for (Book book : books){
            System.out.println(book.toString());
             /*
            OUTPUT:
                    Book{bookId=3, title='Let Us C++'}
                    Book{bookId=1, title='Java Complete Reference'}
                    Book{bookId=2, title='Let Us C'}
             */
        }
        // 3. iterator
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()){
            iterator.next().toString() ;
        }

    }
}
