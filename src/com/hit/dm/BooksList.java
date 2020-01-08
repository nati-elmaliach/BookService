package com.hit.dm;

import java.util.ArrayList;
import java.util.List;

public class BooksList {
    private List<Book> booksArray;

    public BooksList() {
        this.booksArray = new ArrayList<>();
    }

    public List<Book> getBooksArray() {
        return booksArray;
    }

    public void addNewBook(Book newBook){
        booksArray.add(newBook);
    }

    public void setBooksArray(List<Book> booksArray) {
        this.booksArray = booksArray;
    }
}
