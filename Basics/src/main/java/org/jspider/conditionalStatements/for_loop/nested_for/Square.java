package org.jspider.conditionalStatements.for_loop.nested_for;


public class Square {
    public static void main(String[] args) {
        int n = 5; // SIze of square
        for (int i = 0; i < n; i++) { //No Of Rows
            for (int j = 0; j < n; j++) { // No Of Cols
                System.out.print("*" + " ");
            }
            System.out.println();  // Next Line
        }
    }
}

class Star {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//
//class Pattern {
//    public static void main(String[] args) {
//        int n = 5;
//        int val = 1;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
/// /                System.out.print(i + " ");
//                System.out.print(val + " ");
//                val++;
//            }
//            val = 1;
//
//            System.out.println();
//        }
//    }
//}


//class Pattern {
//    public static void main(String[] args) {
//        int n = 5;
//        int val = 1;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {

/// /                System.out.print(i + " ");
//                System.out.print(val + " ");
//
//            }
//            val++;
//
//            System.out.println();
//        }
//    }
//}

//class Pattern {
//    public static void main(String[] args) {
//        int n = 5;
//        int val = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {

/// /                System.out.print(i + " ");
//                System.out.print(val + " ");
//                val--;
//            }
//            val = 5;
//
//            System.out.println();
//        }
//    }
//}
//
//class Pattern {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i % 2 == 0) {
//                    System.out.print(1 + " ");
//                } else {
//                    System.out.print(0 + " ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


//class Pattern {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (j % 2 == 0) {
//                    System.out.print(1 + " ");
//                } else {
//                    System.out.print(0 + " ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

class Pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0 ) {
                        System.out.print(1 + " ");
                    }else {
                        System.out.print(0 + " ");
                    }
                }else {
                    if (j % 2 != 0) {
                        System.out.print(0 + " ");
                    }else {
                        System.out.print(1 + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}


//
//class PatternA {
//    public static void main(String[] args) {
//        int n = 5;
//        char ch = 'a';
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(ch + " ");
//            }
//            ch++;
//            System.out.println();
//        }

/// /        System.out.println(++ch);
//    }
//}

//class Loop {
//    public static void main(String[] args) {
//        for (; ; ) {
//            System.out.println("Keep Coding");
//        }
//    }
//}


class PatternA {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'a';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            ch = 'a';
            System.out.println();
        }
//        System.out.println(++ch);
    }
}


