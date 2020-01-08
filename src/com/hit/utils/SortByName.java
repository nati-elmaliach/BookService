package com.hit.utils;

import com.hit.dm.Book;

import java.util.Comparator;

public class SortByName implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
