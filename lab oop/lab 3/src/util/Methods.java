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

    // 4.  Write a program that receives 10 numbers and prints the minimum
    public static void printMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }

    // 5.  Write a program that prints all the numbers from 1 to 100 that can be divided by 3 and 2.
    public static void task5() {
        int a = 1;
        while (a != 100) {
            if (a % 2 == 0 && a % 3 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }

    // 6.  Write a program that accepts 10 numbers and prints the number only if it's higher than 50.
    public static void task6(int[] arr) {
        for (int i : arr) {
            if (i > 50) {
                System.out.println(i);
            }
        }
    }

    // 7.  Write a program that accepts 10 number and prints the numbers that are higher than 50 and smaller than 100.
    public static void task7(int[] arr) {
        for (int i : arr) {
            if (i > 50 && i < 100) {
                System.out.println(i);
            }
        }
    }

    // 8.  Write a program that accepts 10 numbers and prints all the numbers that are higher than 50, smaller than 100 and even.
    public static void task8(int[] arr) {
        for (int i : arr) {
            if (i > 50 && i < 100 && i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // 9.  Write a program that accepts 10 numbers and print how many are higher than 20.
    public static void task9(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i > 20) {
                count++;
            }
        }
        System.out.println(count);
    }

    // 10.  Write a program that accepts 10 numbers from the user and prints how many are higher than 10 and smaller than 20.
    public static void task10(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i < 20 && i > 10) {
                count++;
            }
        }
        System.out.println(count);
    }

    // 11.  Write a program that accepts 10 numbers and prints how many are higher than 10, smaller than 40 and odds.
    public static void task11(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i < 40 && i > 10 && i % 2 == 1) {
                count++;
            }
        }
        System.out.println(count);
    }

    // 12.  Write a program that accepts 10 numbers from the user and prints their sum.
    public static void printSumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }

    // 13.  Write a program that accepts 10 numbers and prints the sum of all the numbers that are higher than 20.
    public static void printSumArrGreat20(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 20) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    // 14.  Write a program that accepts 10 numbers and prints the sum of all the numbers that are smaller than 20.
    public static void printSumArrLow20(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i < 20) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}






