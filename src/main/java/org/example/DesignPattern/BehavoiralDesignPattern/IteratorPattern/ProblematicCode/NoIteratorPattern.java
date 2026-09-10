package org.example.DesignPattern.BehavoiralDesignPattern.IteratorPattern.ProblematicCode;

import java.util.ArrayList;
import java.util.List;

public class NoIteratorPattern {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("Book 1"));
        bookCollection.addBook(new Book("Book 2"));
        bookCollection.addBook(new Book("Book 3"));

        for (int i = 0; i < bookCollection.getBooks().size(); i++) {
            System.out.println(bookCollection.getBooks().get(i).getTitle());
        }
        // The issue is when the List will be changed to the Map then the code will not work.
    }
}
class Book{
    private  String title;
    public Book(String title){
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
    public void addBook(Book book){
        books.add(book);
    }
    public List<Book> getBooks(){
        return books;
    }
}