public class LeapYear {
    public static void main(String[] args) {
        boolean b=check(2);
        System.out.println(b);

    }
    public static boolean check(int a){
        if(a%2==0){
            return true;
        }
        else
            return false;

    }
}

