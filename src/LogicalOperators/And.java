package LogicalOperators;

import java.util.Scanner;

public class And {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);

 //       int age = sc.nextInt();
//        if(age>=18 && age<=60){
//            System.out.println("Eligible");
//        }
//        else {
//            System.out.println("Not Eligible");
//        }
//    }


        int age1 = sc.nextInt();
        if (age1 > 18) {
            if (age1 < 60) {
                System.out.println("eligible");
            }
            else {
                System.out.println("not eligible");
            }
        }
    }
}