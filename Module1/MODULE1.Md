# ☕ Java Complete Prep Kit
### *Module 1 (Language Fundamentals) — COMPLETE ✅*

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

**PART E — Arrays** 🆕
27. Why Arrays? (The Problem with Plain Variables)
28. Array Declaration, Creation & Initialization
29. Default Values in Arrays
30. Array Length & Indexing
31. Iterating Over Arrays

**PART F — Strings** 🆕
32. Introduction to Strings
33. String Creation (Literal vs `new`)
34. String Utility Methods (Complete Reference)

**PART G — Scanner Class** 🆕
35. Introduction to Scanner
36. Scanner Methods (Reading Different Data Types)

**PART H — Recursion** 🆕
37. Introduction to Recursion
38. Types of Recursion & Stack Overflow

**PART I — Industry Standards** 🆕
39. Naming Conventions Every Developer Must Know

**PART J — Module 1 Master Wrap-Up** 🆕
40. The "Why" Questions Every Beginner Must Be Able to Answer
41. Full Module 1 Recap Table
42. 🎯 Comprehensive Module 1 Interview Question Bank

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

**🔑 Golden rule:** *Compile-time errors stop the program from starting at all. Runtime exceptions stop it mid-way.*

### 🎯 Interview Questions
- Q: What's the general exception message format?
  → *A: `<Location of error> : <Type of Exception>`*

---

<a name="4"></a>
## 4. JVM, JDK, JRE

### The Kitchen Analogy
- **JDK** = full kitchen (stove + ingredients + recipe book) → lets you **cook (develop)**
- **JRE** = stove + pre-made ingredients → lets you **serve (run)**, not cook new dishes
- **JVM** = the cook actually operating the stove → does the **execution**

| | **JDK** | **JRE** |
|---|---|---|
| Contains | Dev tools (`javac`) + JRE | JVM + libraries |
| Purpose | Write & compile code | Run compiled code |

**🔑 Containment:** `JDK ⊃ JRE ⊃ JVM`

### 🎯 Interview Questions
- Q: If you only want to run a `.class` file someone gave you, do you need JDK?
  → *A: No — JRE is enough, since it contains the JVM + libraries needed to run byte code.*

---

<a name="5"></a>
## 5. WORA — Write Once, Run Anywhere

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

### 🎯 Interview Questions
- Q: Is `Static` a valid keyword?
  → *A: No — Java keywords are case-sensitive and must be lowercase.*

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
- Q: Can an identifier contain numbers?
  → *A: Yes, but not as the **first** character (e.g., `score1` is valid, `1score` is not).*

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

**🔑 Default values matter a lot** — non-primitives (String, objects) default to **`null`**, NOT to zero or empty string. This is a very common trick question.

### ⚠️ Common Mistakes
```java
float f = 10.22;      // ❌ Error — decimal literal is double by default
float f = 10.22f;     // ✅ Correct
char c = "A";          // ❌ double quotes = String
char c = 'A';           // ✅ single quotes = char
```

### 🎯 Interview Questions
- Q: What is the default value of a `String` variable declared as a class field?
  → *A: `null` — not an empty string `""`. This is a classic gotcha.*
- Q: Why does `float` need an `f` suffix but `double` doesn't?
  → *A: Decimal literals default to `double`; storing one in a smaller `float` needs explicit marking.*

---

<a name="10"></a>
## 10. Operators

### Quick Reference
| Category | Operators |
|---|---|
| Arithmetic | `+ - * / %` |
| Unary | `++ --` |
| Relational | `== != > < >= <=` |
| Logical | `&& || !` |
| Bitwise | `& | ^ ~` |
| Ternary | `? :` |

**🔑 Pre vs Post:** *"Pre = act BEFORE assigning. Post = act AFTER assigning."*
**🔑 Short-circuit:** in `a && b`, if `a` is false, `b` is never evaluated. In `a || b`, if `a` is true, `b` is never evaluated.

### 🎯 Interview Questions
- Q: What's the output?
  ```java
  int a = 5;
  int b = a++ + ++a;
  ```
  → *A: `b = 5 + 7 = 12`.*
- Q: What is `~5`?
  → *A: `-(5+1) = -6`*

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

### 🎯 Interview Questions
- Q: What's the output?
  ```java
  int i = 130;
  byte b = (byte) i;
  System.out.println(b);
  ```
  → *A: `-126` — due to overflow/wraparound past byte's max (127).*

---

<a name="12"></a>
## 12. Variable Scope & Typing

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

**🔑** The default order of execution inside a Java program is **top to bottom** and **left to right**. Control statements (if, switch, loops) let you *alter* this default order.

---

<a name="14"></a>
## 14. If Statements

### Versions
1. **Simple If** — body runs only if condition is true, otherwise skipped entirely.
2. **If-Else** — exactly one block runs, never both, never neither.
3. **If-Else-If Ladder** — checked top to bottom; first true condition wins, rest skipped.
4. **Nested If** — a conditional written inside another condition's body.

