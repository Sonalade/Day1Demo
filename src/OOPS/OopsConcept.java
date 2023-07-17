package OOPS;

  //QUESTION: TRY TO MAKE 10 DIFFERENT CLASSES AND TYPE OBJECTS OF EACH CLASS
// PARAMETERIZE AND NON PARAMETERIZE AND PRACTICE UPCASTING AND DOWN CASTING

public class OopsConcept {
    public static void main(String[] args) {
        Student s1 = new Student("Akarsh","Karn", 7);
        Employee e1=new Employee("Rakesh","Rajput",1234);
        Iphone i1=new Iphone("iPhone 14 pro max","purple",165000);
        Car c1=new Car("HondaCity","White",1600000);
        Bike b1=new Bike("Bajaj Pulsar 220F","Blue",137000,220);
        Bicycle B1=new Bicycle("Leader TORFIN MTB 26T","Leader Bikes","Front Suspension","Steel");
        Laptop l1=new Laptop("81WQ00NMQIN","Lenovo IdeaPad","Black",31000);
        EarBud e2=new EarBud("Cell Phone","In-ear","Boat");
        SmartWatches s2=new SmartWatches("Ultra Series 8",1,50,"Multicolour","Android and IOS");
        BlueTooth b2=new BlueTooth("YESTRONICS ET max Bluetooth","ABS Plastic","Wireless","Audio Player",1);


        System.out.println(s1);
        System.out.println(" ");
        System.out.println(e1);
        System.out.println(" ");
        System.out.println(i1);
        System.out.println(" ");
        System.out.println(c1);
        System.out.println(" ");
        System.out.println(b1);
        System.out.println(" ");
        System.out.println(B1);
        System.out.println(" ");
        System.out.println(l1);
        System.out.println(" ");
        System.out.println(e2);
        System.out.println(" ");
        System.out.println(s2);
        System.out.println(" ");
        System.out.println(b2);


    }
}
class Student{
    String firstName ;
    String lastName ;
    int rollNo ;

    Student(String f, String l,int r ){                       //PARAMETERIZE CONSTRUCTOR
        firstName = f;
        lastName = l;
        rollNo = r;
    }

    @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
    public String toString() {
        return "First Name : "+firstName + "\nLastName : "+ lastName+ "\nRoll No : " + rollNo;
    }
}
class Employee {
    String firstName;
    String lastName;
    int ID;

    Employee(String fN, String lN, int id) {                       //PARAMETERIZE CONSTRUCTOR
        firstName = fN;
        lastName = lN;
        ID = id;
    }

    @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
    public String toString() {
        return "First Name : " + firstName + "\nLastName : " + lastName + "\nRoll No : " + ID;

    }
}
    class Iphone {
        String IphoneName;
        String colour;
        int price;

        Iphone(String IN, String c, int p) {                       //PARAMETERIZE CONSTRUCTOR
            IphoneName = IN;
            colour = c;
            price= p;
        }

        @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
        public String toString() {
            return "IphoneName : " + IphoneName + "\nColour : " + colour + "\nPrice : " + price;

        }

    }

class Car {
    String carName;
    String colour;
    int price;

    Car(String cN, String c, int p) {                       //PARAMETERIZE CONSTRUCTOR
        carName = cN;
        colour = c;
        price= p;
    }

    @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
    public String toString() {
        return "CarName : " + carName + "\nColour : " + colour + "\nPrice : " + price;

    }

}

class Bike {
    String bikeName;
    String colour;
    int price;
    int engine;

    Bike(String bN, String c, int p,int e) {                       //PARAMETERIZE CONSTRUCTOR
        bikeName=bN;
        colour = c;
        price= p;
        engine=e;
    }

    @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
    public String toString() {
        return "BikeName : " + bikeName + "\nColour : " + colour + "\nPrice : " + price +"\nEngine: "+engine;

    }

}

class Bicycle{
    String bicycleName;
    String brand;
    String suspensionType;
    String frameMaterial;

    Bicycle(String bN, String b, String ST,String FM) {                       //PARAMETERIZE CONSTRUCTOR
        bicycleName=bN;
        brand = b;
        suspensionType= ST;
        frameMaterial=FM;
    }

    @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
    public String toString() {
        return "BicycleName : " +bicycleName + "\nBrand : " + brand + "\nSuspensionType : " + suspensionType +"\nFrameMaterial: "+frameMaterial;

    }

}
class Laptop{
    String styleName ;
    String patternName ;
    String colour ;
    int price;

    Laptop(String sN, String pN,String c,int p ){                       //PARAMETERIZE CONSTRUCTOR
        styleName = sN;
        patternName = pN;
        colour = c;
        price=p;
    }

    @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
    public String toString() {
        return "StyleName : "+styleName + "\nPatternName : "+patternName + "\nColour : " + colour+"\n Price: "+ price;
    }
}

class EarBud{
    String use ;
    String form ;
    String brand ;

    EarBud(String u, String f,String b){                       //PARAMETERIZE CONSTRUCTOR
        use= u;
        form= f;
        brand= b;
    }

    @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
    public String toString() {
        return "Use : "+use + "\nForm : "+ form+ "\nBrand  : " + brand;
    }
}

class SmartWatches{
    String name;
    int batteryChargeTime ;
    int batteryLife ;
    String colour ;
    String compatibleOS;

    SmartWatches(String n,int bCT,int bL, String cl,String co){                       //PARAMETERIZE CONSTRUCTOR
        name= n;
        batteryChargeTime= bCT;
        batteryLife= bL;
        colour=cl;
        compatibleOS=co;
    }

    @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
    public String toString() {
        return "Name : "+name + "\nBatteryChargeTime : "+ batteryChargeTime+ "\nBatteryLife  : " + batteryLife+ "\nColour: "+colour+ "\nComparableOS : "+compatibleOS;
    }
}

class BlueTooth{
    String name;
    String material ;
    String type;
    String compatibility;
    int netQuality;


    BlueTooth(String n,String m,String t, String c,int nQ){                       //PARAMETERIZE CONSTRUCTOR
        name= n;
        material=m;
        type=t;
        compatibility=c;
        netQuality=nQ;
    }

    @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
    public String toString() {
        return "Name : "+name + "\nMaterial : "+ material+ "\nType  : " + type+ "\nCompatibility: "+compatibility+ "\nNetQuality : "+netQuality;
    }
}