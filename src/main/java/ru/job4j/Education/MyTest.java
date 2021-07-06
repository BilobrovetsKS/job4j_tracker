package ru.job4j.Education;

public class MyTest {
    public static int BinSearch (int[] array, int item) {
        int rsl = -1;
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            if (guess == item) {
                rsl = mid;
            } else {
                if (guess > item) {
                    high = mid - 1;
                } else {
                    high = mid + 1;
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 3, 5, 7, 9};
        int rsl = MyTest.BinSearch(array, 3);
        System.out.println(rsl);
    }
}

