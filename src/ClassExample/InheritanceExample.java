package ClassExample;
//WRITE A INHERITANCE PROGRAMME WITH 5 DIFFERENT CLASS AND SUBCLASS
//CLASS2
class Child1{
    void PlayHouse(){
        System.out.println("Child1 in playhouse");
    }
    void School(){
        System.out.println("Child1 in school");
    }
    void PlayGames(){
        System.out.println("Child1 in play games");
    }
}
class Child2 extends Child1{
    @Override
    void PlayHouse(){
        System.out.println("Child2 in school");
    }
    @Override
    void School(){
        System.out.println("Child2 in school");
    }
    @Override
    void PlayGames(){
        System.out.println("Child2 in school");
    }
}
//CLASS 2
class Student1{
    void College(){
        System.out.println("Student1 in college");
    }
    void Degree(){
        System.out.println("student1 in degree");
    }
    void Masters(){
        System.out.println("student1 in masters");
    }
}
class Student2 extends Student1{
    @Override
    void College(){
        System.out.println("Student2 in college");
    }
    @Override
    void Degree(){
        System.out.println("Student2 in degree");
    }
    @Override
    void Masters(){
        System.out.println("Student2 in masters");
    }
}
class Peoples{
    void Dance(){
        System.out.println("Peoples can dance");
    }
    void Sing(){
        System.out.println("Peoples can sing");
    }
    void Work(){
        System.out.println("Peoples can work");
    }
}
class Woman extends Peoples {
    @Override
    void Dance(){
        System.out.println("Women can dance");
    }
    @Override
    void Sing(){
        System.out.println("Women can sing");
    }
    @Override
    void Work(){
        System.out.println("Women can work");
    }
}

class Human{
        void Read(){
        System.out.println("Human can read");
        }
        void Write(){
        System.out.println("Human can Write");
        }
        void Travel(){
        System.out.println("Human can Travel");
        }
        }
class Man extends Human {
@Override
    void Read(){
            System.out.println("Man can read");
            }
@Override
    void Write(){
            System.out.println("Man can write");
            }
@Override
    void Travel(){
            System.out.println("Man can travel");
            }
            }


class Mammals{
        void Birth(){
        System.out.println("Mammals is born");
        }
        void Live(){
        System.out.println("Mammals is living");
        }
        void Death(){
        System.out.println("Mammals has death");
        }
        }
class Fish extends Mammals {
@Override
    void Birth(){
            System.out.println("Fish is born");
            }
@Override
    void Live(){
            System.out.println("Fish is live");
            }
@Override
    void Death(){
            System.out.println("Fish is death");
            }
            }


public class InheritanceExample {
    public static void main(String[] args) {
        Child1 ch=new Child1();
        ch.PlayHouse();
        ch.School();
        ch.PlayGames();

        System.out.println(" ");
        Student1 st=new Student1();
        st.College();
        st.Degree();
        st.Masters();

        System.out.println(" ");
        Peoples p=new Peoples();
        p.Dance();
        p.Sing();
        p.Work();

        System.out.println("");
        Human h=new Human();
        h.Read();
        h.Travel();
        h.Write();

        System.out.println(" ");
        Mammals m=new Mammals();
        m.Birth();
        m.Live();
        m.Death();

    }
}
