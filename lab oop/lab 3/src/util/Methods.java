package util;

public class Methods {

    // 1.  Write a program that receives 10 numbers and prints the minimum even number
    public static void printMaxEven(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i % 2 == 0 && i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }

    // 2.  Write a program that receives 10 numbers and prints the maximum odd number
    public static void printMaxOdd(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (!(i % 2 == 0) && i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }

    // 3.  Write a program that receives 10 numbers and prints the maximum
    public static void printMax(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }

}







