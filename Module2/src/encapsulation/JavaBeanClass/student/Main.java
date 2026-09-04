package encapsulation.JavaBeanClass.student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student() ;
        s1.setName("Sourabh");
        s1.setAge(21) ;
        s1.setPercentage(75.0);
        System.out.println(s1.getName() +  "  " + s1.getAge()+ "  " + s1.getPercentage()); //Sourabh  21  75.0
        s1.setAge(25);
        System.out.println(s1.getName() +  "  " + s1.getAge()+ "  " + s1.getPercentage()); //Sourabh  25  75.0
        s1.setAge(-25);
        System.out.println(s1.getName() +  "  " + s1.getAge()+ "  " + s1.getPercentage()); //IllegalArgumentException: age must be greater then or equal to 18
    }
}
