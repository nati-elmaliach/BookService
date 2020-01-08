package com.hit.dao;

import com.hit.algorithem.BooksSorter;
import com.hit.algorithem.MergeSortAlgoImpl;
import com.hit.dm.Book;
import com.hit.dm.BooksList;
import com.hit.utils.SortByName;
import com.hit.utils.SortByYear;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("a" ,1 , 3,1998);
        Book book2 = new Book("b" ,2 , 4,1989);

        BooksList books = new BooksList();
        books.addNewBook(book1);
        books.addNewBook(book2);

        BooksSorter booksSorter = new BooksSorter(new MergeSortAlgoImpl());

        List<Book> resultArray = booksSorter.sort (books.getBooksArray() , new SortByYear());
        books.setBooksArray(resultArray);

        for(Book o : resultArray){
            System.out.println(o.toString());
        }
    }
}
