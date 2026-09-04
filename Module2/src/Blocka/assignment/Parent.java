package Blocka.assignment;

public class Parent {
    {
        System.out.println("Parent Non Static block 1 ");
    }
    static {
        System.out.println("Parent Static block 1 ");
    }

//    public static void main(String[] args) {
//        System.out.println("Main Method of parent");
//        Parent p = new Parent() ;
//    }
    Parent() {
        System.out.println("Parent Constrctor ");
    }

    {
        System.out.println("Parent Non Static block 2 ");
    }
}
