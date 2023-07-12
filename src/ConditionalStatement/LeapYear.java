package ConditionalStatement;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Welcome to leap year");
        Scanner sc=new Scanner(System.in);
        int year=1582;

        System.out.println("Enter your year: ");
        int a=sc.nextInt();
        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("COMMON YEAR");
        }
    }
}
