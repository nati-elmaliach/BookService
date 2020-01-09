package com.hit.dm;

import java.util.Date;

public class RentedBooks {

    /*
     * Feel free to add more fields to this class as needed.
     */

    private int bookId;
    private int customerId;
    private Date rentalStartingDate;
    private Date rentalEndingDate;

    public RentedBooks(int bookId, int customerId, Date rentelStartingDate, Date rentelEndinggDate) {
        this.bookId = bookId;
        this.customerId = customerId;
        this.rentalStartingDate = rentelStartingDate;
        this.rentalEndingDate = rentelEndinggDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getRentalStartingDate() {
        return rentalStartingDate;
    }

    public void setRentalStartingDate(Date rentalStartingDate) {
        this.rentalStartingDate = rentalStartingDate;
    }

    public Date getRentalEndingDate() {
        return rentalEndingDate;
    }

    public void setRentalEndingDate(Date rentalEndingDate) {
        this.rentalEndingDate = rentalEndingDate;
    }
}
