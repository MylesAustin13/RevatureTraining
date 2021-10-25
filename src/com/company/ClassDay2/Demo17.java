package com.company.ClassDay2;

class Book2{
    private String title;
    private String author;
    private int price;

    public Book2(String book_title, String book_author, int book_price){
        title = book_title;
        author = book_author; //Can use author or this.author
        price = book_price;

    }

    public void display(){
        System.out.println("Book : Title = "+ title + ", Author = " + author + ", Price = " + price);
    }
}

public class Demo17 {
    public static void main(String[] args) {
        Book2 book1 = new Book2("Ham", "Pizza Steve", 500);
        book1.display();

        Book2 book2 = new Book2("Jam", "Joseph Mama", -2);
        book2.display();
    }
}