```java
if (num < 7) {
    System.out.println("Java full stack");
} else if (num == 7) {
    System.out.println("Mern stack");
} else {
    System.out.println("Dev Ops");
}
```

### 🎯 Interview Questions
- Q: Can both `if` and `else` blocks execute in the same run?
  → *A: Never — exactly one of the two runs, based on the condition.*

---

<a name="15"></a>
## 15. Switch Statement

```java
switch (choice) {
    case 1: System.out.println("COD"); break;
    case 2: System.out.println("UPI"); break;
    default: System.out.println("net Banking");
}
```

**🔑** Without `break`, execution **falls through** into the next case. `default` is optional.

### 🎯 Interview Questions
- Q: What happens if you forget `break`?
  → *A: Fall-through — execution continues into subsequent cases until a `break` or the switch ends.*

---

# PART C — Loops

<a name="16"></a>
## 16. Introduction to Loops
**🔑** Used to execute a block of code multiple times in continuous flow: **For, While, Do-While, For-Each**.

---

<a name="17"></a>
## 17. For Loop
**🔑** Use when the **number of repetitions is known**.
```java
for (initialization; condition; update) {
    // body
}
```
Entry-checked — if condition is false initially, body never runs.

### 🎯 Interview Questions
- Q: How many times does `for(int i=0; i<n; i++)` run?
  → *A: Exactly `n` times.*

---

<a name="18"></a>
## 18. While Loop
**🔑** Use when the **number of iterations is unknown**.
```java
int a = 1;
while (a <= 5) {
    System.out.println("Java");
    a++;
}
```
Also **entry-checked** — condition tested before every iteration, including the first.

### 🎯 Interview Questions
- Q: What happens if you forget to update the loop variable?
  → *A: An **infinite loop**, since the condition never becomes false.*

---

<a name="19"></a>
## 19. Do-While Loop
```java
do {
    // body
} while (condition);
```
**🔑 Key difference:** body executes **at least once**, before the condition is even checked (**exit-checked**).

### 🎯 Interview Questions
- Q: If the condition is false from the start, does `do-while` still run its body?
  → *A: Yes, exactly once.*

---

<a name="20"></a>
## 20. For vs While vs Do-While

| | **For** | **While** | **Do-While** |
|---|---|---|---|
| Iterations | Known | Unknown | Unknown |
| Checked | Entry | Entry | **Exit** |
| Min executions | 0 | 0 | **1 (guaranteed)** |

---

<a name="21"></a>
## 21. Nested Loops & Patterns
**🔑** Outer loop = rows, inner loop = columns. Inner loop completes **fully** for every single outer iteration.
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.print("*" + " ");
    }
    System.out.println();
}
```

### 🎯 Interview Questions
- Q: If outer runs `n` times and inner runs `m` times, how many total times does the inner body execute?
  → *A: `n * m` times.*

---

# PART D — Methods

<a name="22"></a>
## 22. Introduction to Methods
**Definition:** A method is a **named, reusable block of code**. Executes **only when called**; can be called `n` times.

### 🎯 Interview Questions
- Q: What causes `StackOverflowError` with methods?
  → *A: Methods calling each other/themselves endlessly — each call sits on the stack until it overflows.*

---

<a name="23"></a>
## 23. Method Declaration Rules
**🔑** A method must **always** be declared directly inside a class body — never nested inside another method.

---

<a name="24"></a>
## 24. Calling a Method
**🔑** A method can be called as many times as needed — no limit.

---

<a name="25"></a>
## 25. Passing Values (Arguments)

| Type | Definition |
|---|---|
| **Formal Argument** | Variable created in the method **declaration** |
| **Actual Argument** | Real value provided at the **calling** point |

### 🎯 Interview Questions
- Q: Difference between formal and actual arguments?
  → *A: Formal = placeholder in the method signature. Actual = the real value passed when calling.*

---

<a name="26"></a>
## 26. Returning Values

**3 Steps:** (1) Declare return type → (2) `return` a compatible value → (3) Capture it in the calling method.

```java
static boolean verify(int a) {
    if (a % 2 == 0) {
        return true;
    } else {
        return false;
    }
}
public static void main(String[] args) {
    System.out.println(verify(10)); // true
    System.out.println(verify(11)); // false
}
```

**🔑** `void` return type = the method returns **no value** to its caller.

### 🎯 Interview Questions
- Q: Can a `void` method use `return`?
  → *A: Yes, but only a bare `return;` to exit early — it can't return an actual value.*

---

# PART E — Arrays 🆕

<a name="27"></a>
## 27. Why Arrays? (The Problem with Plain Variables)

### The Problem
A normal variable can hold only **ONE value**. If you need to store, say, 100 student marks, creating 100 separate variables (`marks1, marks2, ... marks100`) is unmanageable.

### The Solution — Array
> An **Array** is a **collection/container** that holds **multiple values of the same data type** under a **single variable name**.

**🔑 Key Properties:**
- **Homogeneous** — all elements must be the **same data type**.
- **Fixed size** — once created, the size **cannot change** (this is a limitation compared to Collections, which are dynamic in size).
- **Indexed** — each element has a position number, starting from **`0`**.

### 🎯 Interview Questions
- Q: What's the core limitation of a plain variable that arrays solve?
  → *A: A variable can hold only one value at a time; an array lets you group multiple values of the same type under one name.*
- Q: Is an array's size fixed or dynamic?
  → *A: Fixed — decided at creation time and cannot grow/shrink afterward. (Collections like `ArrayList` are dynamic instead.)*
- Q: Can an array hold a mix of `int` and `String` values?
  → *A: No — arrays are homogeneous; all elements must be the same declared data type.*

---

<a name="28"></a>
## 28. Array Declaration, Creation & Initialization

### 3 Separate Steps
```java
// 1) Declaration — just declares the variable
int[] arr;          // preferred style
int arr[];           // also valid (C-style)

