package Array;
import java.util.Scanner;
public class ArrayClassQuestion {
    public static void main(String[] args) {
        System.out.println("Elements of array");
        Scanner sc=new Scanner(System.in);

        int a=10;
        int arr[]=new int[a];
        System.out.println("Enter ten number of input from user: ");
        for (int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }

        for (int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int b=arr[i];
                    arr[i]=arr[j];
                    arr[j]=b;
                }

            }
        }
        System.out.println("Sorted Array");
        for(int i=0;i<a;i++){
            System.out.println(arr[i]);
        }
        }

    }

