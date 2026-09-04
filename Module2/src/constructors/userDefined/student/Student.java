package constructors.userDefined.student;

public class Student {
    String name ;
    String qual ;
    int yop ;
    double percentage ;

    Student(String n , String q , int y , double p) {
        name = n ;
        qual =q ;
        yop = y ;
        percentage = p;
    }

    void disp () {
        System.out.println("Name : " + name + "Qualification : " + qual + " YOP : "  + yop + " Percentage : " + percentage);
    }

}
