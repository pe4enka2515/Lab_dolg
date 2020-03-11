package com.company;

public class Book {
    private int pages;
    private String author;
    private String title;


    Book(int pages, String author, String title){
        this.pages = pages;
        this.author = author;
        this.title = title;
    }

    void setPages(int pages) {
        this.pages = pages;
    }
    int getPages(){
        return pages;
    }

    void setAuthor(String author){
        this.author = author;
    }
    String getAuthor(){
        return author;
    }

    void setTitle(String title){
        this.title = title;
    }
    String getTitle(){
        return title;
    }

    public String toString() {
        return this.pages + ", price " + this.title;
    }
    public void outBook() {
        System.out.println("Книга " + title + ", автор - " + author + ", " + pages + "страниц");
    }
}
