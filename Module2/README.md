# Java Notes – Module 2 (OOP Concepts)

[![GitHub](https://img.shields.io/badge/GitHub-sourabhsingh88-181717?style=flat&logo=github)](https://github.com/sourabhsingh88)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Sourabh%20Singh%20Mandloi-0A66C2?style=flat&logo=linkedin)](https://linkedin.com/in/sourabh-singh-mandloi/)

Complete revision notes covering Class & Object fundamentals through Interfaces, compiled from handwritten notes. Structured for quick revision before interviews.

**Author:** Sourabh Singh Mandloi · [GitHub](https://github.com/sourabhsingh88) · [LinkedIn](https://linkedin.com/in/sourabh-singh-mandloi/)

## 📖 Table of Contents

1. [Class & Object](#1-class--object)
2. [Constructors](#2-constructors)
3. [Ways to Initialize Object Attributes](#3-ways-to-initialize-object-attributes)
4. [The `this` Keyword & Variable Shadowing](#4-the-this-keyword--variable-shadowing)
5. [Inheritance](#5-inheritance)
6. [Method Overriding & the `super` Keyword](#6-method-overriding--the-super-keyword)
7. [Constructor Chaining](#7-constructor-chaining)
8. [Polymorphism](#8-polymorphism)
9. [Static vs Non-Static Members](#9-static-vs-non-static-members)
10. [Object Class, Upcasting & Downcasting](#10-object-class-upcasting--downcasting)
11. [Factory Method Pattern](#11-factory-method-pattern)
12. [Association, Aggregation & Composition](#12-association-aggregation--composition)
13. [Encapsulation](#13-encapsulation)
14. [Packages & Access Specifiers](#14-packages--access-specifiers)
15. [Wrapper Classes, Autoboxing & Unboxing](#15-wrapper-classes-autoboxing--unboxing)
16. [Abstraction & Abstract Classes](#16-abstraction--abstract-classes)
17. [The Diamond / Ambiguity Problem](#17-the-diamond--ambiguity-problem)
18. [Interfaces](#18-interfaces)
19. [Hybrid Inheritance Using Interfaces](#19-hybrid-inheritance-using-interfaces)
20. [Eclipse IDE – Practical Steps](#20-eclipse-ide--practical-steps)
21. [🔥 Final Java Interview Revision (40 Questions)](#-final-java-interview-revision)

---

# 1. Class & Object

## 📌 Concept Overview

> ### Quick Overview
> **What:** A *class* is a blueprint/logical entity that defines the state (attributes) and behavior (methods) an object will have. An *object* is a real-world physical entity — a combination of state, behavior, and a unique identity.
> **Why:** We need a blueprint before we can create real entities in memory, just like a building needs a plan before construction.
> **Where:** Used everywhere in Java — every real-world entity you model (Employee, Student, Pen, Car) becomes a class, and each real instance becomes an object.
> **Remember:** No object can be created without a class. One class can create *multiple* objects.

---

## 📚 Explanation

- **Object** → A real-world physical entity which is a combination of **state**, **behaviour**, and a **unique identification number**.
    - **State** represents the attributes/properties/fields of the object.
    - **Behaviour** represents the actions performed by an object (its methods).
- **Class** → Represents the *blueprint* of an object. A blueprint decides the state and behaviour of the object. A class acts as a **logical entity** (it doesn't occupy memory the way an object does).

### Steps to Create an Object
1. Identify the entity.
2. Identify the attributes/properties.
3. Create a blue-print (class).
4. Create an object (using the `new` keyword).
5. Assign values to the attributes.

### Notes
- It is **not possible** to create an object without a class/blueprint.
- The respective class is needed to create the respective object — if the class is watched (defined), the object also watches (follows) that structure.
- One class can create **multiple** objects.
- We **don't** create/execute a `main` method inside a blueprint (model) class — it usually lives in a separate `Runner`/`Main` class.

---

## 💻 Code Examples

```java
public class Pen {
    String brand;
    String color;
    double price;
}

public class Employee {
    String empId;
    String name;
    String company;
    double salary;
}

public class Runner {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.brand = "Camlin";
        p1.color = "Black";
        p1.price = 40;

        Employee e1 = new Employee();
        e1.empId = "TCS7015";
        e1.name = "Rahul";
        e1.salary = 45000;
    }
}
```

**Explanation:** `Pen` and `Employee` are classes (blueprints). `p1` and `e1` are objects created using `new`. Each object gets its own independent copy of the attributes, which are then assigned values individually.

---

## 🧠 Important Points / Key Takeaways

- Object = State + Behaviour + Identity.
- Class = logical entity (blueprint); Object = physical entity (real memory instance).
- A class can produce any number of objects.
- Every object created with `new` lives in **heap memory**.
- Don't write an executable `main()` method inside a plain model/blueprint class.

---

## 🎯 Interview Questions for This Topic

### Q1. What is the difference between a class and an object?
**Answer:** A class is a logical blueprint that defines attributes and methods; it doesn't occupy real memory for data. An object is a physical, real-world instance of a class created in heap memory using the `new` keyword.

### Q2. Can an object be created without a class?
**Answer:** No. A class must exist first since it defines the structure (state and behaviour) that the object will follow.

### Q3. What are the two main components that define an object's structure?
**Answer:** State (attributes/fields) and Behaviour (methods).

### Q4. Where are Java objects stored in memory?
**Answer:** All objects in Java are stored in the **heap memory**.

### Q5. How many objects can a single class create?
**Answer:** A class can create any number (multiple) of independent objects, each with its own copy of instance attributes.

### Q6. (Tricky) If two objects are created from the same class, do they share attribute values?
**Answer:** No — each object gets its own separate copy of non-static (instance) attributes, so changing one object's value does not affect another's.

### Q7. (Scenario) You want to represent "Car" in a billing application. What would be your class and what would be an object?
**Answer:** `Car` would be the class (blueprint) defining attributes like model, color, price; a specific car sold to a customer, e.g., `Car c1 = new Car();`, would be the object.


---

# 2. Constructors

## 📌 Concept Overview

> ### Quick Overview
> **What:** A constructor is a special member of a class used to *initialize* an object. It is a special method whose name is always the same as the class name and has no return type.
> **Why:** To assign values to the *n* attributes of an object in a single line, instead of writing one instruction per attribute.
> **Where:** Every object creation (`new ClassName(...)`) invokes a constructor.
> **Remember:** Constructor will **not execute on its own** — it is called automatically only when an object is created using the `new` keyword.

---

## 📚 Explanation

### What is a Constructor?
A constructor is a special block of code used to initialize an object. It is called automatically when an instance of a class is created using the `new` keyword.

- Constructor name is **always the same** as the class name.
- Constructor **cannot** have a `void` or any return type.
- For 1 object, a constructor can be called **only once**; for 1 object, a method can be called **multiple times**.

### Types of Constructors
1. **Default Constructor** — automatically generated by the compiler when the programmer doesn't write any constructor. It is not visible to the programmer.
2. **User-defined Constructor**
    - **Zero-parameter constructor** (no-arg constructor)
    - **Parameterized constructor**

> ⚠️ Note: If a class does **not** contain a user-defined constructor, only then will the compiler generate a default constructor. A class can have *either* a default constructor *or* a user-defined constructor, but **not both**.

### Difference: Constructor vs Method

| Constructor | Method |
|---|---|
| Used to assign values to the attributes | Used to perform some operation/task |
| Name should be same as class name | Method name can be anything |
| Can't have `void` or return type | Methods can have `void` or a return type |
| For 1 object, constructor can be called only once | For 1 object, method can be called multiple times |
| Doesn't return a value | Method can return a value |
| It returns the newly created object | — |

### Who generates the default constructor and when?
After successful compilation, the compiler generates a default constructor **only when there is no user-defined constructor** in the class.

### Constructor Overloading
Constructor overloading is the process of creating **more than one constructor** with **different signatures** in the same class.

**Signature Rules:**
1. The number of parameters must be different, **or**
2. When the number of parameters is the same, at least **one** parameter's data type must be different, **or**
3. When both the number and data type of parameters are the same, at least the **order/sequence** of the data types must be different.

### Constructor Duplication (NOT allowed)
Two constructors with the **exact same signature** (same number, type and order of parameters) is called constructor duplication and causes a **compile-time error** — this is different from overloading.

---

## 💻 Code Examples

### Default vs User-Defined Constructor
```java
public class Mobile {
    String brand, model, color;
    double pnu;

    Mobile() { // user-defined zero-parameter constructor
        System.out.println("We will use Constructor");
    }
}

public class Runner {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
    }
}
```

### Parameterized Constructor
```java
public class Mobile {
    String model;
    double pnu;

    Mobile(String model, double pnu) { // parameterized constructor
        this.model = model;
        this.pnu = pnu;
    }

    void disp() {
        System.out.println("Model: " + model + " Price: " + pnu);
    }
}

public class Runner {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Iphone17", 85000);
        m1.disp(); // Output: Model: Iphone17 Price: 85000.0
    }
}
```

### Constructor Overloading
```java
class Car {
    Car() { }
    Car(int x) { }
    Car(int y, String x) { }
    Car(String y) { }
}
```
Each constructor above has a different signature (parameter count/type/order) — this is valid overloading.

### Constructor Duplication (Invalid — Compile Error)
```java
class Car {
    Car() { }
    Car() { } // ERROR: duplicate constructor, same signature
}
```

---

## 🧠 Important Points / Key Takeaways

- A class has **either** the compiler's default constructor **or** its own user-defined constructor(s) — never both by default.
- Constructor name = Class name, always.
- Constructors cannot have a return type — not even `void`.
- Constructor overloading needs different **signatures**; identical signatures cause constructor duplication (compile error).
- The constructor is what actually **returns the newly created object reference**.

---

## 🎯 Interview Questions for This Topic

### Q1. What is a constructor in Java?
**Answer:** A special member of a class, with the same name as the class and no return type, used to initialize the object's attributes automatically when the object is created.

### Q2. What is the difference between a constructor and a method?
**Answer:** A constructor initializes an object and shares the class's name with no return type, and executes only once per object (at creation). A method performs operations, can have any name and return type, and can be called multiple times.

### Q3. What is a default constructor?
**Answer:** A no-argument constructor automatically inserted by the Java compiler **only if** the class does not define any constructor of its own.

### Q4. (Tricky) If I define a parameterized constructor only, can I still call `new MyClass()` with no arguments?
**Answer:** No. Once you define any constructor, the compiler will not add a default no-arg constructor, so calling `new MyClass()` will cause a compile error unless you also explicitly define a no-arg constructor.

### Q5. What is constructor overloading?
**Answer:** Defining multiple constructors in the same class with different signatures (different number, type, or order of parameters).

### Q6. What is the difference between constructor overloading and constructor duplication?
**Answer:** Overloading requires different signatures and is valid; duplication means two constructors with identical signatures, which is a compile-time error.

### Q7. (Conceptual) Can a constructor return a value?
**Answer:** A constructor cannot have an explicit return type (not even `void`), but internally it implicitly returns the reference of the newly created object.

### Q8. (Scenario) You create a class `Employee` with only a parameterized constructor `Employee(String name)`. What happens if another developer tries `new Employee()`?
**Answer:** It results in a compile-time error because no matching zero-argument constructor exists.


---

# 3. Ways to Initialize Object Attributes

## 📌 Concept Overview

> ### Quick Overview
> **What:** Java provides **5 different ways** to assign values to the attributes of an object.
> **Why:** Depending on the use case (one-time setup, controlled updates, read-only data, etc.), a different initialization strategy is appropriate.
> **Where:** Used across virtually every Java class definition.
> **Remember:** All 5 techniques ultimately just set the value of an instance variable — the difference lies in *when* and *how* that happens.

---

## 📚 Explanation

In total there are **5 ways** to assign values to the attributes of an object:

1. **Directly** (Direct Initialization) — assigning a value to the attribute at the time of declaration itself. Since this happens at declaration time, the attribute value remains the same for **all** objects (until updated).
2. **Using Object Reference** — assigning values to attributes from outside the class using the object/reference variable (e.g., `obj.attribute = value;`).
3. **Using Constructor** — passing values as constructor parameters at the time of object creation.
4. **Using Block** — using instance (non-static) initializer blocks.
5. **Using Method** (Setter methods) — calling a setter method after object creation to assign the value.

### Direct Initialization
Direct initialization is the process of assigning a value to the attribute **at the time of declaration**. Since it happens for all objects, the attribute value remains the same, and it is also possible to update it afterward.

---

## 💻 Code Examples

### 1. Directly (Direct Initialization)
```java
public class HeadPhone {
    String model;
    String madeIn = "India"; // direct initialization
    double pnu;

    void disp() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + pnu);
        System.out.println("Made In: " + madeIn);
    }
}
```

### 2. Using Object Reference
```java
public class Employee {
    String name;
    String company;
    double salary;
}

public class Runner {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Rohit";       // object reference assignment
        e1.company = "Infosys";
        e1.salary = 34000;
    }
}
```

### 3. Using Constructor
```java
public class Bike {
    String brand, model, color;
    double pnu;

    Bike(String brand, String model, double pnu, String color) {
        this.brand = brand;
        this.model = model;
        this.pnu = pnu;
        this.color = color;
    }
}
```

### 4. Using Block
```java
public class Employee {
    String name;
    {
        name = "Raj"; // instance block assigns value
    }
}
```
(See [Section 9](#9-static-vs-non-static-members) for the full details on blocks.)

### 5. Using Setter Method
```java
public class Student {
    private double percentage;

    public void setPercentage(double percentage) {
        if (percentage >= 0 && percentage <= 100) {
            this.percentage = percentage;
        } else {
            System.out.println("Invalid percentage");
        }
    }
}
```

---

## 🧠 Important Points / Key Takeaways

- There are exactly **5** ways to assign attribute values: Direct, Object Reference, Constructor, Block, Method (Setter).
- Direct initialization values apply the same across all objects at creation time, but can still be overridden/updated later.
- All objects in Java are stored in **heap memory**; a reference/object variable stores the (hexadecimal) address of the object.
- We access the data members (attributes) and member functions (methods) of an object using the **object reference variable**.

---

## 🎯 Interview Questions for This Topic

### Q1. How many ways are there in Java to initialize the attributes of an object?
**Answer:** Five — direct initialization, using object reference, using constructor, using instance block, and using setter methods.

### Q2. What is direct initialization?
**Answer:** Assigning a value to an attribute at the point of its declaration in the class, e.g., `String madeIn = "India";`.

### Q3. (Conceptual) If an attribute is directly initialized, can it still be changed for a specific object?
**Answer:** Yes — direct initialization just sets a default value at declaration time; it can still be updated later using object reference, setter, or constructor.

### Q4. What is an object reference variable?
**Answer:** A variable that stores the (hexadecimal) address of the object created in heap memory, and through which we access the object's attributes and methods.

### Q5. (Scenario) Which initialization method is most appropriate for enforcing validation (e.g., percentage between 0–100)?
**Answer:** Using setter methods, since they can include conditional validation logic before assigning the value.

### Q6. (Tricky) If you use both direct initialization and a constructor for the same attribute, which value wins?
**Answer:** The constructor's assignment wins, because direct initialization runs first (at object creation) and the constructor body executes right after, overwriting the value.


---

# 4. The `this` Keyword & Variable Shadowing

## 📌 Concept Overview

> ### Quick Overview
> **What:** `this` is a keyword used to refer to the **current object** (the object on which the current method/constructor is invoked).
> **Why:** It is needed to differentiate between an attribute name and a parameter name when they are the same, and to refer to the current calling object.
> **Where:** Used inside constructors and instance methods, especially when parameter names match attribute names.
> **Remember:** `this` is completely optional to use **unless** the attribute name and parameter name are the same — in that case it becomes necessary to differentiate between them.

---

## 📚 Explanation

`this` is a keyword used for referencing the **current object**. Whenever the attribute name and the parameter name are the same, we use `this.attributeName` to differentiate between them.

- `this` acts as a reference to the current calling object.
    - Example: for object `b1`, inside a method, `this` acts as `b1`.
    - For `b1`, `this.model` refers to `b1.model`.
- The general convention is to give a prefix like a local variable name to the parameter, then use `this` to differentiate it from the attribute.

### Variable Shadowing
Variable shadowing occurs when a variable defined in an **inner scope** shares the exact same name as a variable in an **outer scope**.

- The Java compiler searches scope from the **inside out** and stops immediately at the first matching variable declaration it finds, ignoring the outer variable and its