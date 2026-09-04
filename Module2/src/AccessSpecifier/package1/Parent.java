package AccessSpecifier.package1;

public class Parent {
    protected String name;
    protected int salary;

    public void disp() {
        System.out.println(name + " " + salary);
    }

    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.name = "Raj";
        p1.salary = 35000;
        p1.disp();
    }
}
