# ☕ Java Complete Prep Kit
### *Module 1 (Language Fundamentals) + Control Statements + Loops + Methods*

> 📌 How to use: Every topic follows **Concept → Explanation → Example → 🔑 Key Point → 🎯 Interview Questions**. Revise the 🔑 and 🎯 boxes the night before your test/interview.

---

## 📑 INDEX

**PART A — Language Fundamentals**
1. How Java Works (Source → Byte Code → Machine Code)
2. Compilation vs Interpretation
3. Errors vs Exceptions
4. JVM, JDK, JRE
5. WORA — Platform Independence
6. Keywords
7. Structure of a Java Program
8. Identifiers
9. Data Types & Variables
10. Operators
11. Type Casting
12. Variable Scope & Typing

**PART B — Control Statements**
13. Order of Execution
14. If Statements (Simple, If-Else, If-Else-If Ladder, Nested If)
15. Switch Statement

**PART C — Loops**
16. Introduction to Loops
17. For Loop
18. While Loop
19. Do-While Loop
20. For vs While vs Do-While
21. Nested Loops & Patterns

**PART D — Methods**
22. Introduction to Methods
23. Method Declaration Rules
24. Calling a Method (Single & Multiple Calls)
25. Passing Values (Formal vs Actual Arguments)
26. Returning Values

---

# PART A — Language Fundamentals

<a name="1"></a>
## 1. How Java Works — The Big Picture

| Stage | What it is | Understood by |
|---|---|---|
| **Source Code** (High-Level) | Code you write (`.java`) — human-readable | Humans |
| **Byte Code** (Intermediate) | Half-translated (`.class`) — not fully readable, not pure binary | JVM only |
| **Machine Code** (Low-Level) | Pure `0`s and `1`s | CPU |

```
YourFile.java --[javac]--> YourFile.class (Byte Code) --[JVM]--> Machine Code --> Output
```

**🔑 Why the middle step (byte code)?** Because byte code isn't tied to any OS — any machine with a JVM can run it. This is the backbone of **WORA**.

### 🎯 Interview Questions
- Q: Why doesn't Java compile directly to machine code like C/C++?
  → *A: Because direct machine code would be OS-specific, breaking platform independence. Byte code lets the same file run anywhere a JVM exists.*
- Q: Is byte code human-readable?
  → *A: No — it's an intermediate format, readable by JVM only, not fully binary and not fully text.*

---

<a name="2"></a>
## 2. Compilation vs Interpretation

| | **Compilation** | **Interpretation** |
|---|---|---|
| Tool | `javac` | `java` |
| Action | Converts **entire** program at once (Source → Byte Code) | Converts **line by line** (Byte Code → Machine Code) |
| Error caught | **Before** execution (compile-time errors) | **During** execution (exceptions) |
| Output | `.class` file | Program output |

**🔑 Memory trick:** *"Compile ALL at once, Interpret line by LINE."*

### 🎯 Interview Questions
- Q: Which tool detects a missing semicolon — `javac` or `java`?
  → *A: `javac`, because it's a syntax issue caught during compilation.*
- Q: Can a program with zero syntax errors still fail? Why?
  → *A: Yes — it can still throw a runtime exception (e.g., division by zero) during interpretation.*

---

<a name="3"></a>
## 3. Errors vs Exceptions

| | **Compile-Time Error** | **Runtime Exception** |
|---|---|---|
| Cause | Syntax mistakes | Logical mistakes (÷0, bad index) |
| When | During `javac` | During `java` |
| Program runs? | ❌ Never | ✅ Partially (till the failing line) |

### 🧪 Partial Execution Example
```java
class Run {
    public static void main(String[] args) {
        System.out.println("p - started");   // ✅ prints
        System.out.println(100/0);            // 💥 crashes here
        System.out.println("p - Ended");      // ❌ never runs
    }
}
```
**Output:**
```
p - started
Exception in thread "main" java.lang.ArithmeticException: / by zero
```

**🔑 Golden rule:** *Compile-time errors stop the program from starting at all. Runtime exceptions stop it mid-way.*

### 🎯 Interview Questions
- Q: In the example above, will "p - Ended" ever print?
  → *A: No — the program crashes on the division line before reaching it.*
- Q: What's the general exception message format?
  → *A: `<Location of error> : <Type of Exception>`*

