package classAndObject.student;

public class Student {
    String name ;
    int phy ;
    int maths  ;
    int chem ;
    int optional ;

    void disp() {
        System.out.println("name " + name );
        System.out.println("phy " + phy );
        System.out.println("maths " + maths );
        System.out.println("chem " + chem);
        System.out.println("optional " + optional );
    }

    void totalMarks() {
        int total = phy + maths + chem + optional ;
        System.out.println("total marks : "+ total);
    }
    void percentage() {
        int total = phy + maths + chem + optional ;
        double percentage = total / 4.0 ;
        System.out.println("percentage : " + percentage);
    }
}
