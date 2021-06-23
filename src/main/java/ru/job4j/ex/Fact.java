package ru.job4j.ex;

public class Fact {
    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("argument should be more then zero");
        } else {
            int rsl = 1;
            for (int i = 1; i <= n; i++) {
                rsl *= i;
            }
            return rsl;
        }
    }

    public static void main(String[] args) {
        int rsl = Fact.calc(1);
        System.out.println(rsl);
    }
}