---

<a name="4"></a>
## 4. JVM, JDK, JRE

### The Kitchen Analogy
- **JDK** = full kitchen (stove + ingredients + recipe book) → lets you **cook (develop)**
- **JRE** = stove + pre-made ingredients → lets you **serve (run)**, not cook new dishes
- **JVM** = the cook actually operating the stove → does the **execution**

### JVM (Java Virtual Machine)
- Converts **byte code → machine code**, using the internal **JIT (Just-In-Time)** compiler.
- Manages memory via: **Heap**, **Class/Method Memory**, **Stack**, **PC Registers**, **Native Method Area**.

### JDK vs JRE

| | **JDK** | **JRE** |
|---|---|---|
| Contains | Dev tools (`javac`) + JRE | JVM + libraries |
| Purpose | Write & compile code | Run compiled code |

**🔑 Containment:** `JDK ⊃ JRE ⊃ JVM`

### 🎯 Interview Questions
- Q: If you only want to run a `.class` file someone gave you, do you need JDK?
  → *A: No — JRE is enough, since it contains the JVM + libraries needed to run byte code.*
- Q: What does JIT stand for and what does it do?
  → *A: Just-In-Time compiler — speeds up byte code to machine code conversion inside the JVM.*

---

<a name="5"></a>
## 5. WORA — Write Once, Run Anywhere

```
        MyApp.class (same byte code)
        /         |          \
   Windows JVM  Linux JVM   Mac JVM
        |           |          |
   Win machine   Linux mach.  Mac mach.
      code          code       code
```

| Quality | Meaning |
|---|---|
| Platform-independent | Byte code runs on any OS with a JVM |
| Portable | Same `.class` moves between systems |
| Robust | Strong memory & exception management |
| Secure | JVM verifies byte code before running |

### 🎯 Interview Questions
- Q: If Java is platform-independent, is the JVM also platform-independent?
  → *A: No — the JVM itself is platform-**dependent** (a different JVM build per OS); it's the byte code that stays the same.*

---

<a name="6"></a>
## 6. Keywords

- Predefined, reserved words with a fixed meaning — **cannot** be used as identifiers.
- Always written in **lowercase** (`class` ✅, `Class` ❌).
- The entire program boilerplate (`class`, `public`, `static`, `void`, `main`) is built using them.

### 🎯 Interview Questions
- Q: Is `Static` a valid keyword?
  → *A: No — Java keywords are case-sensitive and must be lowercase; `Static` would be treated as an identifier, not the keyword.*

---

<a name="7"></a>
## 7. Structure of a Java Program

```java
class ClassName {
    // class members
}
```

| # | Member | Example |
|---|---|---|
| 1 | State / Attribute | `int age;` |
| 2 | Behaviour / Method | `void greet(){}` |
| 3 | Constructor | `ClassName(){}` |
| 4 | Init Block | `{ ... }` |
| 5 | Main-method | `public static void main(String[] args)` |

**🔑** `main()` is the **entry point** — execution always starts here.

### 🎯 Interview Questions
- Q: Can a Java program run without a `main` method?
  → *A: Not as a standalone application — the JVM looks for `main` as the starting point of execution.*

---

<a name="8"></a>
## 8. Identifiers

**Rules:**
1. Can't start with a number.
2. No special characters except `$` and `_`.
3. Can't be a keyword.
4. Can't have spaces.

| Identifier | Valid? | Why |
|---|---|---|
| `17MyClass` | ❌ | Starts with a number |
| `JavaClass` | ✅ | Follows all rules |
| `_score` | ✅ | Starts with underscore |
| `my class` | ❌ | Has a space |
| `static` | ❌ | Reserved keyword |

**🔑 Quick phrase:** *"No numbers first, no keywords ever, no spaces at all."*

### 🎯 Interview Questions
- Q: Is `$total` a valid identifier?
  → *A: Yes — `$` is one of the two special characters Java allows in identifiers.*

---

<a name="9"></a>
## 9. Data Types & Variables

```
Data Types
├── Primitive (8 total)
│     ├── Numeric: byte, short, int, long
│     ├── Decimal: float, double
│     ├── Character: char
│     └── Boolean: boolean
└── Non-Primitive (Objects)
      ├── String
      └── Collections
```

