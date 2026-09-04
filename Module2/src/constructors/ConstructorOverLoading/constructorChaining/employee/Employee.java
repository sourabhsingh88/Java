package constructors.ConstructorOverLoading.constructorChaining.employee;

public class Employee {
    int empId;
    String name ,  company;
    double salary;
    public Employee(String name, String company) {
        this.name = name;
        this.company = company;
    }
    public Employee(int empId, String name, String company) {
        this(name, company);
        this.empId = empId;
    }
    public Employee(String name, String company, double salary) {
        this(name, company);
        this.salary = salary;
    }
    public Employee(int empId, String name, String company, double salary) {
        this(name, company, salary);
        this.empId = empId;
    }
    void disp() {
        System.out.println(name + " " + empId + " " + company + " " + salary + " ");
    }
}
