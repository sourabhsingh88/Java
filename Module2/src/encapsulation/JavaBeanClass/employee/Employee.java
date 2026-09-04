package encapsulation.JavaBeanClass.employee;

public class Employee {
    private String name ;
    private String company ;
    private int salary ;
    private int exp ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary >= 0)   this.salary = salary;
        else throw new IllegalArgumentException("salary must be greater then 0") ;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        if (exp>=0) this.exp = exp;
        else throw new IllegalArgumentException("salary must be greater then 0") ;
    }
}
