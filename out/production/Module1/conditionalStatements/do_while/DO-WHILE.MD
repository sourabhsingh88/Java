# Do while is the loop used when we want to execute the instructs at least once it will check the condition after one iteration 


```
do {
    
        } while(Condition)
```

```java

public class Example {
    public static void main(String[] args) {
        int a  = 5 ;
        do {
            System.out.println("Pulao"); //will execute without condition check 
            a-- ;
        }while(a >= 1) ;
    }
}

```