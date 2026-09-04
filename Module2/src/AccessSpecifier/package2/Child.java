package AccessSpecifier.package2;

import AccessSpecifier.package1.Parent;
//proteced can ascess using inheritance only //
//public anywhere
//priate with in class only
//default within same package

public class Child extends Parent {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.name = "Raj";
        c1.salary = 7500;
        c1.disp() ;
    }
}
