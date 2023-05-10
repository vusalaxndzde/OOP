import exception.NegativeNumberException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0) {
            throw new NegativeNumberException(number);
        }
    }

}