// 2) Creation — allocates memory for a fixed size
arr = new int[5];    // creates an array of 5 int slots

// 3) Initialization — assigning actual values
arr[0] = 10;
arr[1] = 20;
```

### Combined (Most Common) Syntax
```java
// Declaration + Creation together
int[] arr = new int[5];

// Declaration + Creation + Initialization together (array literal)
int[] arr = {10, 20, 30, 40, 50};

String[] names = {"Java", "Python", "C++"};
```

### 🔑 What Actually Happens in Memory
```java
int[] x = new int[4];
```
This creates 4 memory slots, **all filled with the default value** for `int` (which is `0`), until you explicitly assign real values.

### 🎯 Interview Questions
- Q: What are the 3 distinct steps involved in setting up an array?
  → *A: Declaration (naming the variable), Creation (`new` allocates memory of a fixed size), and Initialization (assigning actual values to each slot).*
- Q: What's the difference between `int[] arr` and `int arr[]`?
  → *A: Functionally identical — both are valid Java syntax, but `int[] arr` is the preferred/modern style since it groups the type with the array marker.*

---

<a name="29"></a>
## 29. Default Values in Arrays

When an array is **created** but not yet initialized, Java automatically fills every slot with the data type's **default value**.

| Data Type | Default Value |
|---|---|
| `byte`, `short`, `int`, `long` | `0` |
| `float`, `double` | `0.0` |
| `boolean` | `false` |
| `char` | `'\u0000'` (null character) |
| `String` / any Object | `null` |

```java
int[] arr = new int[3];
System.out.println(arr[0]);   // 0 (default, not garbage/random value)

String[] names = new String[3];
System.out.println(names[0]);   // null
```

**🔑** Unlike some languages (like C), Java **never** leaves array slots with garbage/uninitialized memory — it's always a predictable default.

### 🎯 Interview Questions
- Q: What is the default value of an uninitialized `String` array's elements?
  → *A: `null` — not an empty string.*
- Q: If you create `boolean[] flags = new boolean[3]`, what does `flags[0]` print before you assign anything?
  → *A: `false`.*
- Q: Why doesn't Java leave arrays with garbage/random values, unlike C?
  → *A: Java guarantees automatic initialization of every array slot to the type's default value as part of memory safety.*

---

<a name="30"></a>
## 30. Array Length & Indexing

### Getting the Size
```java
int[] arr = {10, 20, 30, 40};
System.out.println(arr.length);   // 4 — NOTE: length is a property, not a method (no parentheses!)
```

**⚠️ Common mistake:** `arr.length` (array size — no parentheses) vs `str.length()` (String size — **with** parentheses, since it's a method). These are frequently confused!

### Index Rules
- Index always starts from **`0`**.
- **Last valid index** = `arr.length - 1`.
- Accessing an index beyond this range throws `ArrayIndexOutOfBoundsException`.

```java
int[] arr = new int[5];   // valid indices: 0, 1, 2, 3, 4
arr[5] = 100;              // ❌ ArrayIndexOutOfBoundsException — index 5 doesn't exist
```

### 🎯 Interview Questions
- Q: What's the difference between `.length` and `.length()`?
  → *A: `.length` is a **property** used for arrays (no parentheses). `.length()` is a **method** used for Strings (parentheses required).*
- Q: For an array of size 10, what is the valid index range?
  → *A: `0` to `9` (i.e., `arr.length - 1`).*
- Q: What exception occurs when you access an invalid array index?
  → *A: `ArrayIndexOutOfBoundsException`.*

---

<a name="31"></a>
## 31. Iterating Over Arrays

### Using a Standard For Loop
```java
int[] arr = {10, 20, 30, 40, 50};
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

### Using Enhanced For-Each Loop
```java
for (int num : arr) {
    System.out.println(num);
}
```
**🔑** For-each is cleaner when you just need the **values** (not the index); use the standard for loop when you need the **index** (e.g., to modify elements or track position).

