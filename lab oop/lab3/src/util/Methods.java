package util;

import java.util.Scanner;

public class Methods {

    // 1.  Write a program that receives 10 numbers and prints the minimum even number
    public static void printMaxEven() {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            int num = scanner.nextInt();
            if (num % 2 == 0 && num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }

    // 2.  Write a program that receives 10 numbers and prints the maximum odd number
    public static void printMaxOdd() {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            int num = scanner.nextInt();
            if (num % 2 == 1 && num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }

    // 3.  Write a program that receives 10 numbers and prints the maximum
    public static void printMax() {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }

    // 4.  Write a program that receives 10 numbers and prints the minimum
    public static void printMin() {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < 11; i++) {
            System.out.print("Enter number " + (i) + ": ");
            int num = scanner.nextInt();
            if (num < min) {
                min = num;
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
    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            int num = scanner.nextInt();
            if (num > 50) {
                System.out.println(num);
            }
        }
    }

    // 7.  Write a program that accepts 10 number and prints the numbers that are higher than 50 and smaller than 100.
    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            int num = scanner.nextInt();
            if (num > 50 && num < 100) {
                System.out.println(num);
            }
        }
    }

    // 8.  Write a program that accepts 10 numbers and prints all the numbers that are higher than 50, smaller than 100 and even.
    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            int num = scanner.nextInt();
            if (num > 50 && num < 100 && num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    // 9.  Write a program that accepts 10 numbers and print how many are higher than 20.
    public static void task9() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            int num = scanner.nextInt();
            if (num > 20) {
                count++;
            }
        }
        System.out.println(count);
    }

    // 10.  Write a program that accepts 10 numbers from the user and prints how many are higher than 10 and smaller than 20.
    public static void task10() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            int num = scanner.nextInt();
            if (num > 10 && num < 20) {
                System.out.println(num);
            }
        }
    }

    // 11.  Write a program that accepts 10 numbers and prints how many are higher than 10, smaller than 40 and odds.
    public static void task11() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            int num = scanner.nextInt();
            if (num > 10 && num < 40 && num % 2 == 1) {
                System.out.println(num);
            }
        }
    }

    // 12.  Write a program that accepts 10 numbers from the user and prints their sum.
    public static void printSumArr() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }

    // 13.  Write a program that accepts 10 numbers and prints the sum of all the numbers that are higher than 20.
    public static void printSumArrGreat20() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            int num = scanner.nextInt();
            if (num > 20) {
                sum += num;
            }
        }
        System.out.println(sum);
    }

    // 14.  Write a program that accepts 10 numbers and prints the sum of all the numbers that are smaller than 20.
    public static void printSumArrLow20() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            int num = scanner.nextInt();
            if (num < 20) {
                sum += num;
            }
        }
        System.out.println(sum);
    }

    // 15.  Write a program that accepts 10 numbers from the user and prints the sum of all the numbers that are higher than 10 and smaller than 30.
    public static void printSumArrLow30Great10() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            int num = scanner.nextInt();
            if (num > 10 && num < 30) {
                sum += num;
            }
        }
        System.out.println(sum);
    }

    // 16.  Write a program that accepts 10 numbers from the user and prints the sum of all the numbers that are higher than 10, smaller than 30 and even.
    public static void task16() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            int num = scanner.nextInt();
            if (num > 10 && num < 30 && num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }

    // 17.  Write a program that accepts the weight of 40 students. Print the maximum weight under 50kg.
    public static void task17() {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 40; i++) {
            System.out.print("Enter weight " + (i+1) + ": ");
            int num = scanner.nextInt();
            if (num > max && num < 50) {
                max = num;
            }
        }
        System.out.println(max);
    }

    // 18.  Write a program that accepts a positive number and prints all the smaller positive numbers that can be divided by 2.
    public static void task18() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // 19.  Write a program that accepts a number and prints all the smaller positive numbers that can't be divided by 2.
    public static void task19() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    // 23.  Write a program to find the sum of the digits of a natural number N.
    public static int sumDigits(int a) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    // 24.  Write a program to find the number of digits of a natural number N.
    public static int countDigits(int a) {
        int count = 0;
        while (a != 0) {
            count++;
            a /= 10;
        }
        return count;
    }

    // 25.  Write a program to determine the minimum of a given natural numbers
    public static void task25() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of natural numbers: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter a natural number: ");
            numbers[i] = scanner.nextInt();
        }

        int minimum = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
        System.out.println(minimum);
    }

}
