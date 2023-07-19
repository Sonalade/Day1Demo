package ClassExample;

public class ClassQuestion18 {
    public static void main(String[] args) {
        System.out.println("Swapping 2 numbers without 3rd variable: ");
        int num1=10;
        int num2=20;
        int num3=30;

        num1=num1+num2;
        //now  num1=20;num2=20
        num2=num1+num2;
        //now num1=20;num2=10
        num1=num1-num2;
        //now num1=20; num2=10

        num2=num2+num3;
        //num2=40;num3=30
        num3=num2-num3;
        //num2=40;num3=10
        num2=num2-num3;
        //num2=30;num3=10
        System.out.println(num1+" "+num2+" "+num3);

    }
}
