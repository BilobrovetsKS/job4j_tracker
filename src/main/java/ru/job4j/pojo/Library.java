package ru.job4j.pojo;

public class Library {


    public static void main(String[] args) {
        Book book1 = new Book("Master & Margarita", 328);
        Book book2 = new Book("Evenings on a farm near dikanka", 352);
        Book book3 = new Book("Chronicles of Amber", 1696);
        Book book4 = new Book("Clean code", 0);
        Book book5 = new Book(null, 0);
        Book[] books = new Book[5];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " " + bk.getPages());
        }
        System.out.println(System.lineSeparator() + "Replace book1 to book4:");
        Book replace = books[0];
        books[0] = books[3];
        books[3] = replace;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }

        System.out.println(System.lineSeparator() + "Shown only clean code:");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
    }

