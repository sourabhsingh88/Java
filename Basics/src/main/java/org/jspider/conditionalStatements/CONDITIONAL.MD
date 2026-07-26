# 📘 Java Conditional Statements & Loops – Handbook

Complete Beginner Notes (Core Java)

---

## 📑 Table of Contents

1. [Introduction to Decision Making](#chapter-1--introduction-to-decision-making)
2. [if Statement](#chapter-2--if-statement)
3. [if-else](#chapter-3--if-else)
4. [else-if Ladder](#chapter-4--else-if-ladder)
5. [Nested if](#chapter-5--nested-if)
6. [Traditional Switch](#chapter-6--traditional-switch)
7. [Enhanced Switch (Java 14+)](#chapter-7--enhanced-switch-java-14)
8. [Loop Basics](#chapter-8--loop-basics)
9. [for Loop](#chapter-9--for-loop)
10. [while Loop](#chapter-10--while-loop)
11. [do-while Loop](#chapter-11--do-while-loop)
12. [Enhanced for-each](#chapter-12--enhanced-for-each)
13. [break & continue](#chapter-13--break--continue)
14. [Labeled break](#chapter-14--labeled-break)
15. [Comparisons](#chapter-15--comparisons)
16. [Tricky Questions](#chapter-16--tricky-questions)
17. [Practice Programs](#chapter-17--practice-programs)

---

## Chapter 1 — Introduction to Decision Making

Conditional statements are used to make **decisions** in a program.

```
Condition → True  → Execute one block
Condition → False → Execute another block
```

Java provides two main tools for decision making:
- **Conditional statements** — `if`, `if-else`, `else-if`, nested `if`, `switch`
- **Loops** — `for`, `while`, `do-while`, `for-each`

---

## Chapter 2 — if Statement

### Syntax
```java
if(condition){
    // statements
}
```

### Example
```java
public class Main {
    public static void main(String[] args) {
        int age = 20;

        if(age >= 18){
            System.out.println("Eligible to Vote");
        }
    }
}
```
**Output:**
```
Eligible to Vote
```

### Flow
```
Condition
   │
   ▼
 TRUE ─────► Execute Code
 FALSE ────► Skip
```

---

## Chapter 3 — if-else

Used when exactly **one of two blocks** should execute.

### Syntax
```java
if(condition){
    // block A
}
else{
    // block B
}
```

### Example
```java
int age = 15;

if(age >= 18){
    System.out.println("Adult");
}
else{
    System.out.println("Minor");
}
```
**Output:**
```
Minor
```

---

## Chapter 4 — else-if Ladder

Used when there are **multiple conditions** to check.

### Syntax
```java
if(condition1){
}
else if(condition2){
}
else if(condition3){
}
else{
}
```

### Example
```java
int marks = 82;

if(marks >= 90){
    System.out.println("Grade A");
}
else if(marks >= 75){
    System.out.println("Grade B");
}
else if(marks >= 50){
    System.out.println("Grade C");
}
else{
    System.out.println("Fail");
}
```
**Output:**
```
Grade B
```

### ⚠️ Important
Conditions are checked from **top to bottom**. Once a condition is TRUE, the remaining conditions are **ignored**.

**Wrong Order:**
```java
int marks = 95;

if(marks >= 50){
    System.out.println("Pass");     // matches first — wrong!
}
else if(marks >= 90){
    System.out.println("Grade A");
}
```
**Output:** `Pass` (unintended — should have been "Grade A")

**Correct Order:** always check the **narrowest/highest** condition first:
```java
if(marks >= 90)
else if(marks >= 75)
else if(marks >= 50)
else
```

---

## Chapter 5 — Nested if

An `if` written **inside another** `if`.

### Syntax
```java
if(condition){
    if(condition){
    }
}
```

### Example 1
```java
int age = 22;
boolean hasLicense = true;

if(age >= 18){
    if(hasLicense){
        System.out.println("Can Drive");
    }
}
```
**Output:** `Can Drive`

### Example 2 — Login check
```java
String username = "admin";
String password = "1234";

if(username.equals("admin")){
    if(password.equals("1234")){
        System.out.println("Login Successful");
    }
}
```

---

## Chapter 6 — Traditional Switch

Compares **one expression** against **multiple values**.

### Syntax (Java 7+)
```java
switch(expression){
    case value1:
        break;
    case value2:
        break;
    default:
}
```

### Example
```java
int day = 3;

switch(day){
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid");
}
```
**Output:** `Wednesday`

### Why `break`?
Without `break`, execution **falls through** to the next case(s).

```java
int day = 2;

switch(day){
    case 2:
        System.out.println("Tuesday");
    case 3:
        System.out.println("Wednesday");
    case 4:
        System.out.println("Thursday");
}
```
**Output:**
```
Tuesday
Wednesday
Thursday
```
> This behavior is called **Fall Through**.

### Multiple Cases (grouped)
```java
char ch = 'A';

switch(ch){
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':
        System.out.println("Vowel");
        break;
    default:
        System.out.println("Consonant");
}
```

### String Switch (Java 7+)
```java
String day = "Monday";

switch(day){
    case "Monday":
        System.out.println("Start");
        break;
    case "Sunday":
        System.out.println("Holiday");
        break;
    default:
        System.out.println("Normal");
}
```

---

## Chapter 7 — Enhanced Switch (Java 14+)

Cleaner syntax using `->`. **No fall-through, no `break` needed.**

```java
int day = 2;

switch(day){
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    case 3 -> System.out.println("Wednesday");
    default -> System.out.println("Invalid");
}
```

### Switch Expression (returns a value)
```java
int day = 1;

String result = switch(day){
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    default -> "Invalid";
};

System.out.println(result);
```

---

## Chapter 8 — Loop Basics

Loops are used to **repeat code**.

**Types of loops in Java:**
```
for
while
do-while
Enhanced for (for-each)
```

| Loop | Use Case |
|---|---|
| `for` | Known number of iterations |
| `while` | Unknown number of iterations (condition checked first) |
| `do-while` | Must execute **at least once** |
| `for-each` | Traverse arrays/collections |

---

## Chapter 9 — for Loop

The most commonly used loop.

### Syntax
```java
for(initialization; condition; update){
}
```

### Example
```java
for(int i=1;i<=5;i++){
    System.out.println(i);
}
```
**Output:** `1 2 3 4 5`

### Reverse Loop
```java
for(int i=5;i>=1;i--){
    System.out.println(i);
}
```

### Even Numbers
```java
for(int i=2;i<=20;i+=2){
    System.out.println(i);
}
```

### Infinite Loop
```java
for(;;){
    System.out.println("Hello");
}
```

### Multiple Variables
```java
for(int i=0,j=10;i<=10;i++,j--){
    System.out.println(i+" "+j);
}
```

### Missing Parts of a for Loop
All 3 parts of a `for` loop are **optional**.

```java
// Initialization missing
int i=1;
for(;i<=5;i++){ }

// Condition missing
for(int i=1;;i++){ }

// Update missing
int i=1;
for(;i<=5;){
    i++;
}
```

---

## Chapter 10 — while Loop

Condition is checked **first**, before the loop body runs.

### Syntax
```java
while(condition){
}
```

### Example
```java
int i=1;
while(i<=5){
    System.out.println(i);
    i++;
}
```

### Infinite While
```java
while(true){
    System.out.println("Hello");
}
```

---

## Chapter 11 — do-while Loop

Runs the body **at least once**, since the condition is checked **after** execution.

### Syntax
```java
do{
}
while(condition);
```

### Example
```java
int i=1;
do{
    System.out.println(i);
    i++;
}
while(i<=5);
```

### while vs do-while
```
while:           Condition → Execute
do-while:        Execute → Condition
```

**Comparison Example:**
```java
int i=10;
while(i<5){
    System.out.println(i);
}
```
**Output:** *(nothing — condition is false from the start)*

```java
int i=10;
do{
    System.out.println(i);
}
while(i<5);
```
**Output:** `10` *(runs once even though condition is false)*

---

## Chapter 12 — Enhanced for-each

Used to traverse **arrays and collections**.

### Syntax
```java
for(datatype variable : array){
}
```

### Example — int array
```java
int arr[] = {10,20,30,40};

for(int value : arr){
    System.out.println(value);
}
```
**Output:** `10 20 30 40`

### Example — String array
```java
String names[] = {"Rahul","Aman","Riya"};

for(String s : names){
    System.out.println(s);
}
```

> ⚠️ **Note:** `for-each` works on a **copy** of primitive values. Modifying the loop variable inside the loop does **not** change the original array.

---

## Chapter 13 — break & continue

### `break` — stops the loop immediately
```java
for(int i=1;i<=10;i++){
    if(i==5)
        break;
    System.out.println(i);
}
```
**Output:** `1 2 3 4`

### `continue` — skips the current iteration
```java
for(int i=1;i<=5;i++){
    if(i==3)
        continue;
    System.out.println(i);
}
```
**Output:** `1 2 4 5`

---

## Chapter 14 — Labeled break

Used to break out of an **outer loop** from inside a nested loop.

```java
outer:
for(int i=1;i<=3;i++){
    for(int j=1;j<=3;j++){
        if(i==2 && j==2)
            break outer;
        System.out.println(i+" "+j);
    }
}
```
**Output:**
```
1 1
1 2
1 3
2 1
```

---

## Chapter 15 — Comparisons

### When to Use Which?

| Statement | Use Case |
|---|---|
| `if` | Single condition |
| `if-else` | Two choices |
| `else-if` | Multiple conditions |
| Nested `if` | Condition inside another condition |
| `switch` | Compare one value against many constants |
| `for` | Known number of iterations |
| `while` | Unknown number of iterations |
| `do-while` | Must execute at least once |
| `for-each` | Traverse arrays/collections |

### Common Mistakes

- ❌ Using `=` instead of `==` (or forgetting Java expects a `boolean` condition in `if`).
- ❌ Forgetting `break` in a traditional `switch`.
- ❌ Writing a stray `;` after `for`, `while`, or `if`.
- ❌ Creating an infinite loop accidentally.
- ❌ Modifying the loop variable incorrectly.
- ❌ Expecting `for-each` to modify primitive array elements.

---

## Chapter 16 — Tricky Questions

> A curated set of tricky output-based interview questions with explanations.

**Q1.**
```java
if(true)
    System.out.println("Hello");
    System.out.println("World");
```
**Output:** `Hello` then `World`
**Reason:** Only the *first* statement belongs to the `if` (no braces used); the second line always executes.

---

**Q2.**
```java
if(false){
}
System.out.println("Done");
```
**Output:** `Done`

---

**Q3.**
```java
int x = 10;
if(x=5){
}
```
**Output:** `Compilation Error`
**Reason:** Java requires a `boolean` expression in `if`. Assignment (`=`) returns an `int`, not a `boolean`.

---

**Q4.**
```java
boolean b = false;
if(b){
    System.out.println("Yes");
}
```
**Output:** *(nothing)*

---

**Q5.**
```java
switch(2){
    case 1:
    case 2:
    case 3:
        System.out.println("Valid");
}
```
**Output:** `Valid`
**Reason:** Grouped cases with no `break` between them — case 2 falls through to the shared statement.

---

**Q6.**
```java
for(int i=0;i<5;i++);
System.out.println("Hello");
```
**Output:** `Hello`
**Reason:** The semicolon (`;`) right after the `for(...)` ends the loop with an **empty body**; it still loops 5 times doing nothing, then `Hello` prints once.

---

**Q7.**
```java
int i = 5;
while(i < 5){
    System.out.println(i);
}
```
**Output:** *(nothing)* — condition is false immediately.

---

**Q8.**
```java
int i=5;
do{
    System.out.println(i);
}
while(i<5);
```
**Output:** `5` — `do-while` always runs the body at least once.

---

**Q9.**
```java
int arr[]={1,2,3};

for(int x : arr){
    x = x + 10;
}

System.out.println(arr[0]);
```
**Output:** `1`
**Reason:** `for-each` works on a copy of primitive values. Modifying `x` does not change the array.

---

**Q10.**
```java
int i = 1;
switch(i){
    default:
        System.out.println("Default");
    case 1:
        System.out.println("One");
        break;
    case 2:
        System.out.println("Two");
}
```
**Output:** `One`
**Reason:** `default` doesn't have to be last — Java matches `case 1` first since `i == 1`, and `break` stops it before reaching `default`.

---

**Q11.**
```java
for(int i=1;i<=3;i++){
    if(i==2)
        continue;
    if(i==3)
        break;
    System.out.println(i);
}
```
**Output:** `1`
**Reason:** `i=2` is skipped via `continue`; `i=3` triggers `break` before printing.

---

**Q12.**
```java
int i=0;
while(i++<3){
    System.out.println(i);
}
```
**Output:** `1 2 3`
**Reason:** `i++` is post-increment — the check uses the value *before* incrementing, but `i` is already incremented by the time it's printed.

---

**Q13.**
```java
char c = '5';
switch(c){
    case 53:
        System.out.println("Matched");
        break;
    default:
        System.out.println("Not Matched");
}
```
**Output:** `Matched`
**Reason:** `char` is compared using its ASCII value; `'5'` has ASCII value `53`.

---

**Q14.**
```java
int i = 10;
if(i == 10);
{
    System.out.println("Inside block");
}
```
**Output:** `Inside block`
**Reason:** The semicolon after `if(i==10)` makes the `if` do nothing; the block below runs unconditionally as a plain code block.

---

**Q15.**
```java
for(int i=1;i<=3;i++){
    for(int j=1;j<=3;j++){
        if(j==2)
            break;
        System.out.println(i+" "+j);
    }
}
```
**Output:**
```
1 1
2 1
3 1
```
**Reason:** Unlabeled `break` only exits the **inner** loop, not the outer one.

---

## Chapter 17 — Practice Programs

> A curated list of beginner-to-intermediate practice problems using conditionals and loops.

### Conditionals
1. Check whether a number is positive, negative, or zero.
2. Find the largest of three numbers.
3. Check whether a year is a leap year.
4. Check whether a number is even or odd.
5. Check whether a character is a vowel or consonant.
6. Determine a student's grade based on marks (using `else-if`).
7. Check whether a triangle is valid given three angles.
8. Find the largest of four numbers using nested `if`.
9. Simple calculator using `switch` (+, -, *, /).
10. Check whether a number is divisible by both 3 and 5.

### Loops — Numbers
11. Print numbers from 1 to 100.
12. Print even numbers from 1 to 100.
13. Print odd numbers from 1 to 100.
14. Print the multiplication table of a number.
15. Calculate the factorial of a number.
16. Reverse a number.
17. Check whether a number is a palindrome.
18. Print the Fibonacci series up to n terms.
19. Count digits in a number.
20. Find the sum of digits of a number.
21. Check whether a number is an Armstrong number.
22. Check whether a number is prime.
23. Print all prime numbers between 1 and 100.
24. Find the GCD (HCF) of two numbers.
25. Find the LCM of two numbers.
26. Sum of natural numbers up to n (using loop).
27. Print the sum of the Fibonacci series.
28. Convert decimal to binary.

### Loops — Patterns
29. Print a right-angle triangle star pattern.
30. Print an inverted right-angle triangle pattern.
31. Print a pyramid star pattern.
32. Print a number pattern (1, 12, 123 ...).
33. Print a diamond star pattern.

### Loops — Arrays
34. Find the maximum element in an array using `for-each`.
35. Find the minimum element in an array.
36. Find the sum and average of array elements.
37. Count even and odd numbers in an array.
38. Reverse an array without using an extra array.

---

## 🔑 Key Takeaways

- `if` checks one condition.
- `if-else` chooses between two paths.
- `else-if` handles multiple conditions — checked top to bottom, first match wins.
- Nested `if` places one decision inside another.
- `switch` is cleaner when comparing one value against many constants; remember `break` to avoid fall-through.
- Enhanced switch (`->`, Java 14+) avoids fall-through automatically and can return a value as an expression.
- `for` is best when the number of iterations is known.
- `while` is useful when the number of iterations is unknown (condition checked first).
- `do-while` always executes at least once (condition checked after).
- `for-each` is the preferred way to read (not modify) elements from arrays and collections.
- `break` exits a loop or `switch` entirely; `continue` skips just the current iteration.
- A labeled `break` can exit an **outer** loop from within a nested loop.