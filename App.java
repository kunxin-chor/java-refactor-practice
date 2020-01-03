package com.refactoring;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    String username;
    String password;
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Product> shoppingCart = new ArrayList<>();

    public void readProducts()
    {
        try {
            BufferedReader fr = new BufferedReader(new FileReader("products.txt"));
            String line = fr.readLine();
            while (line != null) {
                // create product from the line
                String[] chunks = line.split(",");
                Product p = new Product(chunks[0], Double.parseDouble(chunks[1]));
                products.add(p);
                line = fr.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void run()
    {
        readProducts();

        System.out.println("Welcome to ecommerce");
        System.out.println("PLease login");

        Scanner sc = new Scanner(System.in);
        System.out.println("Username: ");
        username = sc.next();
        System.out.println("Password:");
        password = sc.next();

        for (int i=0; i < products.size(); i++)
        {
            System.out.println("Product number:" + i);
            System.out.println("Product Name: " + products.get(i).getProductName());
            System.out.println("Product price:" + products.get(i).getCost());
            System.out.println();
        }

        System.out.println("Enter the product number you want to add to cart");
        int productNumber = sc.nextInt();
        shoppingCart.add( products.get(productNumber));

    }
}