| Type | Size | Range | Default |
|---|---|---|---|
| `byte` | 1 byte | -128 to 127 | 0 |
| `short` | 2 bytes | -32,768 to 32,767 | 0 |
| `int` | 4 bytes | ≈ ±2.1B | 0 |
| `long` | 8 bytes | ≈ ±9.2×10¹⁸ | 0L |
| `float` | 4 bytes | ±1.4E-45 to ±3.4E38 | 0.0f |
| `double` | 8 bytes | ±4.9E-324 to ±1.7E308 | 0.0d |
| `boolean` | 1 bit | true/false | false |
| `char` | 2 bytes | 1 Unicode symbol | `\u0000` |

**🔑 Memory formula:** `bytes = 2^(n-1)` where n = number of bits.

### ⚠️ Common Mistakes
```java
float f = 10.22;      // ❌ Error — decimal literal is double by default
float f = 10.22f;     // ✅ Correct
long l = 123456789123;   // ❌ Error — too big for int literal
long l = 123456789123L;  // ✅ Correct
char c = "A";          // ❌ double quotes = String
char c = 'A';           // ✅ single quotes = char
```

### String Concatenation Gotcha
```java
System.out.println("Java" + 4 + 20);   // Java420
System.out.println(4 + 20 + "Java");   // 24Java
```
**🔑 Rule:** Java evaluates **left to right**; once a String appears, everything after becomes concatenation.

### 🎯 Interview Questions
- Q: Why does `float` need an `f` suffix but `double` doesn't?
  → *A: Decimal literals default to `double`. Storing one in a smaller `float` needs explicit marking with `f`/`F`.*
- Q: What is `System.out.println(4 + 20 + "Java")`?
  → *A: `24Java` — numeric addition happens first since the String appears last.*
- Q: What's the default value of a `boolean`?
  → *A: `false`.*

---

<a name="10"></a>
## 10. Operators

### 10.1 Arithmetic — `+ - * / %`
```java
int a = 15, b = 25;
System.out.println(b % a);   // 10 (remainder)
```

### 10.2 Unary — `++` `--`

| Type | Behaviour |
|---|---|
| Pre-Increment `++a` | Increment first, then use |
| Post-Increment `a++` | Use first, then increment |

```java
int a = 10;
int b = ++a;   // a=11, b=11
int c = a++;   // c=11, then a=12
```
**🔑** *"Pre = act BEFORE assigning. Post = act AFTER assigning."*

### 10.3 Relational — `== != > < >= <=`
Always returns **boolean**.
```java
System.out.println(10 == 10.0);  // true
System.out.println(12 < 12);     // false
```
**⚠️** `=` assigns, `==` compares — don't confuse them.

### 10.4 Logical — `&& || !`

| x | y | x&&y | x\|\|y |
|---|---|---|---|
| T | T | T | T |
| T | F | F | T |
| F | T | F | T |
| F | F | F | F |

**🔑 Short-circuit:** in `a && b`, if `a` is false, `b` is **never evaluated**. In `a || b`, if `a` is true, `b` is **never evaluated**.

### 10.5 Bitwise — `& | ^ ~`

| Op | Rule |
|---|---|
| `&` | 1 only if both bits are 1 |
| `\|` | 1 if either bit is 1 |
| `^` | 1 only if bits differ |
| `~` | `~n = -(n+1)` |

### 10.6 Conditional (Ternary) — `? :`
```java
String status = (age >= 18) ? "Eligible" : "Not Eligible";
```
Use for simple single conditions; avoid for complex/nested logic.

### 🎯 Interview Questions
- Q: What's the output?
  ```java
  int a = 5;
  int b = a++ + ++a;
  ```
  → *A: `b = 5 + 7 = 12`. First `a++` gives 5 (a becomes 6), then `++a` makes a=7 and gives 7.*
- Q: Does `a && b` always evaluate `b`?
  → *A: No — short-circuit evaluation skips `b` if `a` is already `false`.*
- Q: What is `~5`?
  → *A: `-(5+1) = -6`*
- Q: When should you avoid the ternary operator?
  → *A: When the condition logic is complex or nested — it hurts readability.*

---

<a name="11"></a>
## 11. Type Casting

```
byte → short → int → long → float → double   (Widening direction)
```

