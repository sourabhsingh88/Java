package methodOverloading.employee;

public class Employee {

    String name , company ;
    double salary ;

    Employee(String name , String company , double salary) {
        this.salary = salary ;
        this.company = company ;
        this.name = name ;
    }
    void disp () {
        System.out.println("Name = " + name );
        System.out.println("Company = " + company );
        System.out.println("Salary = " + salary );
    }
    void increment(){
        double inc  = salary *  (10.0 / 100) ;
        salary = inc + salary ;
        System.out.println("Salary Increment by 10 ");
    }
    void increment(double percentage) {
        double inc  = salary *  (percentage / 100.0) ;
        salary = inc + salary ;
        System.out.println("Salary Increment by  " + percentage + "%");
    }
}