### 🎯 Interview Questions
- Q: When would you choose a standard `for` loop over a for-each loop for array iteration?
  → *A: When you need the index itself — e.g., to modify array elements in place, or to compare adjacent elements.*
- Q: Can you modify array elements using a for-each loop?
  → *A: No — the loop variable in for-each is a **copy** of each element; changing it does not affect the original array.*

---

# PART F — Strings 🆕

<a name="32"></a>
## 32. Introduction to Strings

**Definition:** A `String` is a **non-primitive datatype** used to represent a **sequence of characters**.

```java
String city = "Indore";
```

**🔑 Immutability:** Strings in Java are **immutable** — once created, a String object's value can never be changed. Any operation that appears to "modify" a String (like concatenation or `.toUpperCase()`) actually creates and returns a **brand-new** String object.

### 🎯 Interview Questions
- Q: What does it mean for a String to be immutable?
  → *A: Once a String object is created, its internal character sequence cannot be changed — any modification-looking operation returns a new String object instead.*
- Q: If Strings are immutable, why does this work — `str = str + "!"`?
  → *A: It doesn't modify `str` in place; it creates a brand-new String (the concatenated result) and reassigns the reference `str` to point to that new object. The old String object still exists unchanged (until garbage collected).*

---

<a name="33"></a>
## 33. String Creation (Literal vs `new`)

```java
String s1 = "Indore";              // String literal — stored in the String Pool
String s2 = new String("Indore");  // creates a new object in Heap memory (NOT the pool)
```

**🔑 String Pool concept:** String literals are stored in a special memory area called the **String Constant Pool**. If you create another literal with the **same value**, Java reuses the existing object instead of creating a new one — saving memory.

```java
String s1 = "Java";
String s2 = "Java";
System.out.println(s1 == s2);        // true — both point to the SAME pooled object

String s3 = new String("Java");
System.out.println(s1 == s3);        // false — s3 is a NEW object in heap, different reference
System.out.println(s1.equals(s3));   // true — same actual content
```

**🔑 Golden rule:** Always use `.equals()` to compare String **content**; `==` compares **references** (memory addresses), which can give misleading results.

### 🎯 Interview Questions
- Q: What's the difference between `String s = "abc"` and `String s = new String("abc")`?
  → *A: The literal form reuses an object from the String Pool if one with the same value already exists. `new String()` always forcibly creates a brand-new object in heap memory, bypassing the pool.*
- Q: Why should you use `.equals()` instead of `==` to compare Strings?
  → *A: `==` compares object references (memory addresses), not content. Two Strings with identical text can have different references (e.g., one from the pool, one via `new`), causing `==` to incorrectly return `false`.*

---

<a name="34"></a>
## 34. String Utility Methods — Complete Reference

| Method | Purpose | Example → Output |
|---|---|---|
| `length()` | Returns number of characters | `"Java".length()` → `4` |
| `charAt(index)` | Returns char at a given index | `"Java".charAt(1)` → `'a'` |
| `toCharArray()` | Converts String to a char array | `"Java".toCharArray()` → `['J','a','v','a']` |
| `indexOf(char/str)` | Returns **first** occurrence's index (-1 if not found) | `"banana".indexOf('a')` → `1` |
| `lastIndexOf(char/str)` | Returns **last** occurrence's index | `"banana".lastIndexOf('a')` → `5` |
| `contains(str)` | Checks if a substring exists | `"Java".contains("av")` → `true` |
| `equals(str)` | Compares content, **case-sensitive** | `"Java".equals("java")` → `false` |
| `equalsIgnoreCase(str)` | Compares content, **case-insensitive** | `"Java".equalsIgnoreCase("JAVA")` → `true` |
| `startsWith(str)` | Checks prefix | `"Indore".startsWith("In")` → `true` |
| `endsWith(str)` | Checks suffix | `"Indore".endsWith("re")` → `true` |
| `toUpperCase()` | Converts to uppercase (new String) | `"java".toUpperCase()` → `"JAVA"` |
| `toLowerCase()` | Converts to lowercase (new String) | `"JAVA".toLowerCase()` → `"java"` |
| `substring(start)` | Extracts from `start` to end | `"Indore".substring(2)` → `"dore"` |
| `substring(start,end)` | Extracts from `start` up to (excluding) `end` | `"Indore".substring(1,4)` → `"ndo"` |
| `split(regex)` | Splits String into a **String array** based on a delimiter | `"a,b,c".split(",")` → `["a","b","c"]` |
| `trim()` | Removes leading/trailing whitespace | `"  hi  ".trim()` → `"hi"` |
| `replace(old,new)` | Replaces all occurrences | `"cat".replace('c','b')` → `"bat"` |

