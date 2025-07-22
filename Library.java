package com.example.Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added");
    }

    public void removeBook(Book book){
        if(book.isAvailability()){
            books.remove(book);
        }else{
            System.out.println("That book is not available");
        }
    }

    public List<Book> displayBooks(){
        for(Book book : books)
        {
            System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getISBN() + " " + book.isAvailability());
        }
        return books;
    }

    public boolean borrowBook(){

    }
}
