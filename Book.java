package com.example.Library;

public class Book {
    private String title;

    private String author;

    private String ISBN;

    private boolean availability;

    public Book(String title, String author, String iSBN, boolean availability) {
        this.title = title;
        this.author = author;
        ISBN = iSBN;
        this.availability = availability;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", availability=" + availability
                + "]";
    }

}
