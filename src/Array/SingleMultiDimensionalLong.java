package Array;

public class SingleMultiDimensionalLong {
    public static void main(String[] args) {

//        int[] array=new int[5];
//        array[0]=10;
//        array[1]=20;
//        array[2]=30;
//        array[3]=40;
//        array[4]=50;
//
//        for(int i=0; i<array.length;i++) {
//            System.out.println(i);
//        }
//


        //declaring and initializing 2D array
        int[][] arr = new int[2][3];
        arr[0][0] = 11;
        arr[0][1] = 12;
        arr[0][2] = 13;
        arr[1][0] = 14;
        arr[1][1] = 15;
        arr[1][2] = 16;

        //printing 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {


                System.out.println(arr[i][j]+ "");

            }

        }
    }
}
