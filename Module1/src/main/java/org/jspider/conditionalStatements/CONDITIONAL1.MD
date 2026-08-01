# Java – Conditional Statements & Loops (Explained)

**Conditional statements** let your program make decisions — run different code depending on whether something is true or false.
**Loops** let you repeat code without writing it multiple times.

---

## 1. `if`
Runs a block **only if** the condition is true. Nothing happens if it's false.

```java
int age = 20;
if(age >= 18){
    System.out.println("Eligible to Vote");
}
```
Use it when you have exactly **one condition** and only care about the "true" case.

---

## 2. `if-else`
Gives you **two paths** — one runs if true, the other if false. Exactly one always executes.

```java
if(age >= 18){
    System.out.println("Adult");
}
else{
    System.out.println("Minor");
}
```

---

## 3. `else-if` Ladder
For **multiple conditions**, checked top to bottom. As soon as one is true, the rest are skipped — so order matters (put the strictest/highest condition first).

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

> ⚠️ If you check a lower condition first (e.g. `marks >= 50` before `marks >= 90`), a 95-mark student will wrongly get matched at the first condition and never reach "Grade A".

---

## 4. `switch`
Compares **one value** against several possible constants — cleaner than a long `else-if` chain when you're checking equality, not ranges.

```java
int day = 1;

switch(day){
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid");
}
```

Without `break`, execution **falls through** into the next case(s) — this trips up almost everyone at least once:
```java
int day = 2;
switch(day){
    case 2: System.out.println("Tuesday");
    case 3: System.out.println("Wednesday");
    case 4: System.out.println("Thursday");
}
// Output: Tuesday, Wednesday, Thursday (all print!)
```

---

## 5. `for` Loop
Best when you know **how many times** to repeat.

```java
for(int i=1; i<=5; i++){
    System.out.println(i);
}
```
Three parts: initialization, condition, update — all three are actually optional.

---

## 6. `while` Loop
Condition checked **first**. If it's false from the start, the body never runs. Good when the number of iterations is **unknown**.

```java
int i = 1;
while(i <= 5){
    System.out.println(i);
    i++;
}
```

---

## 7. `do-while` Loop
Same as `while`, but condition checked **after** the body — so it always runs **at least once**, even if the condition is false.

```java
int i = 10;
do{
    System.out.println(i);
}
while(i < 5);   // prints 10 anyway, even though condition is false
```

---

## 8. `for-each` (Enhanced for)
For reading through arrays/collections — you don't manage an index.

```java
int[] arr = {10, 20, 30};
for(int val : arr){
    System.out.println(val);
}
```
⚠️ It gives you a **copy** of each value — changing the loop variable does **not** change the original array.

---

## Quick Comparison

| Statement | Use Case |
|---|---|
| `if` | Single condition |
| `if-else` | Two choices |
| `else-if` | Multiple conditions |
| `switch` | Compare one value against many constants |
| `for` | Known number of iterations |
| `while` | Unknown number of iterations, condition checked first |
| `do-while` | Must execute at least once |
| `for-each` | Traverse arrays/collections (read-only) |

---

## Common Mistakes

- Writing `if(x=5)` instead of `if(x==5)` — assignment vs comparison (this actually fails to compile in Java since `=` doesn't return a `boolean`).
- Forgetting `break` in a `switch`, causing fall-through.
- Accidentally adding a `;` right after `for(...)` or `if(...)`, making the body empty/unconditional.
- Assuming `for-each` can modify array elements.
- Off-by-one errors in loop conditions (`<=` vs `<`).
- Expecting `while` to run once like `do-while` when the condition starts false.

---

## Tricky Questions

**Q1.**
```java
if(true)
    System.out.println("Hello");
    System.out.println("World");
```
**Output:** both print.
**Why:** Only the first line is actually inside the `if` (no braces) — the second always runs regardless.

---

**Q2.**
```java
for(int i=0;i<5;i++);
System.out.println("Hello");
```
**Output:** `Hello`
**Why:** The semicolon ends the loop with an empty body; it just loops 5 times doing nothing, then `Hello` prints once.

---

**Q3.**
```java
switch(2){
    case 1:
    case 2:
    case 3:
        System.out.println("Valid");
}
```
**Output:** `Valid`
**Why:** Grouped cases with no `break` in between share the same statement.

---

**Q4.**
```java
int[] arr = {1,2,3};
for(int x : arr){
    x = x + 10;
}
System.out.println(arr[0]);
```
**Output:** `1`
**Why:** Modifying `x` doesn't touch `arr` — `for-each` works on a copy.

---

**Q5.**
```java
int i=5;
do{
    System.out.println(i);
}
while(i<5);
```
**Output:** `5`
**Why:** Body runs once regardless of the condition (checked after execution).

---

**Q6.**
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
**Why:** `char` compares by its ASCII value, and `'5'` is `53`.

---

**Q7.**
```java
int i = 5;
while(i < 5){
    System.out.println(i);
}
```
**Output:** *(nothing)*
**Why:** Condition is false immediately, so the loop body never runs.

---

**Q8.**
```java
int x = 10;
if(x = 5){
}
```
**Output:** `Compilation Error`
**Why:** Java requires a `boolean` expression in `if`. Assignment (`=`) returns an `int`, not a `boolean`.