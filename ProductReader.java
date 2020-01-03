package com.refactoring;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProductReader {
    public void readProducts(ArrayList<Product> products)
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

}
