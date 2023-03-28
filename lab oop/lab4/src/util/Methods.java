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

    // Write a program that accepts 5 numbers in array. Print how many odd numbers there are.
    public static void task2(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 1) {
                count++;
            }
        }
        System.out.println(count);
    }

    // Write a program that accepts 10 numbers in array. Print only the even numbers.
    public static void task3(int[] arr) {
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // Write a program that accepts 10 numbers in array. Print only the elements in the even indexes. (0, 2, 4, 6…)
    public static void task4(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    // Write a program that accepts 10 numbers in array. Print only the elements in the odd indexes. (1, 3, 5…)
    public static void task5(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                System.out.println(arr[i]);
            }
        }
    }

    // Write a program that accepts 10 numbers in array. Print only the elements in the indexes that can be divided by 3. (0, 3, 6, 9…)
    public static void task6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    // Write a program that accepts 10 numbers in array. Print only the elements that their values can be divided by 3.
    public static void task7(int[] arr) {
        for (int i : arr) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    // Write a program that accepts 10 numbers in array. Print only the elements that their values can’t be divided by 3.
    public static void task8(int[] arr) {
        for (int i : arr) {
            if (i % 3 == 1) {
                System.out.println(i);
            }
        }
    }

    // Write a program that accepts 5 numbers in array. Print only the elements that their values can’t be divided by 3 or 2.
    public static void task9(int[] arr) {
        for (int i : arr) {
            if (i % 3 == 1 || i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    // Write a program that accepts an array and a number “x”. Print all the elements that are smaller than “x”.
    public static void task10(int[] arr, int x) {
        for (int i : arr) {
            if (i < x) {
                System.out.println(i);
            }
        }
    }

    // Write a program that accepts 10 numbers in array. Print how many even numbers exist in the array.
    public static void task11(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    // Write a program that accepts 15 numbers in array. Print the elements’ sum.
    public static void task12(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }

}
