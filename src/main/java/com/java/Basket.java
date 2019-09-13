package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Basket {
    List<Integer> books;

    public Basket() {
        this.books = new ArrayList<Integer>();
    }

    public List<Integer> getBooks() {
        return books;
    }

    public void add(int bookIndex) {
        if(bookIndex > 0 && bookIndex < 6) {
            books.add(bookIndex);
            Collections.sort(books);
        }
    }
    public double checkout() {
        // put list in set and check if both are equal
        return books.size() * 8.00d;
    }

}
