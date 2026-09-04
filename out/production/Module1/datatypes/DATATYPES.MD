# DATATYPES IN JAVA 

## DATATYPES DEFINES THE TYPE OF DATA VARIABLE WILL HOLD 

VARIABLE IS A CONTAINER OR A DATAHOLDER WHICH WILL STOERE THE DATA


## THERE ARE  TWO CATEGORIES OF DATATYPE 
### 1. PRIMITIVE (NUMBERS , CHARACTERS , BOOLEAN)
* THIS ARE PREDEFINED DATATYPES 
* AVAILABLE IN THE FORM OF KEYWORDS 
* IN TOTAL WE HAVE 8 PRIMITIVE DATATYPES
* THIS COMES WITH FIXED RANGE AND MEMORY 
* DUE TO PRESENCE OD PRIMITIVE DATATYPES JAVA IS NOT PURELY / COMPLETELY OBJECT ORIENTED

```
String name = "sourabh" ;
int yop = 2026 ;
double percentage =89.7 ;
char grade = ' A' ;
// variable = value
```

### Data Types Summary Table

| Data Type | Range | Memory Size |
| :--- | :--- | :--- |
| **`byte`** | -128 to 127 | 8 bits (1 byte) |
| **`short`** | -32,768 to 32,767 | 16 bits (2 bytes) |
| **`int`** | -2,147,483,648 to 2,147,483,647 | 32 bits (4 bytes) |
| **`long`** | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | 64 bits (8 bytes) |
| **`float`** | $\pm1.4 \times 10^{-45}$ to $\pm3.4028235 \times 10^{38}$ (6-7 significant decimal digits) | 32 bits (4 bytes) |
| **`double`** | $\pm4.9 \times 10^{-324}$ to $\pm1.7976931348623157 \times 10^{308}$ (15-17 significant decimal digits) | 64 bits (8 bytes) |
| **`boolean`** | `true` or `false` | 1 bit (virtually), often 1 byte in practice |
| **`char`** | `'\u0000'` to `'\uffff'` (0 to 65,535 in Unicode) | 16 bits (2 bytes) |

---

### Key Notes

* **Integer Types:** `byte`, `short`, `int`, and `long` hold signed whole numbers. Their ranges are determined by the formula $-2^{n-1}$ to $2^{n-1} - 1$, where $n$ is the number of bits.
* **Floating-Point Types:** `float` and `double` hold fractional numbers. `double` offers twice the precision of `float` and is the standard choice for most mathematical calculations.
* **Characters:** `char` stores a single 16-bit Unicode character, meaning it can support international


when we use float then we need to add **f** after the data

```
float f1 = 10.22 ;
float f2 = 1022f ; 
```

where we use long then we need to add **l** after the data (optional upto 9 values after that required)

```
    double d  = 10.22 ;// no error
    double d2 = 10.22 d //no error
```

```java

class Apple {
    public static void main (String [] args ){

        int cost = 325 ;
        int quantity = 4;
        float weight = 0.275f ;

        double total_price = quantity * weight * cost ;
        System.out.println(total_price) ;


    }
}
```

### when we use perform division operations then eithor numerator or denominatior must contains decimal value because the divisor dreturn int value rounded of (3/2) = 1 not 1.5 so after using 3.0/2 the result will be 1.5 it will not round off 
```java
class VolumeCone{
    public static void main(String[] args) {
        double radius = 5.5 ;
        double height = 10.1 ;
        double volume = 1.0/3 * 3.14 * radius * radius * height  ;
        System.out.println("volume of cone is " + volume);
    }
}
```