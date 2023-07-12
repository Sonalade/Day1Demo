package ConditionalStatement;

import java.util.Scanner;

public class SwitchCaseNew {
    public static void main(String[] args) {
        System.out.println("Welcome to calculator");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();

        System.out.println("Enter case number: ");
        int input = sc.nextInt();

        switch (input) {
            case 1-> System.out.println("sum= "+(a+b));
            case 2-> System.out.println("sub= "+(a+b));
            case 3-> System.out.println("mul= "+(a+b));
            case 4-> System.out.println("div= "+(a+b));
        }
    }
}
