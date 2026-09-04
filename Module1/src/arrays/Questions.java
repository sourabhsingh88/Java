package arrays;

public class Questions {
    public static void main(String[] args) {

        int arr[] = {10, 201, 301, 45, 50, 61, 70, 80, 90, 100};
        System.out.println("-----------------forward------------------------");
//        forward(arr);
        System.out.println("-----------------backward------------------------");
//        backward(arr) ;
        System.out.println("-----------------except first 2 and last 2------------------------");
//        noFirstNoLast(arr);
        System.out.println("-----------------except first 2  and last 2 ------------------------");
//        noFirst2NoLast2(arr) ;
        System.out.println("-----------------except  last 3  ------------------------");
//        noLast3(arr) ;
        System.out.println("-----------------First Half  ------------------------");
//        firstHalf(arr) ;
        System.out.println("-----------------Last Half  ------------------------");
//        lastHalf(arr) ;
        System.out.println("-----------------Sum of all  ------------------------");
//        sum(arr) ;
        System.out.println("-----------------Product of all  ------------------------");
//        product(arr) ;
        System.out.println("-----------------transfer to new Arr  ------------------------");
//        transfer(arr) ;
        System.out.println("-----------------Even Arr  ------------------------");
//        even(arr);
        System.out.println("-----------------Even  in Odd Index   ------------------------");
//        evenInOddInd(arr);
//        oddInEvenInd(arr) ;
//        countSumAvg(arr);
//        even2digit3Ind(arr) ;
//        numDiv3nd5nd3ind(arr);
//        twoDigit(arr) ;
//        twoDigitOddNumEvenInd(arr);
        evenNew(arr);
        oddNew(arr);
    }

    public static void forward(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void backward(int arr[]) {
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void noFirstNoLast(int arr[]) {
        int len = arr.length;
        for (int i = 1; i < len - 1; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void noFirst2NoLast2(int arr[]) {
        int len = arr.length;
        for (int i = 2; i < len - 2; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void noLast3(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len - 3; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void firstHalf(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void lastHalf(int arr[]) {
        int len = arr.length;
        for (int i = len / 2; i < len; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sum(int arr[]) {
        int len = arr.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum is " + sum);
    }

    public static void product(int arr[]) {
        int len = arr.length;
        long prod = 1;
        for (int i = 0; i < len; i++) {
            prod = prod * arr[i];
        }
        System.out.println("prod is " + prod);
    }

    public static void transfer(int arr[]) {
        int len = arr.length;
        int[] newArr = new int[len];
        for (int i = 0; i < len; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < len; i++) {
            System.out.println(newArr[i]);
        }
    }

    public static void even(int arr[]) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {

            if (arr[i] % 2 == 0 && arr[i] > 0) {
                System.out.println(arr[i]);
            }
        }
    }


    public static void odd(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {

            if (arr[i] % 2 == 1 && arr[i] > 0) {
                System.out.println(arr[i]);
            }

        }
    }

    public static void evenInOddInd(int arr[]) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (arr[i] % 2 == 0 && i % 2 == 1) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void oddInEvenInd(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] % 2 == 1 && i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void countSumAvg(int arr[]) {
        int len = arr.length;
        int count = 0;
        int sum = 0;
        double avg = 1;
        for (int i = 0; i < len; i++) {
            if (arr[i] > 9 && arr[i] < 100 && i % 3 == 0) {
                sum = sum + arr[i];
                count++;

            }
        }
        if (count > 0) {
            avg = sum / count;
        }
        System.out.println("sum is " + sum + " And " + "AVG is " + avg);
    }

    public static void even2digit3Ind(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] > 9 && arr[i] < 100 && i % 3 == 0 && arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void numDiv3nd5nd3ind(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0 && i % 3 == 0) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void twoDigit(int arr[]) {
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] > 9 && arr[i] < 100) {
                count++;
            }

        }
        System.out.println(count);
    }

    public static void twoDigitOddNumEvenInd(int arr[]) {
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] > 9 && arr[i] < 100 && arr[i] % 2 == 1 && i % 2 == 1) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void evenNew(int arr[]) {
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 0) {
                count = count + 1;
            }
        }
        int newArr[] = new int[count];
        int n = 0 ;
        for (int i = 0; i < len; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 0) {

                newArr[n] = arr[i];
                n++ ;
            }
        }

        for (int j = 0; j < count; j++) {
            System.out.println(newArr[j]);
        }
    }

    public static void oddNew(int arr[]) {
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] % 2 == 1 && arr[i] > 0) {
                count = count + 1;
            }
        }
        int newArr[] = new int[count];
        int n = 0 ;
        for (int i = 0; i < len; i++) {
            if (arr[i] % 2 == 1 && arr[i] > 0) {

                newArr[n] = arr[i];
                n++ ;
            }
        }

        for (int j = 0; j < count; j++) {
            System.out.println(newArr[j]);
        }
    }
}






/* create an array int type size 10 print the data using for loop
1. forward direction
2. backward direction
3. all elements except first and last one
4. except first 2 last 2
5. except last 3
6. first half of array elemets
7. last half
8. sum of all array elemets
9. product of all array elements
10. transfer all the data from one array to anothr array

11. print all the even number
12. print all the odd number
13. print all even num present in odd index
14. print all odd number present in even index
15. count ,  sum , avg of two digit even numbers present in index multiple of 3
16. print all the two digit even numbers present in even index which is divisble by 3
17. print all the number multiple of 3 or 5 present in index which is divisible by 3 ;
18. count the two digit numbers present in arry
19. count the two digit odd number present in even index divisible by 2

20. transfer all even number two new arr ;
21. tansfer all odd number to new arr
22. transfer all the data from one array 10 to anothr array
*/
