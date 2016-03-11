package behavioral.iterator.Iterator;

import behavioral.iterator.Item.Book;

import java.util.List;

public class BookShelf implements Container {

    private List<Book> books;

    public BookShelf(List<Book> books) {
        this.books = books;
    }

    @Override
    public Iterator getIterator() {
        return new BookIterator();
    }

    private class BookIterator implements Iterator {

        private int index;

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return books.get(index++);
            }
            return null;
        }

    }

}