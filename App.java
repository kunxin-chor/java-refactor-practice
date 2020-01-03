package com.refactoring;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    User currentUser;
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Product> shoppingCart = new ArrayList<>();

    // input function

    public void run()
    {
        ProductReader p = new ProductReader();
        p.readProducts(products);

        printIntro();

        login();

        printProductInformation();

        addToCart();

    }

    public void printIntro()
    {
        System.out.println("Welcome to ecommerce");
        System.out.println("PLease login");
    }

    public void login()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Username: ");
        String username = sc.next();
        System.out.println("Password:");
        String password = sc.next();

        currentUser = new User(username, password);
    }

    // output
    public void printProductInformation()
    {
        for (int i=0; i < products.size(); i++)
        {

            System.out.println("Product number:" + i);
            System.out.println("Product Name: " + products.get(i).getProductName());
            System.out.println("Product price:" + products.get(i).getCost());
            System.out.println();
        }
    }

    public void addToCart()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product number you want to add to cart");
        int productNumber = sc.nextInt();
        shoppingCart.add( products.get(productNumber));

    }
}