### Worked Example
```java
class Data {
    public static void main(String[] args) {
        String s = "Java 4.20";
        System.out.println(s.length());          // 9
        System.out.println(s.charAt(0));          // 'J'
        System.out.println(s.toUpperCase());      // JAVA 4.20
        System.out.println(s.indexOf("4"));       // 5
        String[] parts = s.split(" ");            // ["Java", "4.20"]
    }
}
```

### 🎯 Interview Questions
- Q: What does `indexOf()` return if the character/substring isn't found?
  → *A: `-1`.*
- Q: What's the difference between `equals()` and `equalsIgnoreCase()`?
  → *A: `equals()` is case-sensitive; `equalsIgnoreCase()` treats uppercase and lowercase letters as equal.*
- Q: Does `substring(start, end)` include the character at index `end`?
  → *A: No — it extracts up to but **excluding** the `end` index (i.e., `[start, end)`).*
- Q: What does `.split(",")` return — a String or something else?
  → *A: A **String array** — each piece between the delimiters becomes one array element.*
- Q: Does calling `.toUpperCase()` on a String change the original String?
  → *A: No — because Strings are immutable, it returns a **new** String; the original is untouched unless you reassign the variable.*

---

# PART G — Scanner Class 🆕

<a name="35"></a>
## 35. Introduction to Scanner

**Definition:** `Scanner` is an **inbuilt class**, present in the `java.util` package, provided by Java to allow a program to **access user input** or predefined input (e.g., from the keyboard).

### Why Do We Need Scanner?
A program is often not useful if it can only work with hardcoded values. **Scanner lets your program become interactive** — accepting real-time input from the user via the keyboard (`System.in`) rather than always using fixed values baked into the code.

### 3 Steps to Use Scanner
```java
// 1) Import the Scanner class
import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        // 2) Create an object of Scanner, tied to keyboard input (System.in)
        Scanner sc = new Scanner(System.in);

        // 3) Read values using Scanner's methods
        System.out.println("Enter your value: ");
        int val = sc.nextInt();
        System.out.println(val);
    }
}
```

### 🔑 Why `System.in`?
`System.in` represents the **standard input stream** — by default, this is the keyboard. Passing it to `new Scanner(System.in)` tells the Scanner object *where* to read input from.

### 🎯 Interview Questions
- Q: What package does the `Scanner` class belong to?
  → *A: `java.util`.*
- Q: Why do we pass `System.in` when creating a Scanner object?
  → *A: It tells the Scanner which input source to read from — `System.in` represents the standard input stream, typically the keyboard.*
- Q: Why is Scanner important for real-world programs?
  → *A: It allows programs to be interactive and dynamic, accepting live user input instead of relying solely on hardcoded values.*

---

<a name="36"></a>
## 36. Scanner Methods (Reading Different Data Types)

| Method | Reads |
|---|---|
| `nextInt()` | an `int` |
| `nextLong()` | a `long` |
| `nextFloat()` | a `float` |
| `nextDouble()` | a `double` |
| `nextShort()` | a `short` |
| `nextByte()` | a `byte` |
| `nextBoolean()` | a `boolean` |
| `next()` | a **single word** (`String`, stops at whitespace) |
| `nextLine()` | an **entire line** (`String`, includes spaces, till newline) |

### ⚠️ The Classic `nextInt()` + `nextLine()` Trap
```java
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();       // reads the number, but leaves the trailing "\n" (newline) in the buffer
String name = sc.nextLine();  // ⚠️ immediately reads that leftover "\n" as an empty line!
```
**🔑 Fix:** Add an extra `sc.nextLine()` right after `nextInt()` to "consume" the leftover newline before reading the next line of text.

### Reading a Single Character
There's no direct `nextChar()` method in Scanner — you typically read a String and extract the character:
```java
String input = sc.next();
char ch = input.charAt(0);
```

### What Happens on Invalid Input?
```java
int a = sc.nextInt();
// If the user types a letter instead of a number →
// InputMismatchException is thrown!
```

### 🎯 Interview Questions
- Q: Why doesn't `Scanner` have a `nextChar()` method?
  → *A: It's not part of the Scanner API — instead, you read a token/line as a String and use `.charAt(0)` to extract a single character.*
- Q: What exception is thrown if the input doesn't match the expected data type (e.g., typing text when `nextInt()` is called)?
  → *A: `InputMismatchException`.*
- Q: Why does calling `nextLine()` right after `nextInt()` often produce unexpected (empty) results?
  → *A: `nextInt()` only consumes the number itself, leaving the trailing newline character in the input buffer; the very next `nextLine()` call immediately reads that leftover newline as an empty string.*
- Q: What's the difference between `next()` and `nextLine()`?
  → *A: `next()` reads only a single token up to the next whitespace; `nextLine()` reads the entire line including spaces, until a newline.*

---

# PART H — Recursion 🆕

<a name="37"></a>
## 37. Introduction to Recursion

**Definition:** A method is said to use **recursion** if it **calls itself** back to its own calling method, either directly or indirectly, in order to solve a problem by breaking it into smaller sub-problems.

