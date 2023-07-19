package ClassExample;
//WAP TO CREATE A UNIVERSITY CLASS AND ESTABLISH A RELATIONSHIP WITH STUDENT AND CREATE TWO UNIVERSITY AND TWO STUDENT OBJECT

class University{
    void College(){
        System.out.println("University Students are studying in college");
    }
    void Degree(){
        System.out.println("University Students are studying in degree");
    }
    void Masters(){
        System.out.println("University Students are studying in Masters");
    }

}
class Student extends University{
    @Override
    public void College(){
        System.out.println("Students are studying in college");
    }
    @Override
    void Degree(){
        System.out.println("Students are studying in degree");
    }
    @Override
    void Masters(){
        System.out.println("Students are studying in Masters");
    }

}


public class ClassQuestion19 {
    public static void main(String[] args) {
        University st=new University();
        st.College();
        st.Degree();
        st.Masters();
        System.out.println("");

    }

}
