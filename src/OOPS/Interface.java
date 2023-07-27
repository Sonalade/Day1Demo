package OOPS;

public class Interface { public static void main(String[] args) {

    D d=new D();
    d.print();
    
    A a=new A();
    a.print();

}
}
class A{
    public void print(){
        System.out.println("This is class A");
    }
}

interface B{
    public void print();
}

interface C{
    public void print();
}

class D implements B,C{

    @Override
    public void print() {
        System.out.println("This is class D");
    }
}