```java
class Demo {
    static void test() {
        System.out.println("test starts");
        disp();
        System.out.println("test ends");
    }
    static void disp() {
        System.out.println("disp starts");
        test();   // ⚠️ calls test() again — this can lead to infinite recursion!
        System.out.println("disp ends");
    }
}
```

### Factorial Example (classic recursion use case)
```java
static int fact(int n) {
    if (n <= 1) {
        return 1;          // 🔑 BASE CASE — without this, recursion never stops!
    }
    return n * fact(n - 1);  // recursive call
}
```

**🔑 Every recursive method needs 2 essential parts:**
1. **Base Case** — the condition that stops the recursion.
2. **Recursive Case** — where the method calls itself with a smaller/simpler input, moving toward the base case.

### 🎯 Interview Questions
- Q: What are the two mandatory components of any recursive method?
  → *A: A **base case** (stopping condition) and a **recursive case** (the self-call that progresses toward the base case).*
- Q: What happens if you forget the base case?
  → *A: Infinite recursion, which eventually throws a **`StackOverflowError`** once the call stack's memory limit is exhausted.*

---

<a name="38"></a>
## 38. Types of Recursion & Stack Overflow

### Self Recursion (Direct)
A method calls **itself** directly.
```java
static void countDown(int n) {
    if (n == 0) return;
    System.out.println(n);
    countDown(n - 1);   // calling itself directly
}
```

### Mutual Recursion (Indirect)
Two or more methods call **each other** in a cycle.
```java
static void methodA() {
    methodB();   // A calls B
}
static void methodB() {
    methodA();   // B calls A — indirect recursion
}
```

### 🔑 Why Recursion Can Cause StackOverflowError
Every method call — including recursive calls — is stored on the **call stack**. Since the stack has a **limited size**, calling a method (or two methods calling each other) endlessly without ever reaching a base case will eventually **exhaust the stack**, causing a `StackOverflowError`.

```java
static void loopForever() {
    loopForever();   // no base case!
}
// Result: StackOverflowError after enough recursive calls
```

### 🎯 Interview Questions
- Q: What's the difference between self (direct) recursion and mutual (indirect) recursion?
  → *A: Self recursion is a method calling itself directly. Mutual recursion involves two or more methods calling each other in a cycle, indirectly achieving recursion.*
- Q: Why does the JVM throw `StackOverflowError` and not just run forever?
  → *A: Every method call consumes memory on the fixed-size call stack. Without a base case to stop the calls, the stack keeps growing until it runs out of allocated memory, at which point the JVM throws `StackOverflowError`.*
- Q: Is recursion always better than a loop?
  → *A: Not necessarily — recursion can be more elegant/readable for problems with a naturally recursive structure (like tree traversal), but loops are generally more memory-efficient since they don't consume stack space per iteration.*

---

# PART I — Industry Standards 🆕

<a name="39"></a>
## 39. Naming Conventions Every Developer Must Know

Following naming conventions isn't mandatory for code to *compile*, but it's an **industry-standard practice** that every professional Java developer is expected to follow.

| Element | Convention | Example |
|---|---|---|
| **Class name** | Every word starts with an **Uppercase letter** (PascalCase) | `class StudentData`, `class BankAccount` |
| **Method name** | First word **lowercase**, subsequent words capitalized (camelCase) | `calculateTotal()`, `getUserName()` |
| **Variable name** | camelCase, starts lowercase | `int studentAge`, `String firstName` |
| **Constant** | ALL UPPERCASE with underscores | `static final int MAX_LIMIT = 100;` |
| **Package name** | All **lowercase**, often reversed domain | `com.company.project` |

**🔑 Why this matters:** Code is read far more often than it's written. Consistent naming makes code instantly recognizable — seeing `StudentData` immediately signals "this is a class," while `studentAge` signals "this is a variable/field."

### 🎯 Interview Questions
- Q: Is following naming conventions mandatory for the code to compile?
  → *A: No — Java doesn't enforce naming conventions at the compiler level; they're a widely followed industry best-practice for readability and team collaboration.*
- Q: What naming style is used for Java class names, and why does it differ from variable names?
  → *A: PascalCase (e.g., `StudentData`) for classes, vs camelCase (e.g., `studentData`) for variables/methods — this visual distinction lets developers instantly tell classes apart from variables/methods just by looking at the name.*

---

# PART J — Module 1 Master Wrap-Up 🎓

<a name="40"></a>
## 40. The "Why" Questions Every Beginner Must Be Able to Answer

These are the deep, conceptual questions that separate someone who has *memorized* syntax from someone who actually *understands* Java. Master these.

### ❓ Why does every Java program need a `class`?
**A:** Java is a fully **object-oriented language** — everything in Java must exist inside a class. There's no way to write "loose" code floating outside a class structure, unlike scripting languages like Python or JavaScript.

