package WrapperClass;

public class Boxing {
    public static void main(String[] args) {
        int a = 1234;
        int b = 5678;
        int c = 9101;
        //Boxing
        Integer a1 = a;
        Integer b1 = b;
        Integer c1 = c;
        //Unboxing
        int a2 = a1;
        int b2 = b1;
        int c2 = c1;

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);

    }

}
