package ObjectInArray.employee;

public class Main
{
    public static void main(String[] args) {
        Employee e1 = new Employee("Raj" , "Tcs" , 450000 );
        Employee e2 = new Employee("Ramu" , "Wipro" , 550000 );
        Employee e3 = new Employee("Raju" , "infosys" , 750000 );
        Employee e4 = new Employee("Rajeshs" , "Wipro" , 420000 );
        Employee e5 = new Employee("Ramesh" , "Tcs" , 350000 );

        Employee emp[] = {e1 , e2 , e3 ,e4 , e5} ;
        for (int i = 0 ; i < emp.length ; i++) {
            emp[i].disp();
        }
        System.out.println("==**== TCS ==**==");
        for (int i = 0 ; i < emp.length ; i++) {
            if (emp[i].company.equalsIgnoreCase("tcs")) {
              emp[i].disp();
            }
        }
    }
}
