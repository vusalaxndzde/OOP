package util;

public class Methods {

    // Write a program that accepts 5 numbers in array. Print how many even numbers there are.
    public static void task1(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    

}
