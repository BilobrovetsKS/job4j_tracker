package ru.job4j.pojo;

import ru.job4j.oop.LiquidationProduct;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("butter", 5);
        products[1] = new Product("eggs", 10);
        products[2] = new Product("lamb", 10);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            }
        }
    }

    public static int indexOfNull(Product[] products) {
        int index = -1;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product == null) {
                index = i;
                break;
            }

        }
        return index;
    }
}
