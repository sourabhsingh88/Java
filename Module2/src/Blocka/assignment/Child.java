package Blocka.assignment;

public class Child extends  Parent{

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("Main Method of child");
    }
    {
        System.out.println(" Child Non Static block 1 ");
    }

    static {
        System.out.println(" Child Static block 1 ");
    }


    Child() {
        System.out.println("Child Constrctor ");
    }

    {
        System.out.println(" Child Non Static block 2 ");
    }
}


//Parent Static block 1
//Child Static block 1
//Parent Non Static block 1
//Parent Non Static block 2
//Parent Constrctor
//Child Non Static block 1
//Child Non Static block 2
//Child Constrctor
//Main Method of child


//Parent Static block 1
//Child Static block 1
//Parent Non Static block 1
//Parent Non Static block 2
//Parent Constrctor
//Child Non Static block 1
//Child Non Static block 2
//Child Constrctor
//Main Method of child