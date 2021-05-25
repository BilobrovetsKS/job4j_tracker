package ru.job4j.pojo;

public class ShopDrop {
    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Milk", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product.getName());

        }
    }

    public static Product[] delete (Product[] products, int index) {
        for (int i = index + 1; i < products.length; i++) {
            products[i - 1] = products[i];
                }
        products[products.length - 1] = null;
        return products;
            }
        }

