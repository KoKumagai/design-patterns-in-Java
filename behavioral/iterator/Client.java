package behavioral.iterator;

import behavioral.iterator.Item.Book;
import behavioral.iterator.Iterator.BookShelf;
import behavioral.iterator.Iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Head First Java"));
        books.add(new Book("Effective Java"));
        BookShelf bookShelf = new BookShelf(books);

        for (Iterator iter = bookShelf.getIterator(); iter.hasNext();) {
            Book book = (Book) iter.next();
            System.out.println("Title: " + book.getTitle());
            // Title: Head First Java
            // Title: Effective Java
        }
    }

}