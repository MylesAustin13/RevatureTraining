package com.company.ClassDay7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Demo20 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"Laptop",300));
        productList.add(new Product(2,"RGB Bedframe",500));
        productList.add(new Product(3,"Powdered Toastman Figurine",100));
        productList.add(new Product(4,"Pizza Slice",3));
        productList.add(new Product(5,"Desk",200));

        //No Stream API
        List<Integer> resultList = new ArrayList<>();
        for (Product product : productList) {
            //filter data of the list
            if(product.price > 275){ //Condition
                resultList.add(product.price); //Add to results if meets condition
            }
        }
        System.out.println(resultList);

        //With Stream API
        List<String> result = productList.stream()
                .filter(p -> p.price >= 100 && p.name.contains("e"))
                .map(p -> p.name) //fetch prices
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
