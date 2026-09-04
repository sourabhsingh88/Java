package constructors.ConstructorOverLoading.student;

import java.time.Period;

public class Student {

        String name , qualification ,email ;
        double percentage ; int yop ;
        Student(String n , String q , String e , double p , int y ){
            name = n ;
            qualification = q ;
            email = e ;
            percentage = p ;
            yop = y ;
    }
    Student(String n , String q ,  double p , int y ){
        name = n ;
        qualification = q ;
       percentage = p ;
        yop = y ;
    }
    void disp () {
        System.out.println(name + " " + email + " " + qualification + " " + percentage + " " + yop );
    }
}
