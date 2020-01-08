package com.hit.utils;

import com.hit.dm.Book;

import java.util.Comparator;

public class SortByReview implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return Double.compare(o2.getReview() ,o1.getReview()) ;
    }
}
