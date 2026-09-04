package recursion;

public class Controlled {
//we decide how thw recursio will work not causing stact over flow
static void main() {
//    display(5 , 10) ;
    displayRev(5 , 1);
}

    static void display(int a  , int n) {
        System.out.println(a);
        if (a < n) {
            a++ ;
            display(a , n);
        }
    }
    static void displayRev(int a  , int n) {
        System.out.println(a);
        if (a > n) {
            a -- ;
            displayRev(a , n);
        }
    }
}
