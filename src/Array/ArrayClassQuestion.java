package Array;
import java.util.Scanner;
public class ArrayClassQuestion {
    public static void main(String[] args) {
        System.out.println("Elements of array");
        Scanner sc = new Scanner(System.in);

        int a = 10;

        System.out.println("Enter ten number of input from user: ");
        //FORMULA OF ARRAY
        int arr[] = new int[10];

        //PRINT USER INPUT VALUE
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        //ARRAY SORT LOGIC
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int b = arr[i];                           //NEW VARIABLE b
                    arr[i] = arr[j];
                    arr[j] = b;
                }

            }
        }

        //TO PRINT SORTED ARRAY
        System.out.println("Sorted Array: ");
        for (int i = 0; i < a; i++) {
            System.out.println(arr[i]);
        }
    }
}