| | Implicit (Widening) | Explicit (Narrowing) |
|---|---|---|
| Direction | small → big | big → small |
| Cast needed? | No | Yes `(type)` |
| Data loss? | No | Possible |
| Done by | Compiler | Programmer |

**🔑 Rule:** `LHS < RHS → Explicit` | `LHS >= RHS → Implicit`

### Worked Examples
```java
char c = 'A'; int i = c;          // 65, implicit, safe
int i = 66; char c = (char) i;    // 'B', explicit needed

int i = 128;
byte b = (byte) i;   // -128 (overflow wraparound)

double d = 10.9;
int i = (int) d;      // 10 (decimal truncated, NOT rounded)
```
**⚠️** `boolean` can **never** be cast to/from any other type.

### 🎯 Interview Questions
- Q: What's the output?
  ```java
  int i = 130;
  byte b = (byte) i;
  System.out.println(b);
  ```
  → *A: `-126` — due to overflow/wraparound past byte's max (127).*
- Q: Does explicit casting round decimals or truncate them?
  → *A: Truncates — `(int) 10.9` gives `10`, not `11`.*
- Q: Can you cast `boolean` to `int`?
  → *A: No, never — not even explicitly.*

---

<a name="12"></a>
## 12. Variable Scope & Typing

- **Static typing** (Java's approach) → type is fixed at declaration, can't change.
```java
int x = 100;
x = "Hello";   // ❌ Compile Error
```
- **Declaration** = creating a variable. **Initialization** = first value assignment. **Re-initialization** = later reassignment.

**🔑 Two rules for local variables:**
1. Must be initialized before use.
2. Destroyed once their method finishes execution.

### 🎯 Interview Questions
- Q: What happens to a local variable after its method returns?
  → *A: It's destroyed/removed from memory — its scope ends with the method.*

---

# PART B — Control Statements

<a name="13"></a>
## 13. Order of Execution

**🔑** The default order of execution inside a Java program is **top to bottom** and **left to right**.

```
Top
 ↓
Left → Right
 ↓
Bottom
```

Java provides **control statements** to *alter* this default order:
1. If statements
2. Switch statements
3. For loop
4. While loop

### 🎯 Interview Questions
- Q: What is the default execution flow of a Java program?
  → *A: Top to bottom, left to right — control statements are what let you deviate from this.*

---

<a name="14"></a>
## 14. If Statements

### Version 1 — Simple If
```java
if (condition) {
    // if body — runs only if condition is TRUE
}
```
If the condition is `false`, the body is simply **skipped** — nothing runs.

### Version 2 — If-Else
```java
if (condition) {
    // if body ← runs when TRUE
} else {
    // else body ← runs when FALSE
}
```
**🔑** It is **not possible** for both blocks to execute — exactly **one** of them runs, never both, never neither.

```java
int n = 12;
if (n > 5 && n < 10) {
    System.out.println("Biryani");
}
// n=12 fails the condition → nothing prints

boolean flag = true;
if (flag == true) {
    System.out.println("Happy Independence Day");
} else {
    System.out.println("Have a Good Day");
}
// Output: Happy Independence Day
```

### Version 3 — If-Else-If Ladder
```java
if (condition1) {
    // if body
} else if (condition2) {
    // else-if body
} else if (condition3) {
    // else-if body
} else {
    // final else body
}
```
Conditions are checked **top to bottom**; as soon as one is `true`, its block runs and the **rest are skipped**.

```java
int num = 10;
if (num < 7) {
    System.out.println("Java full stack");
} else if (num == 7) {
    System.out.println("Mern stack");
} else {
    System.out.println("Dev Ops");
}
// Output: Dev Ops (since num=10 matches neither of the first two, falls to else)
```

### Version 4 — Nested If
When we write a conditional statement **inside** another condition's body, it is called a **nested if**.
```java
if (condition1) {
    // if body
} else if (conditionX) {
    if (conditionY) {
        // nested if body
    }
} else {
    if (conditionZ) {
        // nested if body
    }
}
```

**🔑 Even/Odd & Major/Minor patterns:**
```java
int n = 7;
if (n % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}

int age = 20;
if (age >= 18) {
    System.out.println("major");
} else {
    System.out.println("minor");
}
```

### 🎯 Interview Questions
- Q: Can both the `if` and `else` blocks execute in the same run?
  → *A: Never — it's always exactly one of the two, based on the condition.*
- Q: In an if-else-if ladder, what happens once a matching condition is found?
  → *A: Its block executes and all remaining `else if`/`else` blocks are skipped, even if their conditions are also true.*
- Q: What is a nested if?
  → *A: A conditional statement written inside the body of another conditional statement.*
- Q: What will this print?
  ```java
  int n = 30;
  if (n % 2 == 0 || n % 3 == 0) {
      System.out.println("Banglore");
  }
  ```
  → *A: "Banglore" — because `30 % 2 == 0` is true, and with `||` only one condition needs to be true.*

---

<a name="15"></a>
## 15. Switch Statement

**Definition:** Switch is a **selection statement** used to choose from a list of predefined options.

```java
switch (choice) {
    case label1:
        // code
        break;
    case label2:
        // code
        break;
    case label3:
        // code
        break;
    default:
        // code — runs when choice matches NO case
}
```

**🔑 Key facts:**
- Each option is declared using the `case` keyword.
- Options are separated using the `break` keyword — **without `break`, execution "falls through" into the next case.**
- `default` is **optional** and runs when the given value doesn't match any case.

### Example
```java
int choice = 2;
switch (choice) {
    case 1:
        System.out.println("COD");
        break;
    case 2:
        System.out.println("UPI");
        break;
    case 3:
        System.out.println("CARD");
        break;
    case 4:
        System.out.println("Net Banking");
        break;
    default:
        System.out.println("net Banking");
}
// Output: UPI
```

### 🎯 Interview Questions
- Q: What happens if you forget to write `break` in a case?
  → *A: "Fall-through" occurs — execution continues into the next case(s) until a `break` is hit or the switch ends.*
- Q: Is `default` mandatory in a switch statement?
  → *A: No, it's optional — but it's good practice to always include it for unmatched cases.*
- Q: Can two `case` labels have the same value?
  → *A: No — duplicate case labels cause a compile-time error.*
- Q: When would you prefer switch over if-else-if?
  → *A: When comparing one variable against many fixed values — switch is cleaner and often more readable/performant than a long if-else-if ladder.*

---

# PART C — Loops

<a name="16"></a>
## 16. Introduction to Loops

**🔑** When we want to execute a block of code **multiple times** in a continuous flow, we use loops.

**Types of Loops:**
1. For Loop
2. While Loop
3. Do-While Loop
4. For-Each / Enhanced For Loop

### 🎯 Interview Questions
- Q: Why do we need loops instead of just repeating code manually?
  → *A: To avoid code duplication and make repeated execution dynamic/manageable, especially when the repeat count depends on data or conditions.*

---

<a name="17"></a>
## 17. For Loop

**🔑** When the **number of repetitions is known** to the user beforehand, we go for a `for` loop.

```java
for (initialization; condition; update) {
    // for loop body
}
```

### Flow Diagram
```
Initialization
      ↓
  ┌─Condition─┐
  │           │
 True        False → Exit Loop
  ↓
Execute Instruction
      ↓
   Update
      ↓
 (back to Condition)
```

### Examples
```java
// Print 1 to 10
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}

// Print 100 to 0
for (int i = 100; i >= 0; i--) {
    System.out.println(i);
}
```

**🔑 Trace Table** for `for (int i=0; i<5; i++) System.out.print("x");`
| i | Condition | Action |
|---|---|---|
| 0 | true | prints "x" |
| 1 | true | prints "x" |
| 2 | true | prints "x" |
| 3 | true | prints "x" |
| 4 | true | prints "x" |
| 5 | **false** | loop exits |

### 🎯 Interview Questions
- Q: What are the 3 parts of a `for` loop, and in what order do they run?
  → *A: Initialization (once, first) → Condition (checked every iteration) → Update (after every iteration's body executes).*
- Q: If the condition is false on the very first check, does the body execute even once?
  → *A: No — the for loop is an "entry-checked" loop; if false initially, the body never runs.*
- Q: How many times does `for(int i=0; i<n; i++)` run?
  → *A: Exactly `n` times (i = 0, 1, 2, ... n-1).*

---

<a name="18"></a>
## 18. While Loop

**🔑** We use a `while` loop when we **don't know the number of iterations** in advance.

```java
while (condition) {
    // while loop body
}
```

### Example
```java
int a = 1;
while (a <= 5) {
    System.out.println("Java");
    a++;
}
```

**Trace Table:**
| a | Condition (a<=5) | Prints |
|---|---|---|
| 1 | true | Java |
| 2 | true | Java |
| 3 | true | Java |
| 4 | true | Java |
| 5 | true | Java |
| 6 | **false** | Exit |

### 🎯 Interview Questions
- Q: In a `while` loop, where is initialization typically written?
  → *A: **Outside** the loop, before it starts — unlike `for`, the while loop's syntax has no dedicated initialization slot.*
- Q: What happens if you forget to update the loop variable inside a `while` loop?
  → *A: You get an **infinite loop** since the condition never becomes false.*

---

<a name="19"></a>
## 19. Do-While Loop

```java
do {
    // body
} while (condition);
```

**🔑 Key difference:** the body executes **at least once**, *before* the condition is even checked.

### Example
```java
int a = 1;
do {
    System.out.println("BTM");
    a++;
} while (a <= 5);
```

**Trace:**
```
a=1 → BTM   a=2 → BTM   a=3 → BTM   a=4 → BTM   a=5 → BTM   a=6 → exit
```

### 🎯 Interview Questions
- Q: If the condition is false right from the start, will a `do-while` loop still execute its body?
  → *A: Yes — exactly **once**, because the condition is checked only **after** the first iteration.*
- Q: What's the syntax difference between `while` and `do-while` in terms of the semicolon?
  → *A: `do-while` requires a semicolon `;` after the closing `while(condition)` — `while` alone does not.*

---

<a name="20"></a>
## 20. For vs While vs Do-While

### For Loop vs While Loop

| | **For Loop** | **While Loop** |
|---|---|---|
| No. of iterations | **Known** | **Unknown** |
| Init & update in declaration | Yes — both provided in the loop header | No — must be handled separately |
| Syntax | `for(init; cond; update){}` | `while(cond){}` |

### While vs Do-While

| | **While** | **Do-While** |
|---|---|---|
| Type | **Entry-checked** loop | **Exit-checked** loop |
| Executes when | Only if condition is true | **Always at least once**, regardless of condition |
| Condition checked | **Before** each iteration | **After** each iteration |

### 🎯 Interview Questions
- Q: Which loop guarantees at least one execution regardless of the condition?
  → *A: `do-while` — it's exit-checked, so the body runs before the condition is ever tested.*
- Q: Which loop would you pick to print numbers 1 to N (N known)?
  → *A: `for` loop — since the number of iterations is known upfront.*
- Q: Which loop would you pick to keep asking a user for input until they enter a valid value?
  → *A: `do-while` — you need to execute the input-prompt at least once before checking validity.*

---

<a name="21"></a>
## 21. Nested Loops & Patterns

A **nested loop** is a loop written inside another loop — commonly used for patterns and grids (rows × columns).

### Star Square Pattern (5x5)
```java
int n = 5; // size of square
for (int i = 0; i < n; i++) {       // no. of rows
    for (int j = 0; j < n; j++) {   // no. of columns
        System.out.print("*" + " ");
    }
    System.out.println();  // move to next line
}
```
**Output:**
```
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

### Number Column Pattern
```java
int n = 5;
int val = 1;
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.print(val + " ");
    }
    System.out.println();
    val++;
}
```
**Output:**
```
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5
```

**🔑 How to trace nested loops:** the **outer loop** controls rows; for **every single** outer iteration, the **inner loop** runs completely (all its iterations) before the outer loop moves to its next step.

### 🎯 Interview Questions
- Q: In a nested loop with outer running `n` times and inner running `m` times, how many total times does the inner body execute?
  → *A: `n * m` times.*
- Q: In the "column pattern" example, why does every row show the same number repeated?
  → *A: Because `val` is incremented only **once per outer loop iteration** (outside the inner loop), so the inner loop prints the same `val` across a full row.*
- Q: What's the most common mistake when writing nested loops for patterns?
  → *A: Forgetting `System.out.println()` after the inner loop — this causes all rows to merge into a single line instead of separate rows.*

---

# PART D — Methods

<a name="22"></a>
## 22. Introduction to Methods

**Definition:** A method is a **named block of code** which is **reusable** in nature. (Also known as **functions**.)

### Syntax — 2 Parts
```java
<access-modifier> <modifier> <returnType> methodName(<arguments>) {   // 1) Method Declaration
    // method body                                                     // 2) Method Definition
}
```

### 🔑 Important Facts
1. Method gets **executed only when it is called**.
2. Once created, a method can be called **`n` times**.
3. We can declare **multiple methods** in a class based on requirement.
4. Methods make programs **modular**, easy to read, understand, maintain, and modify.
5. If methods call each other endlessly, we get a **`StackOverflowError`** (since method calls are stored in the **stack**).

### Example
```java
class Program {
    static void test() {
        System.out.println("Executing test()...");
    }

