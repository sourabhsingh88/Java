package constructors.ConstructorOverLoading.constructorChaining.student;

public class Student {

    String name, qualification, email;
    double percentage;
    int yop;

    Student(String name, String qualification, double percentage, int yop) {
        this.name = name;
        this.qualification = qualification;
        this.percentage = percentage;
        this.yop = yop;
    }

    Student(String name, String qualification, String email, double percentage, int yop) {
        this(name, qualification, percentage, yop);
        this.yop = yop;
    }

    void disp() {
        System.out.println(name + " " + email + " " + qualification + " " + percentage + " " + yop);
    }
}
