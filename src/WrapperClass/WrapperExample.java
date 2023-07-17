package WrapperClass;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        //upcasting -is not explicit
//        float c = a;
//        float d = b;
//        System.out.println(c);
//        System.out.println(d);


//        //downcasting - it should be explicit

        String s1 = "1234567";           //CONVERT STRING INTO INT
        int f = Integer.parseInt(s1);                  //Integer.parseInt=(CONVERT STRING INTO INT)
        System.out.println(f);

        double e = 50.50;              //CONVERT DOUBLE INTO INT
        int d = (int) e;
        System.out.println(d);
    }
}