    public static void main(String[] args) {
        System.out.println("Program Starts");
        test();   // method call
        System.out.println("Program Ends");
    }
}
```
**Output:**
```
Program Starts
Executing test()...
Program Ends
```

### 🎯 Interview Questions
- Q: If a method is created but never called, will it execute?
  → *A: No — a method only runs when it is explicitly called.*
- Q: What causes a `StackOverflowError` in the context of methods?
  → *A: Methods calling each other (or themselves) endlessly without a base/stopping condition — since each call is pushed onto the stack, it eventually overflows.*
- Q: Are "methods" and "functions" different things in Java?
  → *A: No — in Java, methods are commonly also referred to as functions; they're the same concept.*

---

<a name="23"></a>
## 23. Method Declaration Rules

**🔑 Rule:** A method should **always** be declared **directly in the class body** — not inside another method's body, and not inside `main()`.

```java
class Program {
    static void help() {
        System.out.println("Executing help()...");
    }   // ✅ declared directly in class body

    public static void main(String[] args) {
        help();   // ✅ called from inside main
    }
}
```

**Object Creation Note:** Non-static methods require an object to be called; static methods do not (they can be called directly using the class name or, within the same class, directly by name).

### 🎯 Interview Questions
- Q: Can you declare one method inside the body of another method?
  → *A: No — Java does not support nested method declarations. All methods must be declared directly inside a class body.*
- Q: Why can `main()` call `static` methods directly without creating an object?
  → *A: Because `static` methods belong to the class itself, not to any instance, so they can be invoked directly by name within the same class.*

---

<a name="24"></a>
## 24. Calling a Method

**🔑** A method can be called **as many times as needed** — there's no limit.

### Example — Multiple Calls
```java
class Program {
    static void play() {
        System.out.println("Executing Playing()...");
    }