### ❓ Why is `main()` written exactly as `public static void main(String[] args)`?
Breaking down every single keyword:
| Keyword | Why it's required |
|---|---|
| `public` | The JVM (which is *outside* your class/package) needs to call `main()` from the outside world — so it must be accessible everywhere, hence `public`. |
| `static` | The JVM calls `main()` **without creating an object** of your class first. Since only `static` members can be accessed without an object, `main` **must** be static. |
| `void` | `main()` doesn't need to return any value back to the JVM that called it — its job is just to *start* the program's execution. |
| `main` | This exact name is hardcoded as the recognized entry point that the JVM specifically looks for. |
| `String[] args` | Allows command-line arguments to be passed into the program when it's launched. |

### ❓ Why is `main` `static`?
Because when the JVM starts your program, **no objects exist yet** — nothing has been instantiated. Since `static` members belong to the *class itself* (not to any instance), the JVM can call a static `main()` directly without needing to create an object first. If `main` weren't static, the JVM would face a chicken-and-egg problem: it would need an object to call `main`, but creating that object typically requires code to already be running.

### ❓ Why is it `System.out.println()` and not just `print()`?
Breaking it down:
- **`System`** — a built-in Java class that represents system-level resources.
- **`out`** — a `static` field inside the `System` class, representing the **standard output stream** (by default, your console/terminal).
- **`println()`** — a method on that output stream object which prints text followed by a new line.

**🔑** Since `out` is `static`, you can access it directly via the class name `System.out` — no object creation needed, which is why you can call it immediately from within `main()`.

### ❓ Why do we need the `Scanner` class at all?
Because without it, a Java program can only work with values that are **hardcoded** at compile time. Scanner bridges the gap between your static code and dynamic, real-world **user input**, making programs genuinely interactive.

### ❓ What is the "parent-most" object/class in Java?
**A:** Every single class in Java — whether you explicitly say so or not — **implicitly extends** a built-in class called **`Object`** (from `java.lang`). This makes `Object` the **root/parent-most class** of the entire Java class hierarchy. Even a class you write with zero `extends` keyword is secretly a child of `Object`, which is why every Java object automatically has certain built-in methods like `.toString()`, `.equals()`, and `.hashCode()` available to it.

### ❓ Why are arrays fixed-size, but Strings can be "resized" (via concatenation)?
**A:** They can't actually be resized either! When you do `str = str + "more text"`, Java **creates a brand-new String object** with the combined content and reassigns the reference — it doesn't grow the original. Both arrays and Strings are fundamentally fixed-size/immutable in memory; what *looks* like resizing is really just replacement.

### ❓ Why does Java give every primitive a default value, but objects default to `null`?
**A:** Primitives store their **actual value directly** in memory, so Java needs to put *something* there — hence sensible defaults like `0` or `false`. Objects (including arrays, Strings) are **references/pointers** to memory elsewhere; when no object has been created yet, there's nothing to point to, so the natural default is `null` (i.e., "points to nothing").

---

<a name="41"></a>
## 41. Full Module 1 Recap Table

| Topic | One-Line Definition |
|---|---|
| Compilation | Converts entire source code → byte code at once (`javac`) |
| Interpretation | Converts byte code → machine code, line by line (`java`/JVM) |
| JVM | Executes byte code, manages memory |
| JDK | Dev tools + JRE (write & compile code) |
| JRE | JVM + libraries (run code) |
| Keywords | Reserved, lowercase, predefined words |
| Identifiers | Programmer-chosen names, following naming rules |
| Data Types | 8 primitives + non-primitives (String, arrays, objects) |
| Operators | Arithmetic, unary, relational, logical, bitwise, ternary |
| Type Casting | Implicit (safe, small→big) vs Explicit (risky, big→small) |
| Control Statements | if/else, switch — alter default top-to-bottom flow |
| Loops | for (known iterations), while (unknown, entry-checked), do-while (exit-checked, ≥1 run) |
| Methods | Reusable named blocks; execute only when called |
| Passing Values | Formal (declared) vs Actual (given) arguments |
| Returning Values | Declare type → `return` value → capture in caller |
| Arrays | Fixed-size, homogeneous, index-based (0-based) collections |
| Strings | Immutable character sequences with rich utility methods |
| Scanner | Reads dynamic user input from `System.in` |
| Recursion | A method calling itself; needs a base case to avoid `StackOverflowError` |
| Naming Conventions | PascalCase for classes, camelCase for methods/variables |

---

<a name="42"></a>
## 42. 🎯 Comprehensive Module 1 Interview Question Bank

**Class & Structure**
- Q: Why must every piece of Java code live inside a class?
  → *A: Java is purely object-oriented — there's no concept of code existing outside a class structure.*
- Q: What is the "parent-most" class in Java, and how is it involved even when you don't write `extends`?
  → *A: `Object` (from `java.lang`) — every class implicitly extends it, directly or indirectly, giving every object built-in methods like `toString()` and `equals()`.*

