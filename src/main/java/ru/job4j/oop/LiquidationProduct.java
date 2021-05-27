package ru.job4j.oop;

import ru.job4j.pojo.Product;

public class LiquidationProduct {
    private Product product;

    public LiquidationProduct(String name, int price) {

        product = new Product(name, price);
    }

    public Product getProduct() {
        return product;
    }

    public String label() {
        return product.getName();
    }
}