    public static void main(String[] args) {
        System.out.println("Program Starts");
        play();
        play();   // can call as much time as we need
        play();
        System.out.println("Program Ends");
    }
}
```

### Example — Methods Calling Other Methods
```java
class Program {
    static void test() {
        System.out.println("test Starts");
        System.out.println("test Ends");
    }

    static void disp() {
        System.out.println("disp Starts");
        test();   // method calling another method
        System.out.println("disp Ends");
    }

    public static void main(String[] args) {
        System.out.println("main Starts");
        disp();
        System.out.println("main Ends");
    }
}
```
**Output:**
```
main Starts
disp Starts
test Starts
test Ends
disp Ends
main Ends
```

### Example — Multiple Independent Methods
```java
class Program {
    static void help() {
        System.out.println("Executing help()...");
    }
    static void disp() {
        System.out.println("Executing disp()...");
    }
    static void push() {
        System.out.println("Executing push()...");
    }

    public static void main(String[] args) {
        help();
        disp();
        push();
    }
}
```

### 🎯 Interview Questions
- Q: In the "methods calling methods" example, why does "test Starts"/"test Ends" print *between* "disp Starts" and "disp Ends"?
  → *A: Because `disp()` calls `test()` in the middle of its execution — control transfers to `test()`, fully completes it, then returns back to finish the rest of `disp()`.*
- Q: Is there a limit to how many times a method can be called in a program?
  → *A: No — a method can be invoked as many times as the logic requires.*

---

<a name="25"></a>
## 25. Passing Values (Arguments)

**Definition:** Passing values is the concept of **sending values from the calling method to the called method.**

```
Calling Method  --values (arguments)-->  Called Method
```

### Two Types of Arguments

| Type | Definition |
|---|---|
| **Formal Argument** | The variable **created in the method declaration** |
| **Actual Argument** | The **actual value** provided/given when **calling** the method |

### Example
```java
class Program {
    static void test(int a) {     // 'a' is the FORMAL argument
        System.out.println(a);
    }

