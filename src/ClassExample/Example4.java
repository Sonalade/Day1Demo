package ClassExample;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        System.out.println("Welcome to calculator");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Enter\n 1; Addition\n 2; Subtraction\n 3;Multiplication\n 4;Division");

        System.out.println("sum = " + (a + b));
        System.out.println("sub = " + (a - b));
        System.out.println("mul = " + (a * b));
        System.out.println("div = " + (a / b));

        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("sum = " + (a + b));
                break;
            case 2:
                System.out.println("sub = " + (a + b));
                break;
            case 3:
                System.out.println("mul = " + (a + b));
                break;
            case 4:
                System.out.println("div = " + (a + b));
                break;


        } if (input == 2) {

        } else if (input == 3) {

        } else if (input == 3) {

        } else if (input == 3) {

        } else {
            System.out.println("invalid");
        }
    }
}