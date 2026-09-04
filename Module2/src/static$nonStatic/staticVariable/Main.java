package static$nonStatic.staticVariable;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("raj" , "15-10-2026" , "Btech" ) ;
        Student s2 = new Student("rahul" , "15-10-2021" , "Btech" ) ;
        Student s3 = new Student("rohit" , "15-10-2024" , "MCA" ) ;

        s2.course = "Mern" ; //courese is update for all beacuse it is static varible only one for all
        System.out.println(s1.name + "  " + s1.course);
        System.out.println(s2.name + "  " + s2.course);
        System.out.println(s2.name + "  " + s3.course);

    }
}