    public static void main(String[] args) {
        test(25);   // 25 is the ACTUAL argument
    }
}
```

### Passing Multiple Values
```java
class Program {
    static void help(char ch) {
        System.out.println(ch);
    }

    static void play(double arg) {
        System.out.println(arg);
        help('J');
    }

    public static void main(String[] args) {
        play(7.5);
    }
}
```

**🔑 Rules for Multiple Arguments:**
- Formal & actual arguments must be separated using a **comma `,`**.
- It is the **programmer's responsibility** to provide arguments of the **correct type, length, and sequence** — mismatches cause compile errors.

### 🎯 Interview Questions
- Q: What's the difference between formal and actual arguments?
  → *A: Formal = the variable declared in the method's signature (a placeholder). Actual = the real value passed in when the method is called.*
- Q: What happens if you pass arguments in the wrong order (e.g., swap an `int` and `String` position)?
  → *A: Compile-time error — Java checks argument type and sequence strictly against the method's declared signature.*
- Q: Can the formal argument name be different from the actual variable name used when calling?
  → *A: Yes — formal argument names are just local placeholders inside the method; they don't need to match the caller's variable names.*

---

<a name="26"></a>
## 26. Returning Values

**Definition:** Returning a value is the concept of **sending a value from the called method back to the calling method.**

```
Called Method  --value-->  Calling Method
```

### 3 Steps to Return a Value
1. **Declare the return type** based on the value to be returned.
2. **Return a compatible value** using the `return` keyword.
3. **Capture the returned value** inside the calling method.

### Example
```java
class Program {
    static double play() {
        return 4.5;
    }

