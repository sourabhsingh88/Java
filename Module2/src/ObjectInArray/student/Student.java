package ObjectInArray.student;

public class Student {
   String name , qual ;
   double percentage  ;  int yop  ;

    public Student(String name, String qual, double percentage, int yop) {
        this.name = name;
        this.qual = qual;
        this.percentage = percentage;
        this.yop = yop;
    }

    void disp () {
        System.out.println("name = " + name + " qualification = " + qual + " percentage = " + percentage + " yop = " + yop );
    }
}
