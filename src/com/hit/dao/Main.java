package com.hit.dao;

import com.hit.algorithem.BooksSorter;
import com.hit.algorithem.MergeSortAlgoImpl;
import com.hit.algorithem.QuickSortAlgoImpl;
import com.hit.dm.Book;
import com.hit.dm.BooksList;
import com.hit.utils.SortById;
import com.hit.utils.SortByName;
import com.hit.utils.SortByReview;
import com.hit.utils.SortByYear;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
        * This main is for testing purposes only
        *
        * 1) You will need to create a dao class for booksList , Customer , and rentedBooks.
        *     Each dao class will perform CRUD operations for the given class, using a json file
        *     CRUD - CREATE READ UPDATE DELETE
        * 2) Add two simple test to the algorithms module
        * 3) Create a ServiceBook class with the code from this main , and your dao class
        *
        *   I'm not sure if he want us to implements DAO class as an interface , your call.
        * */

        Book book1 = new Book("a", 3,1998);
        Book book2 = new Book("b" , 4,1989);
        Book book3 = new Book("c" , 5,1970);
        Book book4 = new Book("d" , 3.2,2020);
        Book book5 = new Book("e" , 1.5,2015);
        Book book6 = new Book("f" , 2.5,2006);
        Book book7 = new Book("g" , 3.6,2010);


        //Initialize a BookList for testing
        BooksList books = new BooksList();

        books.addNewBook(book1);
        books.addNewBook(book3);
        books.addNewBook(book4);
        books.addNewBook(book5);
        books.addNewBook(book7);
        books.addNewBook(book2);
        books.addNewBook(book6);


        // Here we are using the Strategy Pattern as required , testing MergeSort
        BooksSorter booksSorter = new BooksSorter(new MergeSortAlgoImpl());


        List<Book> resultArray = booksSorter.sort (books.getBooksArray() , new SortByYear());
        printBooksList(resultArray , "MergeSort" , "Year");

        resultArray = booksSorter.sort(books.getBooksArray() , new SortByName());
        printBooksList(resultArray , "MergeSort" , "Name");



        //Change strategy , testing QuickSort
        BooksSorter booksSorter2 = new BooksSorter(new MergeSortAlgoImpl());

        resultArray = booksSorter2.sort(books.getBooksArray() , new SortByReview());
        printBooksList(resultArray , "QuickSort" , "Review");


        resultArray = booksSorter2.sort(books.getBooksArray() , new SortById());
        printBooksList(resultArray , "QuickSort" , "id");

    }

    static void printBooksList(List<Book> sortedBooks , String sortAlgo , String sortBy){
        System.out.println("Sorting algorithm: " + sortAlgo);
        System.out.println("Sort by: " + sortBy);

        for(Book o : sortedBooks){
            System.out.println(o.toString());
        }
    }

}
