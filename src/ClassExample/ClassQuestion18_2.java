package ClassExample;

import java.util.Scanner;

//7:3 ratio question
public class ClassQuestion18_2 {
    public static void main(String[] args) {
        int ratio1=7;
        int ratio2=3;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int checkNum=sc.nextInt();

         if(checkNum%(ratio1+ratio2)==0){
             System.out.println("The input number is valid in ratio of "+ratio1+" :"+ratio2);
         }
         else {
             System.out.println("The input is incorrect ratio");
         }
    }

}