**Main Method**
- Q: Why is `main` declared `public static void`?
  → *A: `public` so the JVM (external to your class) can call it; `static` so it can be invoked without creating an object first; `void` because it doesn't need to return anything to the JVM.*
- Q: What would happen if you removed `static` from `main`?
  → *A: The program would fail to run — the JVM specifically looks for a `static` `main` method as the entry point, since it can't create an object to call an instance method before any code has run.*

**Output & System**
- Q: Why is it `System.out.println()` and not simply `println()`?
  → *A: `println()` is a method that belongs to `out`, which itself is a static field of the `System` class — you must go through this chain (`System.out.println`) to access it.*

**Data Types & Variables**
- Q: What's the default value of a `String` field, and why does it differ from `int`'s default?
  → *A: `null` for String (an object/reference type), `0` for int (a primitive that stores its value directly). References default to "pointing at nothing" (`null`); primitives store a real value, so they default to a neutral number.*

**Scanner**
- Q: Why is Scanner necessary for real-world applications?
  → *A: Programs limited to hardcoded values aren't useful in practice — Scanner allows programs to read live, dynamic input from users.*
- Q: What's the classic bug when mixing `nextInt()` and `nextLine()`?
  → *A: `nextInt()` leaves a trailing newline in the buffer, which the very next `nextLine()` call immediately consumes as an empty string — you need an extra `nextLine()` call to clear the buffer first.*

**Arrays**
- Q: Why are arrays homogeneous and fixed-size?
  → *A: Arrays allocate one contiguous block of memory, sized and typed at creation — this fixed, uniform layout is what makes index-based access so fast, but it also means the type and size can't change afterward.*
- Q: What's the difference between `.length` and `.length()`?
  → *A: `.length` is a property on arrays (no parentheses); `.length()` is a method on Strings (parentheses required).*

**Strings**
- Q: Why are Strings immutable in Java, and what's the benefit?
  → *A: Once created, a String's content can never change — any "modification" creates a new object. This enables safe sharing of String literals via the String Pool (memory efficiency) and makes Strings inherently thread-safe.*
- Q: Why should `.equals()` be used instead of `==` for String comparison?
  → *A: `==` compares references (memory addresses); `.equals()` compares actual content — two different objects can hold identical text but have different references.*

**Recursion**
- Q: What are the two non-negotiable parts of a correct recursive method?
  → *A: A base case (to stop) and a recursive case (to progress toward that base case).*
- Q: Why does infinite recursion cause `StackOverflowError` and not just run forever?
  → *A: Every call occupies space on a fixed-size call stack; once that space runs out, the JVM throws `StackOverflowError`.*

**General Conceptual**
- Q: What's the practical difference between compile-time errors and runtime exceptions, in terms of what the user experiences?
  → *A: A compile-time error means the program **never starts** at all — nothing gets executed. A runtime exception means the program starts and runs, potentially producing partial output, before crashing at the point of the actual issue.*
- Q: Explain, end-to-end, what happens between writing `System.out.println("Hi");` and seeing "Hi" appear on your screen.
  → *A: (1) `javac` compiles your `.java` source into byte code (`.class`). (2) The JVM loads and interprets this byte code line by line, using JIT to convert it into machine code. (3) When it reaches the print statement, it calls the `println` method on the `System.out` stream object, which writes "Hi" to the console (the standard output destination).*

---

## 📌 One-Page Master Summary

- **Source → Byte Code → Machine Code**; `javac` compiles, `java`/JVM interprets.
- **JDK = JRE + dev tools. JRE = JVM + libraries.**
- **8 primitive types** — know sizes, ranges, defaults. Non-primitives default to `null`.
- **Implicit casting**: small→big, automatic. **Explicit casting**: big→small, manual, risky.
- **If-else**: exactly one block runs. **Switch**: `break` prevents fall-through.
- **For loop**: iterations known, entry-checked. **While**: unknown, entry-checked. **Do-while**: exit-checked, ≥1 run guaranteed.
- **Methods**: reusable, execute only when called; formal (declared) vs actual (given) arguments; `return` sends a value back to caller.
- **Arrays**: fixed-size, homogeneous, 0-indexed; `.length` (no parens) for size; default values fill unassigned slots.
- **Strings**: immutable; use `.equals()` not `==`; rich set of utility methods (`substring`, `split`, `indexOf`, etc.).
- **Scanner**: reads dynamic input from `System.in`; watch the `nextInt()`+`nextLine()` trap.
- **Recursion**: needs a base case + recursive case, or you get `StackOverflowError`.
- **`main` is `public static void`** because the JVM needs external, object-free access to start your program.
- **Every class implicitly extends `Object`** — the true parent-most class in Java.
- **Naming conventions**: PascalCase for classes, camelCase for methods/variables — not enforced by the compiler, but essential industry practice.

---
*🔥 Module 1 is now COMPLETE. Go through every 🎯 box and Part J one more time before your test — that's where the real understanding (and marks) come from.*