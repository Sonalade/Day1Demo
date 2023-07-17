package Array;

public class ForEachArray {
    public static void main(String[] args) {

//        //FOR EACH 1D ARRAY
        int arr[] = new int[]{10, 20, 30, 40, 50};                     //DECLARATION
//        arr[0] = 10;                                //INITIALIZATION
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;
//
        for (int i : arr) {                           //FOR EACH LOOP
            System.out.print(i + "\t");
        }


        //FOR EACH 2D ARRAY
        int arr1[][] = new int[3][3];
        arr1[0][0] = 60;
        arr1[0][1] = 70;
        arr1[0][2] = 80;
        arr1[1][0] = 90;
        arr1[1][1] = 100;
        arr1[1][2] = 110;
        arr1[2][0] = 120;
        arr1[2][1] = 130;
        arr1[2][2] = 140;


        for (int i = 0; i < arr1.length; i++) {                    //FOR LOOP
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }


        for (int[] i : arr1) {                                   //FOR EACH LOOP
            for (int j : i) {
                System.out.println(j + " ");
            }
        }




        //WAP TO FIND FIRST 10 WHOLE NUMBERS

        int a=2000;
        for (int i=0;i<a;i++){
            System.out.println(2*i+1);
        }


    }

        }

