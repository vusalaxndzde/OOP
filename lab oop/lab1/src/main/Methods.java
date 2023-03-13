package main;

public class Methods {

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void info(String name, String surname) {
        System.out.println("my name is " + name + " and surname is " + surname);
    }

    public static void printMin(double a, double b) {
        if (a > b) {
            System.out.println(b);
        } else if (b > a) {
            System.out.println(a);
        } else {
            System.out.println("a = b");
        }
    }

    public static void printMin(double a, double b, double c) {
        if (a > c && b > c) {
            System.out.println(c);
        } else if (a > b && c > b) {
            System.out.println(b);
        } else if (b > a && c > a) {
            System.out.println(a);
        } else {
            System.out.println("a = b = c");
        }
    }

    public static void remainderWeight(double davidWeight, double uziWeight) {
        System.out.println(davidWeight % uziWeight);
    }

    public static void condition(double a, double b) {
        if (a > b) {
            System.out.println(a + b);
        } else if (b > a) {
            System.out.println(a * b);
        } else {
            System.out.println("a = b");
        }
    }

    public static void isHasTwoDigit(int a) {
        int count = 0;
        while (a != 0) {
            a /= 10;
            count++;
            if (count > 2) {
                break;
            }
        }
        if (count == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static int sumDigits(int a) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    public static void weekday(int a) {
        switch (a) {
            case 1:
                System.out.println("1ci gun");
                break;
            case 2:
                System.out.println("2ci gun");
                break;
            case 3:
                System.out.println("3ci gun");
                break;
            case 4:
                System.out.println("4ci gun");
                break;
            case 5:
                System.out.println("5ci gun");
                break;
            case 6:
                System.out.println("6ci gun");
                break;
            case 7:
                System.out.println("7ci gun");
                break;
            default:
                System.out.println("invalid number");
        }
    }

    public static void task14(int a) {
        int units = a % 10;
        int hundreds = a / 100;

        if (units == hundreds) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static int sumDigits(int a, int b, int c, int d) {
        int[] numbers = {a, b, c, d};
        int sum = 0;
        for (int number : numbers) {
            sum += sumDigits(number);
        }
        return sum;
    }

}
