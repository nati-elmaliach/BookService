package com.hit.dm;

public class Book {
    private String name;
    private int id;
    private double review;
    private int year;

    public Book(String name, int id, double review, int year) {
        this.name = name;
        this.id = id;
        this.review = review;
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
