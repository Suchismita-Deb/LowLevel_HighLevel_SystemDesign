package org.example.DesignPattern.BehavoiralDesignPattern.IteratorPattern.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class IteratorPattern {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("Book 1"));
        bookCollection.addBook(new Book("Book 2"));
        bookCollection.addBook(new Book("Book 3"));

        Iterator<Book> iterator = bookCollection.createIterator();

        // The createIterator() will return Iterator<Book> and then traverse.
        while (iterator.hasNext()) {


            Book book = iterator.next();
            System.out.println(book.getTitle());
        }

        // The main method does not work with the iterator of the collection. The change in the collection then the separate class will work.
    }
}

interface Iterator<T> {
    boolean hasNext();

    T next();
}

// The Iterator interface build in exists and we are using in the pattern.
class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

class BookCollection {
    public List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
    // The class to implement the Iterator.

    private class BookIterator implements Iterator<Book> {
        private List<Book> books;
        private int position = 0;
        public BookIterator(List<Book> books) {
            this.books = books;
        }
        @Override
        public boolean hasNext() {
            return position < books.size();
        }
        @Override
        public Book next() {
            return books.get(position++);
        }
    }

    // The BookIterator is a private class and making a public method to create an object of the Iterator.
    public Iterator<Book> createIterator() {
        return new BookIterator(this.books);
    }
}

// The Iterator classes will be the nested classes inside the container as the Iterator depends on the container like the Array or Tree.

// The Pattern states that when the list will be changed to tree then the main method does not have to implement any change and the Book Iterator class will make the change.

