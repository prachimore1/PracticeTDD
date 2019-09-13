package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        if(books.size() != 1) {
            return books.size() * 8.00d;
        } else {
            return books.size() * 8.00d;
        }
    }
}
