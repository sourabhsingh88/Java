package methodOverloading.employee;

public class Run {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sourabh" , "TCS",45000) ;
        e1.increment(); ;
        e1.disp();
    }
}

// Method binding is the process of attaching method call with respectinv metho body

// inthis case method bindige is performed during compilationns by compiler according to parameters and args
// therefore it is said to be compile time polimorphsn
