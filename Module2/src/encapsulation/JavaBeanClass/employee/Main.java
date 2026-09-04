package encapsulation.JavaBeanClass.employee;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee() ;

                          e1.setName("Raj");  e1.setCompany("TCS");   e1.setSalary(45000);   e1.setExp(7);

        System.out.printf(e1.getName()+   " " + e1.getCompany() + " " + e1.getSalary() + " " + e1.getExp()); // Raj TCS 45000 7
    }
}
