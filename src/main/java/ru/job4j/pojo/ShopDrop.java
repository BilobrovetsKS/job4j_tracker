package ru.job4j.pojo;

public class ShopDrop {

    public static Product[] delete(Product[] foods, int index) {
        for (int i = index; i < foods.length - 1; i++) {
            foods[i] = foods[i + 1];
        }
        foods[foods.length - 1] = null;
        return foods;
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }
}