    public static void main(String[] args) {
        double res = play();       // Step 3: capturing the returned value
        System.out.println(res);
        System.out.println(play());   // can also print directly without storing
    }
}
```

### 🔑 Important Note about `void`
If the return type of a method is given as **`void`**, it means the method does **not return** any value to its calling method.

### 🎯 Interview Questions
- Q: What are the 3 mandatory steps to successfully return a value from a method?
  → *A: (1) Declare a return type, (2) use `return` with a compatible value, (3) capture it in the calling method (or use it directly).*
- Q: Can a `void` method use a `return` statement?
  → *A: Yes, but only a bare `return;` (no value) — used to exit the method early; it cannot return an actual value.*
- Q: What happens if the return type is `double` but you write `return "5";`?
  → *A: Compile-time error — the returned value's type must be compatible with the declared return type.*
- Q: Do you have to store a method's return value in a variable?
  → *A: No — you can use it directly (e.g., inside `System.out.println(play())`), but if you don't capture or use it at all, the returned value is simply discarded.*

---

## 📌 One-Page Master Summary

- **Source → Byte Code → Machine Code**; `javac` compiles, `java`/JVM interprets.
- **Compile-time error** = never runs. **Exception** = runs partially, then crashes.
- **JDK = JRE + dev tools. JRE = JVM + libraries.**
- Java is platform-independent because **byte code is universal**; only the JVM differs per OS.
- **8 primitive types** — know sizes, ranges, defaults.
- **Pre-inc/dec** acts before use; **post-inc/dec** acts after use.
- **Implicit casting**: small→big, automatic, safe. **Explicit casting**: big→small, manual, risky.
- **If-else**: exactly one block runs, never both. **Ladder**: first true condition wins, rest skipped. **Nested if**: condition inside another condition.
- **Switch**: `break` prevents fall-through; `default` is optional.
- **For loop**: iterations known. **While loop**: iterations unknown, entry-checked. **Do-while**: exit-checked, runs at least once.
- **Nested loops**: outer = rows, inner = columns; inner completes fully per outer step.
- **Methods**: reusable named blocks; execute only when called; can be called `n` times; must be declared directly in class body.
- **Passing values**: formal (declared) vs actual (given at call) arguments.
- **Returning values**: declare return type → `return` compatible value → capture in caller. `void` = returns nothing.

---
*🔥 Go through every 🎯 box one more time before your test — that's where the real marks are.*