package encapsulation.JavaBeanClass.student;

public class Student {
    private String name ;
    private int age ;
    private double percentage ;

    // getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 18) this.age = age;
        else throw new IllegalArgumentException("age must be greater then or equal to 18");
    }
    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        if (percentage >= 0 || percentage > 100 ) this.percentage = percentage;
        else throw  new IllegalArgumentException("percentage cant be negatice and cant be greater then 100 ") ;
        }
}
