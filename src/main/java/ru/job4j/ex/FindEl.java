package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;

    }

    public static void main(String[] args) {
        String[] array = {"Вася", "Петя", "Бобик", "Шарик"};
        try {
            int rsl = indexOf(array, "Шк");
            System.out.println(rsl);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

    }
}
