package inheritance.ConstructorChaining.Person;

public class Employee extends Person {
    String empID ;
    String company ;
    double salary ;

    Employee(String n , String dob , char gender , String e , String c , double s){
        super(n , dob , gender) ;
        this.company =c;
        this.empID = e;
        this.salary = s ;
    }

    public void disp(){
        super.disp() ;
        System.out.println("empId = " + empID);
        System.out.println("Company = " + company);
        System.out.println("Salary = " + salary);
    }
}
