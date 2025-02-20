package Bert;

import java.security.cert.PKIXCertPathValidatorResult;

public class Product {
    private int number;
    private String name;
    private int quantity;
    private double price;

    public Product() {
        this.number = 0;
        this.name = "";
        this.quantity = 0;
        this.price = 0.0;
    }

    public Product(int number, String name, int quantity, double price) {
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print() {
        System.out.println("Number :" + number);
        System.out.println("Name :" + name);
        System.out.println("Quantity :" + quantity);
        System.out.println("Price :" + price);
    }
}