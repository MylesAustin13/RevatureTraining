package com.company.ClassDay3;

class Book{
    public String title;
    public String author;
    public int price;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display(){
        System.out.println("Book: Title = " + title + ", Author = " + author + ", Price = " + price);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Book book1 = new Book("Review of Day2", "Me", 0);
        Book book2 = new Book("Today's Lesson", "Varun Gupta", 12);
        book1.display();
        book2.display();
    }
}
