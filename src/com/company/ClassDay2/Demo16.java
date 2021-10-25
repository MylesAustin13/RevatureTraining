package com.company.ClassDay2;

/**
 * Book - title, author, price
 *
 *
 * */

class Book{
    public String title;
    public String author;
    public int price;
    public int isbn;

    public void display(){
        System.out.println("Book : Title = "+ title + ", Author = " + author + ", ISBN = " + isbn + ", Price = " + price);
    }
}


public class Demo16 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "A Good Title";
        book1.author = "Joe Schmoe";
        book1.isbn = 121212;
        book1.price = 100;

        Book book2 = new Book();
        book2.title = "A Lesser Title";
        book2.author = "Negative Nancy";
        book2.isbn = 383838;
        book2.price = 200;

        book1.display();
        book2.display();
        /*
        System.out.println("Book : Id = "+ book1.title + ", Author = " + book1.author + ", Price = " + book1.price);
        System.out.println("Book : Id = "+ book2.title + ", Author = " + book2.author + ", Price = " + book2.price);
        */
    }
}
