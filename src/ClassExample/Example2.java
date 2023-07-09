package ClassExample;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Welcome to calculator");

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();

        System.out.println("Enter\n 1; Addition\n 2; Subtraction\n 3;Multiplication\n 4;Division");

        System.out.println("sum = "+(a+b));
        System.out.println("sub = "+(a-b));
        System.out.println("mul = "+(a*b));
        System.out.println("div = "+(a/b));

    }
}
