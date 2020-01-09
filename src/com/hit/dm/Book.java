package com.hit.dm;

public class Book {

    /*
    * Feel free to add more fields to this class as needed.
    */
    private String name;
    static private int idCount = 1;
    private int id;
    private double review;
    private int year;

    public Book(String name , double review, int year) {
        this.name = name;

        // Increment the id for each new Book
        this.id = idCount++;

        // Max Review rate is 5
        if(review <= 5)
            this.review = review;
        else
            this.review = 5;

        this.year = year;
    }

    @Override
    public String toString(){
        return ("bookName: " + this.name + " Id:" + this.id + " Review:" + this.review + " Year:" + this.year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getReview() {
        return review;
    }

    public void setReview(double review) {
        this.review = review;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


/*

 * Are sorting algorithms allowed
 * Whats DAO?
 * Whats ServiceName?
 * Whats the overall structure requirements?
 * How to save data , How to connect data files?
 * Are comparators belong in the dao?
 * Is this a valid implementation of the strategy pattern
 *
 */
