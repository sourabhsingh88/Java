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

- The Java compiler searches scope from the **inside out** and stops immediately at the first matching variable declaration it finds, ignoring the outer variable and its value entirely.
- **Solution:** Use `this` — otherwise the outer (attribute) variable will get a default value instead of the intended one.

---

## 💻 Code Examples

```java
public class Laptop {
    String model;
    String color;
    int ram;
    int ssd;
    String processor;

    Laptop(String m, String c, int r, int s, String p) {
        model = m;
        color = c;
        ram = r;
        ssd = s;
        processor = p;
    }
}
```
> Here, since parameter names (`m`, `c`, `r`...) differ from attribute names, `this` isn't strictly required.

```java
public class Bike {
    String model;
    double pnu;

    Bike(String model, double pnu) {
        this.model = model; // 'this.model' = attribute, 'model' = parameter
        this.pnu = pnu;
    }
}
```
> Here parameter names are the **same** as attribute names — `this` is required to avoid variable shadowing.

---

## 🧠 Important Points / Key Takeaways

- `this` always refers to the object on which the current method/constructor was invoked.
- `this` is optional **except** when attribute and parameter names collide.
- Variable shadowing: Java resolves the *nearest* (innermost) declared variable first — without `this`, you'd be reading/writing the parameter, not the attribute.

---

## 🎯 Interview Questions for This Topic

### Q1. What is the `this` keyword used for in Java?
**Answer:** It refers to the current object — the instance on which the currently executing method or constructor was called.

### Q2. When is `this` mandatory to use?
**Answer:** When a constructor or method parameter has the exact same name as an instance attribute, `this.attributeName` is required to distinguish the attribute from the parameter.

### Q3. What is variable shadowing?
**Answer:** When a variable in an inner scope (such as a constructor parameter) has the same name as a variable in an outer scope (such as a class attribute), the inner variable "shadows" (hides) the outer one within that scope.

### Q4. (Tricky) What happens if you forget to use `this` when parameter and attribute names are identical?
**Answer:** The assignment (e.g., `model = model;`) simply assigns the parameter to itself; the actual attribute never gets updated and retains its default value (e.g., `null` for Strings, `0` for numbers).

### Q5. (Scenario) In method `setSalary(double salary)`, why would you write `this.salary = salary;` instead of just `salary = salary;`?
**Answer:** Because without `this`, `salary = salary` refers to the local parameter only, due to variable shadowing, and the object's `salary` attribute is never actually set.


---

# 5. Inheritance

## 📌 Concept Overview

> ### Quick Overview
> **What:** Inheritance is the process of one class **acquiring** the attributes and methods of another class.
> **Why:** To achieve code reusability, and to lay the foundation for polymorphism and overriding.
> **Where:** Used whenever multiple classes share common attributes/behaviour (e.g., different vehicle types sharing common vehicle properties).
> **Remember:** Inheritance is **uni-directional** — the child can access the parent's members, but the parent **cannot** access the child's members.

---

## 📚 Explanation

### Key Terms
- **Base class / Parent class / Super class** → the class that gives its attributes and methods.
- **Child class / Derived class / Sub class** → the class that acquires those attributes and methods, using the `extends` keyword.

### Why Inheritance?
When different classes contain similar attributes and methods, this leads to duplication of code. Inheritance is a process of grouping such common attributes/behaviours into one parent class so that other (child) classes can simply *acquire* them, avoiding duplication.

### Advantages
1. It achieves code reusability — we don't need to rewrite common logic.
2. It helps achieve polymorphism.
3. It helps achieve method overriding.
4. If a class's code is clean and well organized, others can easily inherit and extend it.

### Is-A Relationship
Inheritance represents a parent-child relationship, generally described as **"is a type of"**. Example: `Dog IS-A Animal`, `Car IS-A Vehicle`.

### Types of Inheritance in Java
1. **Single-level Inheritance** — one class extends one parent (`Object → Father → Son`).
2. **Multi-level Inheritance** — a chain of inheritance (`Object → Father → Son → Grandson`).
3. **Hierarchical Inheritance** — multiple child classes extend the **same** parent (`Vehicle → Bike, Car, Truck`).
4. **Multiple Inheritance** — a class inheriting from more than one class. **Not supported via classes** in Java (see [Diamond Problem](#17-the-diamond--ambiguity-problem)) — achieved only via interfaces.
5. **Hybrid Inheritance** — a combination of the above types, also achieved using interfaces in Java.

> ⚠️ Note: A class can extend only **one** other class, but can implement **multiple** interfaces.

---

## 💻 Code Examples

### Hierarchical Inheritance
```java
class Vehicle {
    String model, color;
    double price;

    void disp() {
        System.out.println("Model: " + model + " Color: " + color + " Price: " + price);
    }
}

public class Bike extends Vehicle { }
public class Car extends Vehicle { }
public class Truck extends Vehicle { }

public class Runner {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.model = "Duke"; b1.color = "Black"; b1.price = 200000;

        Car c1 = new Car();
        c1.model = "City"; c1.color = "Silver"; c1.price = 1600000;
        c1.disp(); // inherited method used directly
    }
}
```

### Single/Multi-level Inheritance (Laptop Brands Example)
```java
class Laptop {
    String model, color, processor;
    double price;

    void disp() {
        System.out.println("Model:" + model + " Color:" + color + " Price:" + price);
    }
}

class Dell extends Laptop {
    Dell(String m, String c, String pr, double p) {
        model = m; color = c; processor = pr; price = p;
    }
}

class HP extends Laptop {
    HP(String m, String c, String pr, double p) {
        model = m; color = c; processor = pr; price = p;
    }
}
```

---

## 🧠 Important Points / Key Takeaways

- Inheritance is uni-directional: child → accesses parent; parent ✗ accesses child.
- `extends` keyword is used for class inheritance.
- Java allows only **single inheritance** at the class level (one `extends` per class); multiple/hybrid inheritance is achieved through interfaces.
- Types: Single-level, Multi-level, Hierarchical, (Multiple and Hybrid — via interfaces only).
- Inheritance promotes code reusability and is foundational to polymorphism and overriding.

---

## 🎯 Interview Questions for This Topic

### Q1. What is inheritance in Java?
**Answer:** The mechanism by which one class (child/subclass) acquires the attributes and methods of another class (parent/superclass) using the `extends` keyword.

### Q2. Why is inheritance described as "uni-directional"?
**Answer:** Because the child class can access the parent's members, but the parent class has no access to anything defined newly in the child class.

### Q3. What are the types of inheritance supported in Java?
**Answer:** Single-level, multi-level, and hierarchical inheritance are directly supported via classes. Multiple and hybrid inheritance are supported only through interfaces, not through classes.

### Q4. (Tricky) Why doesn't Java support multiple inheritance using classes?
**Answer:** To avoid the diamond/ambiguity problem — if a class inherited two parent classes with the same method signature or conflicting constructors, the compiler wouldn't know which parent's implementation to use.

### Q5. What is the "Is-A" relationship?
**Answer:** It describes the inheritance relationship: the child class "is a type of" the parent class, e.g., `Car IS-A Vehicle`.

### Q6. (Conceptual) Can a class extend more than one class in Java?
**Answer:** No. Java allows a class to `extend` only one other class (single inheritance at the class level).

### Q7. (Scenario) You have `Truck`, `Car`, and `Bike`, all sharing `model`, `color`, and `price`. How would you avoid code duplication?
**Answer:** Create a common parent class `Vehicle` with those shared attributes/methods, and have `Truck`, `Car`, and `Bike` each `extend Vehicle`.


---

# 6. Method Overriding & the `super` Keyword

## 📌 Concept Overview

> ### Quick Overview
> **What:** Method Overriding is the process of changing/redefining the implementation of a parent class's method inside the child class. `super` is a keyword used to refer to the immediate parent class.
> **Why:** To let each subclass provide its own specific behaviour for a method that's conceptually the same across all subclasses.
> **Where:** Used heavily in polymorphism — e.g., different subscription types, vehicle types, or web-series apps each implementing a shared method differently.
> **Remember:** Private/Final members **cannot** be overridden or inherited normally; only inherited, non-final, accessible methods can be overridden.

---

## 📚 Explanation

### Method Overriding
Method Overriding is the process of changing the logic/implementation of a parent class method's logic in the child class. Use the `@Override` annotation to indicate that a method is intentionally overriding a parent's method.

**Overriding Rules:**
- **Private** attribute/method → **cannot** be inherited at all.
- **Final** attribute/method → **can** be inherited but **cannot** be overridden.
- **Final class** → **cannot** be inherited (no child class possible), but a final class *can itself* have a parent class.

### The `super` Keyword
`super` is used to refer to the **immediate parent class**. It is useful when:
- The child class has **shadowed** (redefined) an attribute/method with the same name as the parent's — `super.attributeName` / `super.methodName()` accesses the parent's version specifically.
- We need to call the **parent's constructor** explicitly using `super(...)`.

> ⚠️ Note: If a parent class contains **only** a parameterized constructor (no default constructor), the child class **must** explicitly call `super(...)` passing the required values, otherwise a compile-time error occurs (since there is no implicit no-arg parent constructor to call).

---

## 💻 Code Examples

### Method Overriding
```java
class Fare {
    int mrp = 45000;
    void disk() {
        System.out.println("Coffee");
    }
}

class Don extends Fare {
    @Override
    void disk() {
        System.out.println("Dia-Mark");
    }
}

class Doughnut extends Fare {
    @Override
    void disk() {
        System.out.println("Maxlicks");
    }
}

public class Main {
    public static void main(String[] args) {
        Fare f = new Don();
        f.disk();          // Output: Dia-Mark
        f = new Doughnut();
        f.disk();          // Output: Maxlicks
    }
}
```

### `super` for Accessing Shadowed Attributes
```java
class Father {
    protected int money = 50000;
    String carBrand = "Rolls-Royce";
}

class Son extends Father {
    String carBrand = "BMW"; // shadows parent's carBrand

    void payDance() {
        System.out.println("Car: " + super.carBrand + " " + carBrand);
        // Output: Car: Rolls-Royce BMW
    }
}
```

### `super()` for Constructor Chaining
```java
class Person {
    String name;
    int age;
    String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

class Employee extends Person {
    String empId, company;
    double salary;

    Employee(String n, int a, String g, String empId, String company, double salary) {
        super(n, a, g); // must call parent's parameterized constructor
        this.empId = empId;
        this.company = company;
        this.salary = salary;
    }

    @Override
    void display() {
        super.display(); // calls parent's display() first
        System.out.println("EmpId: " + empId + " Company: " + company + " Salary: " + salary);
    }
}
```

---

## 🧠 Important Points / Key Takeaways

- `@Override` is used (best practice) whenever overriding a parent method.
- Private members are never inherited; final members are inherited but can't be overridden; final classes can't be extended.
- `super.member` accesses the parent's shadowed attribute/method.
- `super(...)` must be the **first statement** in a constructor and is used to invoke the parent's constructor.
- If the parent has no default (no-arg) constructor, the child **must** call `super(...)` explicitly with matching arguments.

---

## 🎯 Interview Questions for This Topic

### Q1. What is method overriding?
**Answer:** Redefining a method that is already defined in the parent class, inside the child class, with the exact same signature, to provide subclass-specific behaviour.

### Q2. What is the role of the `@Override` annotation?
**Answer:** It tells the compiler that the method is intended to override a parent class method; the compiler then checks and raises an error if the signature doesn't actually match a parent method (helps catch typos).

### Q3. Can a private method be overridden?
**Answer:** No. Private methods aren't even inherited by the child class, so they can't be overridden.

### Q4. Can a final method be overridden?
**Answer:** No. Final methods can be inherited, but their implementation cannot be changed/overridden in the child class.

### Q5. What does the `super` keyword do?
**Answer:** It refers to the immediate parent class and is used to access a shadowed parent attribute/method or to call the parent's constructor.

### Q6. (Tricky) Why must `super()` be the first line in a constructor?
**Answer:** Because Java needs to fully initialize the parent part of the object before the child's own initialization runs, ensuring the object is built top-down (parent first).

### Q7. (Scenario) A parent class has only `Person(String name, int age)` (no no-arg constructor). What happens if the child class constructor doesn't call `super(...)`?
**Answer:** Compile-time error — Java automatically inserts an implicit `super()` (no-arg) call if you don't write one, but since the parent has no no-arg constructor, this fails to compile. You must explicitly call `super(name, age)`.

### Q8. (Conceptual) Can `super` and `this` both be used to call constructors in the same constructor?
**Answer:** No — only one of `super()` or `this()` can appear in a constructor, and it must be the first statement, since both compete for the "first line" position.


---

# 7. Constructor Chaining

## 📌 Concept Overview

> ### Quick Overview
> **What:** Constructor chaining is the process of one constructor **internally calling another constructor** — either within the same class (`this()`) or from a child class to its parent class (`super()`).
> **Why:** To avoid rewriting the same initialization logic in multiple overloaded constructors.
> **Where:** Used whenever a class has multiple overloaded constructors, or whenever a subclass needs to initialize inherited fields.
> **Remember:** If used, the `this()`/`super()` call **must be the first statement** inside the constructor.

---

## 📚 Explanation

Constructor chaining occurs when one constructor calls another constructor:
- **`this(...)`** — used with respect to **constructor overloading**, to call another constructor of the **same class**.
- **`super(...)`** — used with respect to **inheritance**, to invoke the **parent class's** constructor.

### Example Flow (Same Class Chaining)
```
Student()              → this("unknown")
Student(String name)   → this(name, 18)
Student(name, age)     → actual initialization
```

> ⚠️ Note: If a class contains `N` number of constructors chained together, there will typically be `N-1` `this()` calls internally (all except the "base" constructor that does the actual work).

### Note on Overriding + Chaining
An overriding constructor call using `this()` must be the **first statement** inside the constructor.

---

## 💻 Code Examples

```java
public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name) {
        this(name, 18); // calls the 2-arg constructor above
    }

    Student() {
        this("Unknown"); // calls the 1-arg constructor above
    }
}
```

### Chaining Across Inheritance (`super`)
```java
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    String company;
    Employee(String name, String company) {
        super(name);       // calls Person's constructor
        this.company = company;
    }
}
```

---

## 🧠 Important Points / Key Takeaways

- `this()` → chains constructors **within the same class**.
- `super()` → chains constructors **from child to immediate parent**.
- Either call, if present, **must be the first line** of the constructor.
- A constructor cannot use both `this()` and `super()` together (only one first-line call allowed).
- Constructor chaining reduces duplicate initialization code across overloaded constructors.

---

## 🎯 Interview Questions for This Topic

### Q1. What is constructor chaining?
**Answer:** The process where one constructor calls another constructor, either in the same class using `this()` or in the parent class using `super()`, to reuse initialization logic.

### Q2. What is the difference between `this()` and `super()` in the context of constructor chaining?
**Answer:** `this()` calls another constructor of the *same* class (used with overloading); `super()` calls a constructor of the *immediate parent* class (used with inheritance).

### Q3. (Tricky) Can you use both `this()` and `super()` in the same constructor?
**Answer:** No — only one can be used, and it must be the very first statement in the constructor, so they cannot coexist in the same constructor.

### Q4. What happens if `this()`/`super()` is not the first statement in a constructor?
**Answer:** It results in a compile-time error, since Java mandates it must be the first executable statement.

### Q5. (Scenario) A `Student` class has 3 overloaded constructors, each with more parameters than the last, all eventually assigning the same fields. How would you use constructor chaining to avoid duplication?
**Answer:** Have each smaller constructor call the next one via `this(...)`, supplying default values for the missing parameters, so only the most detailed constructor contains the actual assignment logic.


---

# 8. Polymorphism

## 📌 Concept Overview

> ### Quick Overview
> **What:** "Poly" means many, "morph" means forms — Polymorphism means one object/method showing multiple forms.
> **Why:** To allow the same method call to behave differently depending on context (arguments passed, or actual object type at runtime).
> **Where:** Used in overloaded methods (like `System.out.println()`'s many versions) and overridden methods (like different subclasses implementing a shared method differently).
> **Remember:** Compile-time polymorphism is resolved by the **compiler** (based on parameters); Runtime polymorphism is resolved by the **JVM** (based on the actual object at runtime).

---

## 📚 Explanation

Polymorphism can be classified into **two types**:

1. **Compile-time Polymorphism** (Early/Static Binding) — achieved through **method overloading** and method shadowing/hiding.
2. **Run-time Polymorphism** (Late/Dynamic Binding) — achieved through **method overriding**.

### Compile-time Polymorphism
With respect to overloaded methods, method binding happens based on the **parameters and arguments passed**, and this happens during compile time — hence called compile-time polymorphism or early/static binding.

```java
public class Instagram {
    static void login(String email, String pwd) {
        System.out.println("email login");
    }
    static void login(long num, String pwd) {
        System.out.println("phone login");
    }
}
```
Calling `Instagram.login("a@gmail.com", "admin123")` vs `Instagram.login(9876543210L, "admin123")` — the compiler decides **which** `login` to call based on argument types, at compile time.

### Runtime Polymorphism
With respect to overriding, method binding happens based on the **actual object type at runtime** (decided by the JVM), rather than the reference type — hence called runtime polymorphism or late/dynamic binding.

```java
class Car {
    static void topSpeed() { System.out.println("Car: 100-120 Kmph"); }
}
class Fortuner extends Car {
    static void topSpeed() { System.out.println("Fortuner: 180-200 Kmph"); }
}
```
When calling via a factory method and object reference `Car c = CarFactory.getCar("safari"); c.topSpeed();`, the method resolved depends on the **actual object** (`Safari`/`Fortuner`) created at runtime — **not** the reference type `Car`. Since a change in the object leads to a change in method binding, it is also called **dynamic binding / dynamic method dispatch**.

> Contrast: With **static methods**, method binding happens based purely on the **reference type**, so a change in the object does *not* change which method is called — this is called **static binding / method shadowing**.

---

## 💻 Code Examples

### Overriding-based Runtime Polymorphism
```java
class WebSeries {
    void watch() {
        System.out.println("Netflix Message");
    }
}
class Amazon extends WebSeries {
    @Override void watch() { System.out.println("Prime Images"); }
}
class Disney extends WebSeries {
    @Override void watch() { System.out.println("Disney Quotes"); }
}

public class Run {
    public static void main(String[] args) {
        WebSeries ws = new Amazon();
        ws.watch(); // Prime Images

        ws = new Disney();
        ws.watch(); // Disney Quotes
    }
}
```

### Factory + Runtime Polymorphism
```java
class CarFactory {
    static Car getCar(String input) {
        if (input.equalsIgnoreCase("safari")) return new Safari();
        else if (input.equalsIgnoreCase("fortuner")) return new Fortuner();
        else return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = CarFactory.getCar("safari");
        if (c != null) c.topSpeed(); // resolved at runtime, based on object type
    }
}
```

---

## 🧠 Important Points / Key Takeaways

- Polymorphism = many forms → 2 types: **Compile-time** (overloading) & **Runtime** (overriding).
- Compile-time polymorphism → resolved by the compiler using parameter types → early/static binding.
- Runtime polymorphism → resolved by the JVM using the actual object → late/dynamic binding / dynamic method dispatch.
- Static methods always use **static binding** based on reference type — changing the underlying object doesn't affect which static method runs.

---

## 🎯 Interview Questions for This Topic

### Q1. What is polymorphism?
**Answer:** The ability of a method, object, or reference to take multiple forms — the same method name behaving differently depending on parameters (overloading) or the actual object (overriding).

### Q2. What are the two types of polymorphism in Java?
**Answer:** Compile-time (static) polymorphism and Runtime (dynamic) polymorphism.

### Q3. How is compile-time polymorphism achieved?
**Answer:** Through method overloading (and method hiding/shadowing for static methods) — resolved by the compiler based on the method signature.

### Q4. How is runtime polymorphism achieved?
**Answer:** Through method overriding — resolved by the JVM at runtime based on the actual object type, not the reference type.

### Q5. (Tricky) Why is runtime polymorphism also called "dynamic method dispatch"?
**Answer:** Because the JVM dispatches (routes) the method call to the correct overridden implementation dynamically, at runtime, based on which object the reference actually points to.

### Q6. (Conceptual) Do static methods participate in runtime polymorphism?
**Answer:** No. Static methods are resolved using static binding based on the reference type at compile time — they cannot be overridden in the polymorphic sense (only hidden/shadowed).

### Q7. (Scenario) You have `Animal a = new Dog();` and both classes define `sound()` (Dog overrides it). What determines which `sound()` runs?
**Answer:** The actual object type (`Dog`), not the reference type (`Animal`) — so `Dog`'s overridden `sound()` executes. This is runtime polymorphism.


---

# 9. Static vs Non-Static Members

## 📌 Concept Overview

> ### Quick Overview
> **What:** If a member (variable/method/block) is prefixed with the `static` keyword, it belongs to the **class**; otherwise it belongs to individual **objects** (non-static).
> **Why:** Static members are shared across all objects (single copy); non-static members are unique per object.
> **Where:** Used for values that should be common across every instance (e.g., a company name, a counter) vs per-object values (e.g., an employee's own salary).
> **Remember:** Static members are created **once**, at class loading time; non-static members are created **every time** an object is created.

---

## 📚 Explanation

### Static vs Non-Static Variables

| Question | Non-Static | Static |
|---|---|---|
| When created? | Only when the object is created | At the time of **class loading** |
| Where stored? | Part of the object → heap memory | Class memory |
| How many copies? | One copy **per object** created | Always **one** copy (with or without an object) |

**Class Loading** is the process of loading a Java program from the hard disk (secondary memory) to memory (primary memory / RAM), and it happens only **once** per class.

### Static vs Non-Static Blocks

Blocks are members of a class used to initialize the attributes of an object; they can also execute a set of instructions. Blocks are classified into 2 categories:
1. **Non-Static Block**
2. **Static Block**

**Non-Static Block**
- Used to initialize non-static (instance) variables.
- Will **not** execute on its own — an object must be created to trigger it.
- Can be called multiple times by creating multiple objects.
- If a class has multiple non-static blocks, they all execute (once per object creation) in **sequential, top-to-bottom order**.
- If a class contains a non-static block **and** a constructor, after compilation all non-static blocks are placed **inside the constructor**, right after the `super()` call — therefore, non-static blocks execute **before** the rest of the constructor's own instructions.

**Static Block**
- Used to initialize static variables of a class.
- Executes only **once**, because class loading happens only once.
- Executes right **after** class loading.

### When Does a Class Get Loaded?
1. Explicit class loading (using a method / reflection).
2. By accessing any variable or method of the class.
3. By having the `main` method inside that class.

### The Complete Order of Execution
1. **Static Block**
2. **Main method**
3. **Non-Static Block**
4. **Constructor**

For **Parent & Child** classes together, the precise order is:
1. Parent Static
2. Child Static
3. Parent Non-Static
4. Parent Constructor
5. Child Non-Static
6. Child Constructor
7. Child Main

### Other Important Facts about Static
- Static variables can be accessed **without creating an object** (using the class name).
- If the object's reference is `null` and we access a **non-static** variable/method → **NullPointerException**.
- If the reference is `null` and we access a **static** variable/method → **no exception** (because static members are accessed via the class, not the object).
- Non-static variables can be accessed **only** with the help of an object/reference variable; static variables can be accessed using the **class name**.
- If the object is destroyed, the static variable is **not** destroyed (it lives in class memory, independent of any object).

---

## 💻 Code Examples

### Static Block Syntax
```java
static {
    // instructions — executes once, at class loading
}
```

### Non-Static Block with Constructor
```java
public class Emp {
    {
        System.out.println("NS Block 1");
    }
    Emp() {
        System.out.println("Const");
    }
}
// After compilation, this behaves as if written:
public class Emp {
    Emp() {
        super();
        System.out.println("NS Block 1"); // block runs first
        System.out.println("Const");      // then constructor body
    }
}
```

### Multiple Non-Static Blocks (Sequential Execution)
```java
public class Employee {
    {
        System.out.println("Non Static Block 1");
    }
    {
        System.out.println("Non Static Block 2");
    }
    {
        System.out.println("Non Static Block 3");
    }
}

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee(); // prints Block 1, 2, 3
        Employee e2 = new Employee(); // prints Block 1, 2, 3 again
    }
}
```

### Static and Non-Static Together
```java
public class Employee {
    { System.out.println("Non-Static Block"); }
    static { System.out.println("Static Block"); }

    public static void main(String[] args) {
        System.out.println("Employee main");
        Employee e1 = new Employee();
        e1 = new Employee();
    }
}
// Output order:
// Static Block          (once, at class loading)
// Employee main
// Non-Static Block      (per object created)
// Non-Static Block
```

---

## 🧠 Important Points / Key Takeaways

- Static → class-level, one copy, loaded once at class loading.
- Non-static → object-level, one copy per object, created at object creation.
- Order of execution: **Static Block → Main → Non-Static Block → Constructor**.
- For inheritance: Parent Static → Child Static → Parent Non-Static → Parent Constructor → Child Non-Static → Child Constructor.
- Null reference + non-static access = `NullPointerException`; Null reference + static access = **no exception**.

---

## 🎯 Interview Questions for This Topic

### Q1. What is the difference between a static and a non-static variable?
**Answer:** A static variable belongs to the class and has a single shared copy created at class loading time; a non-static variable belongs to each object individually, with a separate copy created every time an object is instantiated.

### Q2. When is a static block executed?
**Answer:** Only once, immediately after the class is loaded into memory — before the `main` method runs.

### Q3. (Tricky) If a class has a static block and a non-static block, which executes first?
**Answer:** The static block, since class loading (and thus the static block) happens before any object is created, whereas the non-static block only runs when an object is created.

### Q4. What is class loading?
**Answer:** The process of loading a Java program's class file from the hard disk (secondary memory) into the JVM's memory (primary memory), which happens exactly once for a class.

### Q5. (Conceptual) Why doesn't accessing a static member through a null reference throw a NullPointerException?
**Answer:** Because static members belong to the class, not the object; the JVM resolves them via the class itself rather than dereferencing the object, so a null reference doesn't matter.

### Q6. What is the complete order of execution when an object of a class (with both static/non-static blocks and a constructor) is created for the first time?
**Answer:** Static Block → Main method → Non-Static Block → Constructor.

### Q7. (Scenario) In a parent-child inheritance hierarchy, both classes have static blocks, non-static blocks, and constructors. What is the correct overall execution order when a child object is created?
**Answer:** Parent Static → Child Static → Parent Non-Static → Parent Constructor → Child Non-Static → Child Constructor → Child Main (if invoked from there).

### Q8. Can a static block call a non-static method directly?
**Answer:** No — a static block/method cannot directly reference non-static (instance) members, since those require an object to exist, whereas a static block runs before any object is necessarily created.


---

# 10. Object Class, Upcasting & Downcasting

## 📌 Concept Overview

> ### Quick Overview
> **What:** `Object` is the super-most (root) class in Java — every class implicitly extends it if it doesn't extend anything else. Upcasting refers to a parent class reference pointing to a child object; Downcasting is re-classifying a parent reference back to a specific child type.
> **Why:** `Object` provides common behaviour (like `toString()`, `equals()`) to every Java class. Upcasting/downcasting lets us store and later retrieve specific subtype behaviour through a common (generalized) reference — e.g., storing different product types in one array.
> **Where:** Used in collections of mixed subclasses, generalization/specialization designs, and polymorphic code.
> **Remember:** Downcasting an incompatible object throws a `ClassCastException` — always check with `instanceof` first.

---

## 📚 Explanation

### Object Class
If a class doesn't explicitly extend any class, it internally extends a predefined class called `Object`. `Object` is thus the super-most class in Java, and provides several predefined methods, including:

`getClass()`, `hashCode()`, `equals(Object)`, `clone()`, `toString()`, `notify()`, `notifyAll()`, `wait()`, `wait(long)`, `wait(long, int)`, `finalize()`.

### Generalization & Specialization
- **Generalization** (Upcasting) — grouping common attributes/behaviour into a more general parent class, so multiple specific classes can share it.
- **Specialization** (Downcasting) — the reverse process; re-classifying a general/parent reference back into a more specific child type reference.

### Upcasting
> **Parent Reference = Child Object**

The parent class doesn't know about the specific child class type. All objects of any child class can be referred to using the parent's reference type, and the parent reference can access all members defined in the parent (but not new members introduced by the child, unless downcast).

### Downcasting
Downcasting is the process of **re-classifying** a parent class reference to a specific child class object, using an explicit typecast: `(ChildClass) parentReference`.

> ⚠️ Note: Down-casting an object to an **incompatible** type causes a `ClassCastException` at runtime. Always use `instanceof` to check before downcasting.

---

## 💻 Code Examples

### Storing Mixed Subtypes via a Common Parent (Upcasting)
```java
class ElectronicProduct {
    String brand, model, color;
    double price, warranty;
}

class Mobile extends ElectronicProduct {
    String os;
    double pnu;
}

class Laptop extends ElectronicProduct {
    int ram;
}

public class Main {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Laptop l1 = new Laptop();

        ElectronicProduct[] arr = new ElectronicProduct[2];
        arr[0] = m1; // Upcasting: parent ref = child object
        arr[1] = l1;
    }
}
```

### Downcasting Safely with `instanceof`
```java
for (int c = 0; c < arr.length; c++) {
    if (arr[c] instanceof Mobile) {
        Mobile m = (Mobile) arr[c]; // Downcasting
        System.out.println(m.os);
    } else if (arr[c] instanceof Laptop) {
        Laptop l = (Laptop) arr[c]; // Downcasting
        System.out.println(l.ram);
    }
}
```

### Factory Method Returning the Correct Subtype (Downcast After a Null Check)
```java
Laptop l1 = LaptopFactory.getLaptop("Hp");
if (l1 == null) {
    System.out.println("Invalid Input");
} else if (l1 instanceof Hp) {
    Hp h1 = (Hp) l1;
    h1.hpDetails();
} else if (l1 instanceof Dell) {
    Dell d1 = (Dell) l1;
    d1.dellDetails();
}
```

---

## 🧠 Important Points / Key Takeaways

- `Object` is the root/super-most class of every Java class, with 11 predefined methods.
- Upcasting: `Parent ref = new Child();` — always safe, done implicitly.
- Downcasting: `Child c = (Child) parentRef;` — must be done explicitly, and should be guarded with `instanceof` to avoid `ClassCastException`.
- Generalization groups common features into a parent; Specialization is retrieving the specific (child) view back.

---

## 🎯 Interview Questions for This Topic

### Q1. What is the `Object` class in Java?
**Answer:** The root/super-most class of the Java class hierarchy; every class implicitly extends `Object` if it doesn't extend any other class.

### Q2. What is upcasting?
**Answer:** Assigning a child class object to a parent class type reference, e.g., `Vehicle v = new Car();`. It is done implicitly and is always safe.

### Q3. What is downcasting?
**Answer:** Converting a parent class reference back to a specific child class type using an explicit cast, e.g., `Car c = (Car) v;`. It must be done explicitly.

### Q4. (Tricky) What exception can occur during downcasting, and how do you avoid it?
**Answer:** `ClassCastException`, if the object being cast isn't actually an instance of the target type. It's avoided by checking with `instanceof` before casting.

### Q5. Name any three methods provided by the `Object` class.
**Answer:** Any three of: `toString()`, `equals(Object)`, `hashCode()`, `getClass()`, `clone()`, `wait()`, `notify()`, `notifyAll()`, `finalize()`.

### Q6. (Scenario) You store `Mobile`, `Laptop`, and `Tablet` objects in a single `ElectronicProduct[]` array. How do you safely retrieve and use `Mobile`-specific methods for elements that are actually `Mobile` objects?
**Answer:** Loop through the array, check each element with `if (arr[i] instanceof Mobile)`, then downcast: `Mobile m = (Mobile) arr[i];` before calling mobile-specific methods.


---

# 11. Factory Method Pattern

## 📌 Concept Overview

> ### Quick Overview
> **What:** The Factory Method is a way to create objects in **one centralized place** instead of scattering `new` calls throughout the application.
> **Why:** Helps when the app needs to choose **which** object to create based on some condition (like user input), keeping object-creation logic decoupled from the rest of the code.
> **Where:** Used when many related subclasses exist and the correct one must be chosen dynamically (e.g., choosing a `Laptop` brand based on user input).
> **Remember:** The factory typically returns the **parent type**, but the actual object created is a specific **child type** — this ties directly into upcasting and runtime polymorphism.

---

## 📚 Explanation

Factory Method is a creational design pattern: an app already deals with many objects; a factory method helps when we need to choose which object to create based on some condition, instead of hardcoding `new SpecificClass()` calls everywhere.

- Object creation logic is centralized in **one place**.
- Client code just calls the factory method and gets back a suitable object, typically referenced via the **common parent type**.

---

## 💻 Code Examples

```java
class Laptop {
    String model, color;
    double price;
}

class Hp extends Laptop {
    void hpDetails() { System.out.println("HP Laptop"); }
}
class Dell extends Laptop {
    void dellDetails() { System.out.println("Dell Laptop"); }
}
class Lenovo extends Laptop {
    void lenovoDetails() { System.out.println("Lenovo Laptop"); }
}

class LaptopFactory {
    public static Laptop getLaptop(String input) {
        if (input.equalsIgnoreCase("hp")) {
            return new Hp();
        } else if (input.equalsIgnoreCase("dell")) {
            return new Dell();
        } else if (input.equalsIgnoreCase("lenovo")) {
            return new Lenovo();
        }
        return null;
    }
}

public class Runner {
    public static void main(String[] args) {
        Laptop l1 = LaptopFactory.getLaptop("hp");
        if (l1 == null) {
            System.out.println("Invalid Input");
        } else if (l1 instanceof Hp) {
            Hp h1 = (Hp) l1;
            h1.hpDetails();
        } else if (l1 instanceof Dell) {
            Dell d1 = (Dell) l1;
            d1.dellDetails();
        } else if (l1 instanceof Lenovo) {
            Lenovo le1 = (Lenovo) l1;
            le1.lenovoDetails();
        }
    }
}
```

### Another Example — Car Factory (used with Runtime Polymorphism)
```java
class CarFactory {
    static Car getCar(String input) {
        if (input.equalsIgnoreCase("Safari")) return new Safari();
        else if (input.equalsIgnoreCase("Fortuner")) return new Fortuner();
        else return null;
    }
}
```

---

## 🧠 Important Points / Key Takeaways

- Factory Method centralizes object creation logic in one static method.
- Callers work with the **parent type** reference, decoupled from knowing exact subclasses.
- Combines naturally with `instanceof` + downcasting to use subtype-specific methods.
- Reduces scattered `new` statements and improves maintainability when new subtypes are added.

---

## 🎯 Interview Questions for This Topic

### Q1. What is the Factory Method design pattern?
**Answer:** A creational design pattern where object creation is centralized in a single method (usually static), which decides at runtime which concrete subclass to instantiate and return, based on some input/condition.

### Q2. Why use a Factory Method instead of directly calling `new` everywhere?
**Answer:** It centralizes and decouples object-creation logic, making the code easier to maintain — if a new subtype is added or creation logic changes, you only update the factory, not every call site.

### Q3. (Conceptual) What return type does a Factory Method typically use?
**Answer:** The common parent/superclass or interface type, so the caller can work generically with the returned object regardless of its actual subclass.

### Q4. (Scenario) If `LaptopFactory.getLaptop("acer")` is called but "acer" isn't handled, what should the factory return, and why?
**Answer:** It should return `null` (or throw a meaningful exception) so the caller can detect the invalid input and handle it gracefully, rather than crashing unexpectedly.

### Q5. (Tricky) How does the Factory Method pattern relate to polymorphism?
**Answer:** The factory returns a parent-type reference to a specific child object (upcasting); when methods are called on that reference, runtime polymorphism ensures the correct subclass implementation executes.


---

# 12. Association, Aggregation & Composition

## 📌 Concept Overview

> ### Quick Overview
> **What:** Association, Aggregation, and Composition describe **HAS-A** relationships between objects (as opposed to inheritance's IS-A relationship). One object *contains or uses* another object.
> **Why:** To model real-world relationships where one class needs to *use* another class's functionality/data without inheriting from it.
> **Where:** E.g., a `Person` HAS-A `Address`; a `Doctor` HAS-A `Department`; a `Car` HAS-A `Engine`.
> **Remember:** Inheritance = "**is a type of**" (IS-A). Composition/Aggregation = "**contains / uses / has**" (HAS-A).

---

## 📚 Explanation

- **Association** — a **general** relationship between two objects (e.g., `Doctor` ↔ `Patient`).
- **Aggregation** — a specialized form of association representing a **weak HAS-A** relationship, where the contained object **can exist independently** of the owner (e.g., `Department` HAS-A `Employee` — the employee can exist even if the department is removed).
- **Composition** — a specialized form of association representing a **strong ownership**, where the contained object's life cycle is **strongly tied** to the owner (e.g., `House` HAS-A `Room` — a room typically doesn't exist independently of the house).

### Inheritance vs Composition/Association Quick Comparison

| | Inheritance | Composition / Association |
|---|---|---|
| Represents | Parent-child relationship | Object containment / usage relationship |
| Phrase | "is a type of" | "contains" / "uses" / "has" |
| Keyword | `extends` | Object reference as a field |
| Example | `Dog IS-A Animal` | `Car HAS-A Engine` |

---

## 💻 Code Examples

### HAS-A Relationship (Composition Example)
```java
public class Address {
    String street, area, city, state;
    int pinCode;

    Address(String s, String a, int p, String c, String st) {
        this.street = s; this.area = a;
        this.pinCode = p; this.city = c; this.state = st;
    }

    void addressDetails() {
        System.out.println("Street:" + street + " Area:" + area);
        System.out.println("Pincode:" + pinCode + " City:" + city + " State:" + state);
    }
}

public class Person {
    String name, dob;
    char gender;
    Address location; // Person HAS-A Address

    Person(String n, String d, char g, Address l) {
        this.name = n; this.dob = d;
        this.gender = g; this.location = l;
    }

    void personDetails() {
        System.out.println("Name:" + name + " DOB:" + dob + " Gender:" + gender);
        location.addressDetails(); // delegating to the contained object
    }
}

public class Main {
    public static void main(String[] args) {
        Address addr = new Address("BTM Stage 2", "Parasappa Nilaya", 560068, "Bangalore", "Karnataka");
        Person p1 = new Person("Rahul", "02/04/2023", 'M', addr);
        p1.personDetails();
    }
}
```

---

## 🧠 Important Points / Key Takeaways

- Inheritance → **IS-A**; Composition/Aggregation/Association → **HAS-A**.
- Aggregation → weak ownership (contained object can outlive the container).
- Composition → strong ownership (contained object's life cycle tied to the container).
- Association is the general umbrella term; Aggregation and Composition are its specialized forms.

---

## 🎯 Interview Questions for This Topic

### Q1. What is the difference between IS-A and HAS-A relationships?
**Answer:** IS-A is achieved through inheritance (a subclass "is a type of" its superclass); HAS-A is achieved through composition/association (a class contains a reference to another class as a field).

### Q2. What is the difference between Aggregation and Composition?
**Answer:** Aggregation represents a weak HAS-A relationship where the contained object can exist independently of the owner; Composition represents a strong HAS-A relationship where the contained object's life cycle is tied to the owner.

### Q3. Give a real-world example each of Aggregation and Composition.
**Answer:** Aggregation: `Department HAS-A Employee` (employee exists even if department is dissolved). Composition: `House HAS-A Room` (rooms are meaningless without the house).

### Q4. (Conceptual) Is Association more general than Aggregation and Composition?
**Answer:** Yes — Association is the general relationship between two objects; Aggregation and Composition are specialized, stronger forms of association.

### Q5. (Scenario) You design a `Person` class that needs to store an address. Would you use inheritance or composition, and why?
**Answer:** Composition — a `Person` "has an" `Address`, it isn't "a type of" `Address`, so a `Person` class should hold an `Address` object as a field rather than extending an `Address` class.


---

# 13. Encapsulation

## 📌 Concept Overview

> ### Quick Overview
> **What:** Encapsulation is the process of binding data members (attributes) with member functions (non-static methods) into a single unit (class), typically by making attributes `private` and exposing controlled access via public getters/setters.
> **Why:** To avoid data mishandling (invalid data), achieve data hiding, and enable data validation.
> **Where:** Used in virtually every well-designed Java class (Java Bean pattern).
> **Remember:** Encapsulation = attaching/binding private attributes with public setter and getter methods into a single unit.

---

## 📚 Explanation

**Encapsulation** is the process of binding the data members (attributes) with the member functions (non-static methods) into a single unit (class). It is also described as attaching/binding private attributes with public setter and getter methods into a single unit.

### Advantages of Encapsulation
- To avoid data mishandling (invalid data).
- To achieve **data hiding**.
- To achieve **data validation**.
- To make data **read-only** (no setter methods provided).
- To make data **write-only** (no getter methods provided).

### Java Bean Specification
1. The class must be `public`, non-abstract, and should implement the `Serializable` marker interface.
2. All the attributes must be `private`.
3. For each private attribute, there must be public **getter** and **setter** methods.
4. There must be a public zero-parameter constructor (default constructor).
5. No other method is allowed except getters and setters.
6. Setter methods perform a **write** operation — all setter methods must be `void` type and should have **one** parameter.
7. Getter methods perform a **read** operation — all getter methods must have a return type with **no** parameters.

---

## 💻 Code Examples

### Full Encapsulated Class with Validation
```java
public class Student {
    private String name;
    private int age;
    private double percentage;

    // Setter — write operation
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }

    public void setPercentage(double percentage) {
        if (percentage >= 0 && percentage <= 100) {
            this.percentage = percentage;
        } else {
            System.out.println("Invalid percentage");
        }
    }

    // Getter — read operation
    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public double getPercentage() { return this.percentage; }
}

public class Run {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Raj");
        s1.setAge(21);
        s1.setPercentage(75.44);
        System.out.println(s1.getName() + " " + s1.getAge() + " " + s1.getPercentage());
    }
}
```

---

## 🧠 Important Points / Key Takeaways

- Encapsulation = binding data + methods, using `private` attributes + `public` getters/setters.
- A Java Bean class must have private fields, public no-arg constructor, and only getter/setter methods.
- Getter methods → read-only, no parameters, must have a return type.
- Setter methods → write-only, `void` return, exactly one parameter, ideal place for **validation logic**.
- Achieves data hiding, validation, and controls read/write access to fields.

---

## 🎯 Interview Questions for This Topic

### Q1. What is Encapsulation?
**Answer:** The process of binding data (attributes) and the methods that operate on that data into a single unit (class), typically by keeping attributes private and exposing controlled access via public getter/setter methods.

### Q2. What is the Java Bean specification?
**Answer:** A convention requiring: a public non-abstract class implementing `Serializable`, all attributes private, a public getter/setter for each attribute, a public no-arg constructor, and no other methods besides getters/setters.

### Q3. How can encapsulation be used to make an attribute read-only?
**Answer:** By providing only a getter method for that attribute and no setter method — external code can read but never modify it directly.

### Q4. (Tricky) Why should setter methods be `void`?
**Answer:** Because a setter's job is to just perform a write/assignment operation; convention says it shouldn't return any value — its purpose is completed once the value is set (optionally after validation).

### Q5. (Scenario) You want to ensure a `Student`'s `age` is always between 1 and 100. Where should this validation logic go?
**Answer:** Inside the setter method (`setAge`), so any attempt to set an invalid value is caught and rejected before it corrupts the object's state.

### Q6. What is data hiding, and how does encapsulation achieve it?
**Answer:** Data hiding means restricting direct access to an object's internal state from outside the class. Encapsulation achieves this by declaring attributes `private`, forcing all access through controlled public methods.


---

# 14. Packages & Access Specifiers

## 📌 Concept Overview

> ### Quick Overview
> **What:** Packages are containers/folders used to store and organize Java resources (classes, abstract classes, interfaces). Access specifiers are keywords that control visibility/access restrictions for classes, methods, and attributes.
> **Why:** Packages help avoid naming conflicts and improve modularity; access specifiers help enforce encapsulation and control what other code can see/use.
> **Where:** Every real Java project is organized into packages, and every class member has some access level.
> **Remember:** Access visibility order (least to most visible): **Private → Default → Protected → Public**.

---

## 📚 Explanation

### Packages
Packages are nothing but containers/folders used to store Java resources (classes, abstract classes, interfaces).

**Advantages:**
- Help avoid naming conflicts.
- Help in easy accessibility to a particular resource.
- Modification can be made quickly due to easy accessibility to the resource.
- Help in achieving **modularity**.

Java supports both **predefined packages** and **user-defined packages**.

**Package Creation (Eclipse):**
1. Right-click on the `src` folder.
2. Click on `New`.
3. Click on `Package`.
4. Provide the package name, then click Finish.

When a class is created inside a package, the package declaration is **mandatory** and must be the **first line** in the program:
```java
package packageName;
```

### Importing Across Packages
When we want to access a resource from one package in another package, importing that resource is necessary.

```java
import packageName.className;      // import a specific class
import packageName.*;              // import all classes from a package (not recommended)
```

- It is possible to define multiple import statements.
- **Fully Qualified Class Name** — the class name along with its package information (e.g., `packageName.Employee`). Using the fully qualified name means you need **not** import the class separately — useful when two packages have classes with the same name.

### Access Specifiers
Access specifiers are keywords which help provide access restrictions for Java resources.

**Types:** `public`, `protected`, `default`, `private`.

| Access Specifier | Same Class | Same Package | Different Package | Different Package (via Inheritance) |
|---|---|---|---|---|
| **Public** | Yes | Yes | Yes | Yes |
| **Protected** | Yes | Yes | No | Yes (inheritance) |
| **Default** | Yes | Yes | No | No |
| **Private** | Yes | No | No | No |

**Visibility vs Security (Triangle Rule):**
```
        Private        ← Less visibility, More security
        Default
        Protected
        Public         ← More visibility, Less security
```

- **Public** → attributes/methods accessible everywhere (same class, same package, different package).
- **Protected** → accessible within same class, same package, and different package **only via inheritance**.
- **Default** (no modifier) → accessible within same class and same package only.
- **Private** → accessible **only within the same class**.

---

## 💻 Code Examples

### Package Declaration & Cross-Package Access
```java
// File in package1
package package1;
public class Employee {
    protected String name;
    protected int salary;
    protected void display() {
        System.out.println(name + " " + salary);
    }
}
```

```java
// File in package2
package package2;
import package1.Employee;

public class JuniorEmployee extends Employee {
    public static void main(String[] args) {
        JuniorEmployee j1 = new JuniorEmployee();
        j1.name = "Krishna";      // accessible: protected + inheritance
        j1.salary = 65000;
        j1.display();
    }
}
```

---

## 🧠 Important Points / Key Takeaways

- Package declaration, if present, **must be the first line** in the file.
- `import package.*;` imports all classes but is **not recommended** — prefer specific imports.
- Fully Qualified Class Name lets you skip the `import` statement and resolves same-name class conflicts across packages.
- Access order (least → most visible): `private < default < protected < public`.
- `protected` members are accessible in a different package **only** through inheritance.

---

## 🎯 Interview Questions for This Topic

### Q1. What is a package in Java?
**Answer:** A container/folder used to group and organize related Java classes, abstract classes, and interfaces, helping avoid naming conflicts and improve modularity.

### Q2. What are the four access specifiers in Java?
**Answer:** `public`, `protected`, `default` (no modifier), and `private`.

### Q3. What is the difference between `protected` and `default` access?
**Answer:** Both allow access within the same class and same package; but `protected` additionally allows access from a different package **through inheritance**, while `default` does not allow any cross-package access at all.

### Q4. (Tricky) Can a `private` member of a class be accessed from a subclass in the same package?
**Answer:** No. Private members are accessible **only within the same class** that declares them — not even a subclass in the same package can access them directly.

### Q5. What is a fully qualified class name?
**Answer:** The class name combined with its full package path (e.g., `com.company.Employee`), which lets you reference the class without an explicit `import` statement.

### Q6. (Scenario) You have two classes named `Employee` in two different packages, and you need to use both in the same file. How do you resolve the naming conflict?
**Answer:** Import one normally and refer to the other using its fully qualified class name (e.g., `package2.Employee`) wherever it's used.

### Q7. Where must the `package` statement appear in a Java file?
**Answer:** It must be the very first line of code in the file (before imports and the class declaration).


---

# 15. Wrapper Classes, Autoboxing & Unboxing

## 📌 Concept Overview

> ### Quick Overview
> **What:** Wrapper classes are the **object (non-primitive) representation** of Java's primitive data types. Autoboxing converts a primitive to its wrapper type automatically; Unboxing converts a wrapper object back to its primitive type automatically.
> **Why:** Needed to store primitives in places that require objects (like collections, or a heterogeneous `Object[]` array), and to use utility methods on primitive-like values.
> **Where:** Used with collections (`ArrayList<Integer>`), and whenever primitives need to be treated as objects.
> **Remember:** Every primitive data type has a **corresponding wrapper class**; wrapper classes are `final` and cannot be extended.

---

## 📚 Explanation

### Wrapper Classes
A Wrapper class is the **object representation of a primitive data type**. Wrapper classes are present in the `java.lang` package, they are `final` classes (can't be subclassed), and they help in converting primitive to non-primitive (e.g., String to primitive) types.

| Primitive | Wrapper Class |
|---|---|
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `boolean` | `Boolean` |
| `char` | `Character` |

An **Object Array** is a special type of array capable of storing **any type of data** in Java (primitive or non-primitive) — internally, primitive values placed into it are automatically converted to their wrapper types via autoboxing.

### Autoboxing & Unboxing
- **Autoboxing** — the process of automatically converting a primitive to its corresponding non-primitive (wrapper) type.
- **Unboxing** — the process of automatically converting a non-primitive (wrapper) type back to its primitive type.

After introduction of autoboxing/unboxing, it is possible to directly assign a primitive value to a variable of wrapper type, and vice versa.

### String to Primitive Conversion
A String value can be converted to a primitive using **static `parseXxx()` methods**:

| Method | Description |
|---|---|
| `Byte.parseByte(String str)` | Takes a String input, returns byte |
| `Short.parseShort(String str)` | Takes a String input, returns short |
| `Integer.parseInt(String str)` | Takes a String input, returns int |
| `Long.parseLong(String str)` | Takes a String input, returns long |
| `Float.parseFloat(String str)` | Takes a String input, returns float |
| `Double.parseDouble(String str)` | Takes a String input, returns double |
| `Boolean.parseBoolean(String str)` | Takes a String input, returns boolean |

> ⚠️ Note: `parseBoolean()` is the **only** method among these that does **not** throw a `NumberFormatException`. If the input string equals `"true"` (case-insensitive) it returns `true`; for **any** other input, it simply returns `false`.

---

## 💻 Code Examples

### Autoboxing / Unboxing
```java
public class Main {
    public static void main(String[] args) {
        int i = 10;                    // primitive
        Integer i1 = new Integer(i);   // before autoboxing (explicit)
        Integer i2 = i;                // Autoboxing
        Integer i3 = 100;              // Autoboxing

        int x2 = i1;                   // Unboxing
        Integer y = new Integer(500);
        int x = y;                     // Unboxing
    }
}
```

### Heterogeneous Object Array (relies on Autoboxing internally)
```java
byte b = 10; short s = 34; int i = 55;
long l = 1201; float f = 12.0f; double d = 33.2;
char c = 's'; boolean z = true;

Object[] x = { b, s, i, l, f, d, c, z }; // auto-converted to wrapper objects
for (int j = 0; j < x.length; j++) {
    System.out.println(x[j]);
}
```

### String to Primitive
```java
String s1 = "10";
String s2 = "123";

System.out.println(s1 + s2);              // "10123" (String concatenation)

int i1 = Integer.parseInt(s1);
int i2 = Integer.parseInt(s2);
System.out.println(i1 + i2);              // 133 (numeric addition)

boolean b1 = Boolean.parseBoolean("True"); // true
boolean b2 = Boolean.parseBoolean("123");  // false (no exception!)

int i3 = Integer.parseInt("Abhishek");     // throws NumberFormatException
```

---

## 🧠 Important Points / Key Takeaways

- Every primitive type has a dedicated wrapper class; all wrapper classes live in `java.lang` and are `final`.
- Autoboxing: primitive → wrapper (automatic). Unboxing: wrapper → primitive (automatic).
- `parseXxx(String)` static methods convert Strings to primitives; all except `parseBoolean` can throw `NumberFormatException` on invalid input.
- `Boolean.parseBoolean()` never throws an exception — any non-"true" input just returns `false`.
- Object arrays can store heterogeneous data types because primitives are auto-boxed into their wrapper objects.

---

## 🎯 Interview Questions for This Topic

### Q1. What is a wrapper class in Java?
**Answer:** A class that provides an object representation for a primitive data type (e.g., `Integer` for `int`, `Double` for `double`), located in the `java.lang` package.

### Q2. What is Autoboxing?
**Answer:** The automatic conversion of a primitive value into its corresponding wrapper class object, done implicitly by the compiler.

### Q3. What is Unboxing?
**Answer:** The automatic conversion of a wrapper class object back into its corresponding primitive value.

### Q4. (Tricky) Which `parseXxx()` method does NOT throw a `NumberFormatException` on invalid input?
**Answer:** `Boolean.parseBoolean(String)` — it returns `true` only if the string equals `"true"` (ignoring case), and `false` for anything else, without ever throwing an exception.

### Q5. Can wrapper classes be extended (subclassed)?
**Answer:** No — all wrapper classes in Java are declared `final`, so they cannot be subclassed.

### Q6. (Scenario) You need to store a mix of `int`, `double`, and `String` values in a single array. What type of array would you use, and why does it work?
**Answer:** An `Object[]` array — because primitives are automatically autoboxed into their wrapper objects (`Integer`, `Double`), and `String` is already a non-primitive `Object` type, so all fit under `Object`.

### Q7. What happens when you call `Integer.parseInt("12a3")`?
**Answer:** It throws a `NumberFormatException` at runtime because `"12a3"` is not a valid representation of an integer.


---

# 16. Abstraction & Abstract Classes

## 📌 Concept Overview

> ### Quick Overview
> **What:** Abstraction is the process of **hiding the internal implementation** and providing only the necessary functionality to the user. An **abstract class** is a class that can contain both abstract (no body) and concrete (with body) methods.
> **Why:** To hide *how* something works and expose only *what* it does — e.g., a bank's `getCarLoan()` interest rate calculation can differ per bank, while the calling code just needs the rate.
> **Where:** Used whenever multiple subclasses share a common contract/behaviour but need their own specific implementation for some methods (e.g., different Banks, different Animal sounds).
> **Remember:** An abstract class **cannot** be instantiated directly — you can never do `new AbstractClass()`.

---

## 📚 Explanation

**Abstraction** is the process of hiding the internal implementation and providing only the necessary functionality — this is called abstraction. Hiding implementation and exposing only functionality is the essence of abstraction.

### Concrete Method vs Abstract Method

| Concrete Method | Abstract Method |
|---|---|
| Has method declaration **and** method body | Has method declaration but **no** method body |
| Can be defined in a concrete class, in an abstract class, or in an interface (from v1.8 onward) | Can be defined only in an **abstract class** or an **interface** |

```java
// Concrete Method
void display() {
    // body
}

// Abstract Method
abstract void display();
```

> ⚠️ Note: An abstract method must be prefixed with the `abstract` keyword, and its declaration must be terminated with a semicolon (no `{}` body).

### Characteristics of Abstract Classes / Abstract Methods
- When an abstract class contains an abstract method, the method's body/implementation **has to be given in the child class** — achieved by performing method **overriding**.
- Therefore, all abstract methods have to be overridden in the child class.
- It is **mandatory** to override **all** abstract methods in the child class — if not, the child class itself must be declared `abstract`.
- We **cannot create an object** of an abstract class, because it represents an *incomplete* class (due to unimplemented abstract methods).
- According to the compiler, an abstract class **without** any abstract method will not give any compile-time error — however, an abstract class without an abstract method serves no real purpose.

### Concrete Class vs Abstract Class

| | Concrete class | Abstract class |
|---|---|---|
| Can be `final`? | Yes | No |
| Can be `private`? | Yes | No |
| Can create object? | Yes | No |
| Contains abstract method? | No | Can contain abstract methods |
| Contains concrete method? | Yes | Can contain concrete methods too |
| Constructor? | Yes | Yes (used to initialize attributes) |
| Child class necessary? | Optional | Necessary (to implement abstract methods) |
| Constructor call | Through object creation or constructor chaining | Only through constructor chaining (`super()`) — never via direct object creation |

---

## 💻 Code Examples

### Bank / Loan Real-World Example
```java
public abstract class Bank {
    abstract double getCarLoan();
    abstract double getPersonalLoan();
}

class Hdfc extends Bank {
    @Override
    double getCarLoan() { return 8.15; }
    @Override
    double getPersonalLoan() { return 12.3; }
}

class Icici extends Bank {
    @Override
    double getCarLoan() { return 8.4; }
    @Override
    double getPersonalLoan() { return 13.2; }
}

public class Runner {
    public static void main(String[] args) {
        Bank b = new Hdfc();
        System.out.println(b.getCarLoan()); // 8.15
    }
}
```

### Animal Example
```java
public abstract class Animal {
    abstract void eat();
    abstract void sound();
    abstract void lifespan();
}

class Dog extends Animal {
    @Override void eat() { System.out.println("Pedigree"); }
    @Override void sound() { System.out.println("Bark"); }
    @Override void lifespan() { System.out.println("15 years"); }
}

class Cat extends Animal {
    @Override void eat() { System.out.println("Cat Food"); }
    @Override void sound() { System.out.println("Meow Meow"); }
    @Override void lifespan() { System.out.println("10 years"); }
}
```

### Abstract Class Constructor via Constructor Chaining
```java
abstract class Parent {
    int mrp = 45000;
    Parent() {
        System.out.println("Abstract class constructor called");
    }
}

class Child extends Parent {
    Child() {
        super(); // constructor chaining — this is the ONLY way to invoke an abstract class constructor
    }
}
```

---

## 🧠 Important Points / Key Takeaways

- Abstraction = hiding implementation, exposing only functionality.
- Abstract method = declaration only (no body); Concrete method = declaration + body.
- Abstract classes **cannot** be instantiated, but **can** have constructors (called only via `super()` from a subclass).
- All abstract methods must be overridden in the child class, or the child class must also be declared `abstract`.
- Abstract classes CAN have both static and non-static variables, constructors, and blocks — just like concrete classes.

---

## 🎯 Interview Questions for This Topic

### Q1. What is abstraction in Java?
**Answer:** The process of hiding the internal implementation details of a functionality and exposing only what is necessary to the user.

### Q2. What is an abstract method?
**Answer:** A method declared with the `abstract` keyword that has no body — only a signature ending in a semicolon; its implementation must be provided by a subclass.

### Q3. Can we create an object of an abstract class?
**Answer:** No, because an abstract class is considered incomplete (it may have unimplemented abstract methods); attempting `new AbstractClass()` causes a compile-time error.

### Q4. Can an abstract class have a constructor? If yes, how is it invoked?
**Answer:** Yes — abstract classes can have constructors, used to initialize their attributes. They are invoked only through constructor chaining, i.e., a subclass constructor calling `super()`.

### Q5. Can we make an abstract class `final`?
**Answer:** No — since it is necessary to inherit an abstract class in order to override its abstract methods, marking it `final` (which prevents inheritance) would make it completely useless.

### Q6. Can an abstract method be `final`?
**Answer:** No — since abstract methods must be overridden in the child class, and `final` methods cannot be overridden, the two modifiers are contradictory.

### Q7. Can an abstract method be `static`?
**Answer:** No — static methods cannot be overridden (they use static binding), but abstract methods are designed specifically to be overridden, so this combination isn't allowed.

### Q8. (Tricky) Can an abstract method be `private`?
**Answer:** No — private methods aren't inherited, so a child class would have no way to override them, defeating the purpose of declaring them abstract.

### Q9. Can an abstract method have a return type?
**Answer:** Yes — an abstract method can be `void` or have any return type; only the method body is omitted, not the return type.

### Q10. (Conceptual) Can we overload an abstract method?
**Answer:** Yes — it is possible to overload an abstract method, and we can even overload it with a non-abstract (concrete) method, as long as signatures differ.

### Q11. (Scenario) If a concrete `Child` class extends an abstract `Parent` class with 3 abstract methods but only overrides 2, what happens?
**Answer:** Compile-time error — since not all abstract methods are overridden, `Child` must itself be declared `abstract` (in which case it too cannot be instantiated), or it must implement the remaining method.


---

# 17. The Diamond / Ambiguity Problem

## 📌 Concept Overview

> ### Quick Overview
> **What:** The Diamond Problem is the ambiguity that arises when a class tries to inherit from **two (or more) parent classes** that both provide the same method/constructor, creating confusion about which one to use.
> **Why:** Understanding this explains **why Java does not allow multiple inheritance through classes**.
> **Where:** This is purely a conceptual/theoretical topic explaining a language design decision.
> **Remember:** Java solves this problem entirely by allowing multiple inheritance **only through interfaces**, since interfaces cannot have constructors or conflicting concrete state.

---

## 📚 Explanation

If a class extends more than one class, it leads to the **diamond problem / ambiguity problem**. This problem occurs mainly for **2 reasons**:

1. **Constructor Chaining Ambiguity**
2. **Inheriting Object Class Methods (ambiguity in which parent's version to use)**

### Why the Ambiguity Occurs
If a class extends two classes, then when we create a child object, the child object's constructor would need to call **both** immediate parent class constructors. Since the child class has **two** immediate parents, there is ambiguity in constructor chaining regarding whether to call parent 1's constructor or parent 2's constructor.

Eventually, the child class also has to inherit `Object` class methods through its parents; since the child has 2 immediate parents, there is ambiguity/confusion about whether to inherit the `Object` class methods through parent 1 or through parent 2.

```java
class Object {
    // 11 methods
}

class Parent1 {
    Parent1() { System.out.println("P1"); }
}

class Parent2 {
    Parent2() { System.out.println("P2"); }
}

// NOT ALLOWED IN JAVA:
class Child extends Parent1, Parent2 {
    Child() {
        super(); // Ambiguous: Parent1's or Parent2's constructor?
    }
}
```

### How Interfaces Solve This
Interfaces solve the diamond/ambiguity problem because:
- We **cannot** have a constructor in an interface (removing the constructor-chaining ambiguity entirely).
- Interfaces do **not** inherit the `Object` class (removing the second source of ambiguity).

This is precisely why Java allows a class to `implement` **multiple** interfaces, but `extend` only **one** class.

---

## 💻 Code Examples

### The Problem (Illustrative — Not Valid Java)
```java
// This is NOT valid Java syntax — illustrating the theoretical problem only
class Child extends Parent1, Parent2 {
    // Ambiguity: which Parent's Object-inherited methods and constructor apply?
}
```

### The Solution — Multiple Interfaces are Fine
```java
interface Parent1 {
    // no constructor possible here
}
interface Parent2 {
    // no constructor possible here
}

class Child implements Parent1, Parent2 { // completely valid!
}
```

---

## 🧠 Important Points / Key Takeaways

- Diamond Problem occurs when a class tries to inherit from 2+ parent classes.
- Two root causes: constructor chaining ambiguity, and `Object`-class-inheritance ambiguity.
- Java disallows multiple class inheritance specifically to avoid this problem.
- Interfaces don't have this problem (no constructors, no `Object` inheritance) — hence multiple interfaces **can** be implemented.

---

## 🎯 Interview Questions for This Topic

### Q1. What is the Diamond Problem?
**Answer:** The ambiguity that arises when a class attempts to inherit from two or more parent classes that both provide conflicting members (methods/constructors), leaving the compiler unable to decide which parent's version to use.

### Q2. Why doesn't Java support multiple inheritance through classes?
**Answer:** To avoid the diamond/ambiguity problem — specifically, ambiguity in constructor chaining and ambiguity in inheriting the `Object` class's methods through multiple parents.

### Q3. (Tricky) Why can a class implement multiple interfaces but extend only one class?
**Answer:** Because interfaces cannot have constructors and don't inherit from `Object`, so implementing multiple interfaces creates no constructor-chaining or `Object`-inheritance ambiguity — the two root causes of the diamond problem simply don't apply to interfaces.

### Q4. (Conceptual) Does the diamond problem apply to interface implementation?
**Answer:** Not in the same way — although two interfaces might define the same abstract method signature, there's no constructor/state conflict; Java resolves method-signature conflicts through its interface rules (a class only needs to provide a single implementation).


---

# 18. Interfaces

## 📌 Concept Overview

> ### Quick Overview
> **What:** An interface is a blueprint for a class, acting as an **intermediary between two entities**. It can contain static variables, abstract methods, and (from Java 1.8 onward) concrete/default methods.
> **Why:** To achieve **complete abstraction**, to solve the diamond problem, and to allow a class to gain multiple "types"/contracts via multiple implementation.
> **Where:** Used for common contracts across unrelated class hierarchies (e.g., `Switch`, `Regulator` for electronic appliances; `Comparable`, `Runnable` in the JDK).
> **Remember:** A class can `extend` **one** class but can `implement` **multiple** interfaces.

---

## 📚 Explanation

### What Is an Interface?
An interface is a blueprint for a class. It is an intermediary between two entities.

```java
interface InterfaceName {
    // static variable
    // abstract method
    // concrete method (static/default, from v1.8)
}
```

- Any variable that is declared inside an interface is, **by default**, `public static final`.
- All abstract methods in an interface are, **by default**, `public abstract`.
- Any abstract method that you override from an interface has to be declared `public` in the child class (or it's a compile-time error).
- A class can `extend` one class **and** `implement` multiple interfaces at the same time.
- Interfaces will **not** inherit the `Object` class, and interfaces cannot have constructors — this is exactly what lets interfaces solve the diamond problem.

### Abstract Class vs Interface

| | Abstract Class | Interface |
|---|---|---|
| Methods | Can have abstract methods as well as concrete methods | Can have only abstract methods (concrete methods from v1.8 onward, as `default`/`static`) |
| Variables | Can have static and non-static variables | Can have only `public static final` variables |
| Constructor | Can have a constructor | Cannot have a constructor |
| Inherits `Object` class? | Yes | No |
| Diamond Problem | Can cause diamond problem | Will not cause diamond problem |
| Multi-level inheritance | Cannot achieve multiple inheritance | Can achieve multiple-level inheritance |
| Parent type | Can extend abstract class, concrete class, or interface | Can extend an interface **only** |

### Types of Interfaces
Interfaces are divided into **3 types**:
1. **Regular Interface** — has zero or more abstract methods. Can be predefined or user-defined.
2. **Functional Interface** — has **exactly one** abstract method. Can be predefined (e.g., `Runnable`, `Comparable`, `Comparator`) or user-defined.
3. **Marker Interface** — has **zero** abstract methods (an "empty" interface). Always predefined (e.g., `Serializable`, `Cloneable`, `RandomAccess`).

### Rules When Implementing Multiple Interfaces
- A class can extend one class and implement multiple interfaces.
- **Name-clash rule:** If two interfaces have methods with the **same name** but the method signature doesn't fully match (e.g., different return types or parameter types), it becomes **impossible** to implement both correctly in one class — this leads to a **compile-time error** (this is NOT overloading across interfaces; method name alone matching isn't enough).
- If a class has more than one parent interface, the parent interfaces **can't** have abstract methods with the **same name** but a **different return type or signature** — such a design itself is invalid.

---

## 💻 Code Examples

### Basic Interface + Implementation
```java
interface Switch {
    void switchOn();
    void switchOff();
}

interface Regulator {
    void incSpeed();
    void decSpeed();
}

public abstract class Fan implements Switch, Regulator {
    String brand;
    int pnu;

    public Fan(String brand, int pnu) {
        this.brand = brand;
        this.pnu = pnu;
    }

    @Override
    public void incSpeed() {
        System.out.println(this + " Speed increased");
    }
    @Override
    public void decSpeed() {
        System.out.println(this + " Speed decreased");
    }
}
```

### Real-World Example — UPI Interface
```java
abstract class Upi {
    abstract void send(int amount);
    abstract void checkBalance();
}

class Hdfc extends Upi {
    int balance = 0;

    void deposit(int amount) {
        balance += amount;
        System.out.println("Amount Credited");
    }

    @Override
    void send(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("HDFC " + amount + " debited");
        }
    }

    @Override
    void checkBalance() {
        System.out.println("HDFC Balance = " + balance);
    }
}
```

### Facebook / Instagram Interface Example
```java
interface Post {
    void createPost();
    void deletePost();
}

interface Notification {
    void getNotification();
}

interface Meta extends Post, Notification { }

public class Instagram implements Meta {
    public void createPost() { System.out.println("Post Created"); }
    public void deletePost() { System.out.println("Post Deleted"); }
    public void getNotification() { System.out.println("Notification Received"); }
}
```

### Regular vs Functional vs Marker Interface
```java
// Regular Interface (multiple abstract methods)
interface Switch {
    void switchOn();
    void switchOff();
}

// Functional Interface (exactly one abstract method)
interface Runnable {
    void run();
}

// Marker Interface (zero abstract methods)
interface Serializable {
    // empty
}
```

---

## 🧠 Important Points / Key Takeaways

- Interface variables are implicitly `public static final`; interface methods are implicitly `public abstract` (unless `default`/`static`, from Java 8).
- A class can `extend` only 1 class but can `implement` multiple interfaces.
- Interfaces solve the diamond problem: no constructors, no `Object` class inheritance.
- 3 types of interfaces: Regular (0+ abstract methods), Functional (exactly 1 abstract method), Marker (0 abstract methods, always predefined).
- Overriding an interface method in a class **must** be declared `public`.

---

## 🎯 Interview Questions for This Topic

### Q1. What is an interface in Java?
**Answer:** A blueprint for a class that can contain constants (public static final variables), abstract methods, and (from Java 8) default/static concrete methods — acting as a contract that implementing classes must fulfill.

### Q2. What is the default access modifier for interface variables and methods?
**Answer:** Interface variables are implicitly `public static final`; interface methods are implicitly `public abstract` (unless explicitly marked `default` or `static`).

### Q3. How does an interface solve the diamond problem?
**Answer:** Interfaces cannot have constructors and do not inherit the `Object` class, removing the two root causes of constructor-chaining and Object-inheritance ambiguity that arise with multiple class inheritance.

### Q4. What are the three types of interfaces in Java?
**Answer:** Regular Interface (zero or more abstract methods), Functional Interface (exactly one abstract method), and Marker Interface (zero abstract methods, an empty interface).

### Q5. Give an example of a Marker Interface.
**Answer:** `Serializable`, `Cloneable`, or `RandomAccess` — all are predefined, empty interfaces used just to "mark" a class with certain capabilities.

### Q6. (Tricky) Can a class implement two interfaces that both declare a method with the same name but different return types?
**Answer:** No — this creates an unresolvable conflict since a single method implementation cannot simultaneously satisfy two different return type contracts; such a design is invalid and won't compile.

### Q7. (Conceptual) What access modifier must be used when overriding an interface method in a class?
**Answer:** `public` — since interface methods are implicitly `public abstract`, Java requires the overriding method to have equal or greater visibility, meaning it must be declared `public`.

### Q8. Can an interface extend another interface? Can it extend multiple interfaces?
**Answer:** Yes to both — an interface can extend one or more other interfaces using the `extends` keyword (this is different from a class, which can `extend` only one class).

### Q9. (Scenario) You want `Instagram` and `Facebook` to both support posting and notifications, without duplicating code, and without hitting the diamond problem. How would you design this?
**Answer:** Define `Post` and `Notification` as separate interfaces, combine them into a `Meta` interface (via `extends`), and have `Instagram`/`Facebook` classes `implement Meta` — no diamond problem arises since interfaces have no constructors or shared state.

### Q10. What happens if a class implementing an interface does not implement all its abstract methods?
**Answer:** The class must be declared `abstract`, otherwise it results in a compile-time error, similar to the rule for abstract classes.


---

# 19. Hybrid Inheritance Using Interfaces

## 📌 Concept Overview

> ### Quick Overview
> **What:** Hybrid Inheritance is a combination of multiple inheritance types (e.g., Hierarchical + Multiple), achieved in Java **only through interfaces**.
> **Why:** Real-world entities often need to combine multiple independent capabilities (e.g., a Television both has a Switch and doesn't need a Regulator, while a Fan needs both Switch and Regulator).
> **Where:** Used whenever a class hierarchy needs multiple independent "capability" contracts alongside normal class-based hierarchical inheritance.
> **Remember:** This pattern layers **interfaces** (capabilities) on top of an **abstract class** (shared hierarchical structure) to get the best of both.

---

## 📚 Explanation

Hybrid Inheritance combines **Hierarchical Inheritance** (multiple concrete classes sharing a common abstract parent) with **Multiple Inheritance** (that abstract parent implementing multiple interfaces).

**Structure (Real-World Example — Home Appliances):**
```
Switch (interface)     Regulator (interface)
        \                    /
       Fan (abstract class, implements both)
        /                              \
 TableFan (concrete)          CeilingFan (concrete)

Switch (interface)
        \
    Television (abstract class, implements Switch)
        /                        \
   OledTV (concrete)        QledTV (concrete)
```

Here, `Television` only needs `Switch` (no `Regulator`, since you don't "regulate speed" on a TV), while `Fan` needs both `Switch` and `Regulator`. Both `Television` and `Fan` conceptually descend from `Object`, and each spawns multiple concrete subclasses — this combination of hierarchical + multiple (interface) inheritance is **Hybrid Inheritance**.

---

## 💻 Code Examples

```java
interface Switch {
    void switchOn();
    void switchOff();
}

interface Regulator {
    void incSpeed();
    void decSpeed();
}

public abstract class Fan implements Switch, Regulator {
    String brand;
    int pnu;

    public Fan(String brand, int pnu) {
        this.brand = brand;
        this.pnu = pnu;
    }

    @Override
    public void incSpeed() {
        System.out.println(this + " Speed increased");
    }
    @Override
    public void decSpeed() {
        System.out.println(this + " Speed decreased");
    }
    @Override
    public void switchOn() {
        System.out.println(this + " Switch On");
    }
    @Override
    public void switchOff() {
        System.out.println(this + " Switch Off");
    }
}

public class TableFan extends Fan {
    TableFan(String brand, int pnu) {
        super(brand, pnu);
    }
}

public class CeilingFan extends Fan {
    CeilingFan(String brand, int pnu) {
        super(brand, pnu);
    }
}

public abstract class Television implements Switch {
    String brand;
    int size, price;

    public Television(String b, int s, int p) {
        this.brand = b;
        this.size = s;
        this.price = p;
    }

    @Override
    public void switchOn() {
        System.out.println(this + " Switch On");
    }
    @Override
    public void switchOff() {
        System.out.println(this + " Switch Off");
    }
}

public class OledTv extends Television {
    OledTv(String brand, int size, int price) {
        super(brand, size, price);
    }
}

public class Main {
    public static void main(String[] args) {
        TableFan f1 = new TableFan("Bajaj", 2500);
        f1.switchOn();
        f1.switchOff();

        OledTv q1 = new OledTv("Sony", 55, 55000);
        q1.switchOn();
        q1.switchOff();
    }
}
```

---

## 🧠 Important Points / Key Takeaways

- Hybrid Inheritance = combining Hierarchical + Multiple inheritance, always achieved via interfaces in Java.
- An abstract class implementing multiple interfaces can pass those combined capabilities down to all its subclasses.
- Different subclasses of the same abstract parent can share a common capability (e.g., `Switch`) while other siblings require additional capabilities (e.g., `Fan` also needs `Regulator`).

---

## 🎯 Interview Questions for This Topic

### Q1. What is Hybrid Inheritance?
**Answer:** A combination of two or more types of inheritance (e.g., hierarchical and multiple), achieved in Java through an abstract class implementing multiple interfaces, with several concrete subclasses extending that abstract class.

### Q2. Why is hybrid inheritance implemented using interfaces rather than classes in Java?
**Answer:** Because Java doesn't support multiple inheritance through classes (to avoid the diamond problem), so any design needing multiple inherited capabilities must use interfaces for the "multiple" part.

### Q3. (Scenario) You need to design `Fan` and `Television` where `Fan` supports on/off and speed control, but `Television` supports only on/off. How would you design this cleanly?
**Answer:** Create two interfaces, `Switch` (on/off) and `Regulator` (speed control). Have an abstract `Fan` class implement both `Switch` and `Regulator`, and an abstract `Television` class implement only `Switch`. Concrete classes then extend the relevant abstract class.

### Q4. (Conceptual) Can subclasses like `TableFan` and `CeilingFan` have their own additional interfaces beyond what `Fan` already implements?
**Answer:** Yes — a subclass can implement additional interfaces of its own on top of whatever its parent class already implements, further customizing its capabilities.


---

# 20. Eclipse IDE – Practical Steps

## 📌 Concept Overview

> ### Quick Overview
> **What:** A set of practical, step-by-step workflows for setting up and using the Eclipse IDE for Java development.
> **Why:** Knowing IDE workflows (project creation, exporting/importing JARs) is essential for real-world Java development and is often assumed knowledge in interviews/practicals.
> **Where:** Used every time a new Java project/workspace is set up, or when packaging/reusing compiled code as a JAR.
> **Remember:** A `.java` file must be double-clicked/created **inside** a package (or the default package), and the `src` folder is the standard place for source code in Eclipse.

---

## 📚 Explanation

### Setting Up Eclipse (First Time)
1. Create a Workspace (a folder on disk).
2. Launch the Eclipse IDE.
3. Select the directory (folder) as the workspace; click **Launch**.
4. **Project Creation:**
   - Click on the "new" icon (`Ctrl+N`) at the top-left corner.
   - Double-click on **Java Project**.
   - Provide the project name.
   - Select the Java SE version (optional).
   - Click **Finish**.
5. Double-click on the Java project which is created; delete the `module-info.java` if present.
6. Click on the `src` folder.
   - Use the shortcut `Ctrl + N`.
   - Double-click on **Class**.
   - Provide the class name and click **Finish**.

### Package Creation
1. Right-click on the `src` folder.
2. Click on **New**.
3. Click on **Package**.
4. Provide the package name, then click **Finish**.

### Exporting a JAR
1. Right-click on the Java project.
2. Click on **Export**.
3. Search for **JAR** (`Java > JAR file`).
4. Double-click on the JAR file.
5. Browse the folder & choose a destination.
6. Click on **Finish**.

### Importing a JAR
1. Right-click on the project.
2. Click on **Properties**.
3. Click on **Java Build Path**.
4. Click on **Libraries**.
5. Click on **Add external JARs**.
6. Click on **Apply & Close**.

### Useful Eclipse Shortcuts
| Shortcut | Action |
|---|---|
| `Ctrl` `Shift` `+` or `Ctrl` `+` | Zoom in |
| `Ctrl` `Shift` `-` or `Ctrl` `-` | Zoom out |
| `Ctrl` `D` | Delete current line |
| `Ctrl` `M` | Minimize and maximize |
| `Ctrl` `I` | Indentation (auto-format) |

---

## 💻 Code Examples

```java
// After package + class creation, a typical generated skeleton looks like:
package packageName;

public class Employee {
    protected String name;
    protected int salary;

    protected void display() {
        System.out.println(name + " " + salary);
    }

    public static void main(String[] args) {
        System.out.println("this is base-class");
        Employee e1 = new Employee();
        e1.name = "Raj";
        e1.salary = 35000;
        e1.display();
    }
}
```

---

## 🧠 Important Points / Key Takeaways

- Workspace = a folder chosen at Eclipse launch to store all projects.
- Project → Package → Class is the typical Eclipse creation hierarchy.
- `module-info.java` can usually be deleted for simple non-modular projects.
- JARs can be exported (to package/share compiled code) and imported (to reuse external libraries) via project Properties → Java Build Path.

---

## 🎯 Interview Questions for This Topic

### Q1. What is a workspace in Eclipse?
**Answer:** A folder on disk chosen when Eclipse launches, which stores all the projects and their settings created within that Eclipse session.

### Q2. What is the purpose of exporting a project as a JAR file?
**Answer:** To package compiled Java classes (and resources) into a single distributable file that can be reused as a library in other projects or run independently.

### Q3. How do you add an external JAR file to your Eclipse project's build path?
**Answer:** Right-click the project → Properties → Java Build Path → Libraries → Add External JARs → select the file → Apply and Close.

### Q4. (Scenario) You created a new Java Project in Eclipse and see a `module-info.java` file you don't need. What should you do?
**Answer:** Delete the `module-info.java` file if the project doesn't require Java's module system (JPMS) — this is common for simple, non-modular projects.


---

# 🔥 Final Java Interview Revision

Based on all the concepts covered above — for Java Fresher, Associate Software Engineer, Software Engineer Intern, and Entry-Level Backend Developer interviews. These questions connect concepts across topics rather than repeating the topic-wise questions above.

## 1. What is the difference between a constructor and a method in Java?
**Answer:** A constructor initializes an object, shares the exact name of its class, has no return type, and runs only once per object at creation time. A method performs an operation, can have any name and any return type (including `void`), and can be invoked multiple times.
**Key Point:** Interviewers check whether you know constructors return the object implicitly and cannot have `void`/return types explicitly.

## 2. Why is Java's `main` method static?
**Answer:** Because the JVM needs to call `main()` without creating an object of the class first; static methods belong to the class and can be invoked directly via the class name, before any object exists.
**Key Point:** Ties static binding/loading concepts to a very common "why" question.

## 3. What is the difference between method overloading and method overriding?
**Answer:** Overloading = same method name, different parameter signatures, within the same class (compile-time polymorphism). Overriding = same method name and signature, redefined in a child class (runtime polymorphism).
**Key Point:** Overloading is resolved at compile time; overriding is resolved at runtime based on the actual object.

## 4. Can constructors be overloaded? Can they be overridden?
**Answer:** Constructors can be overloaded (multiple constructors with different signatures), but they **cannot** be overridden, since constructors are not inherited by subclasses.
**Key Point:** A very common trick question — many candidates incorrectly say constructors can be overridden.

## 5. What is the output of this code?
```java
class A {
    void show() { System.out.println("A"); }
}
class B extends A {
    @Override
    void show() { System.out.println("B"); }
}
public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
```
**Answer:** `B` — because `show()` is overridden, and runtime polymorphism resolves the call based on the actual object (`B`), not the reference type (`A`).
**Key Point:** Classic output-based question testing runtime polymorphism understanding.

## 6. Why doesn't Java support multiple inheritance through classes?
**Answer:** To avoid the diamond/ambiguity problem — specifically, ambiguity in constructor chaining and in inheriting `Object` class methods when a class would have two or more immediate parent classes.
**Key Point:** Java solves this by permitting multiple inheritance only through interfaces.

## 7. How does an interface solve the diamond problem that classes can't?
**Answer:** Interfaces cannot have constructors and don't inherit from `Object`, removing both root causes of ambiguity that occur with multiple class inheritance.
**Key Point:** Shows you understand *why*, not just *that*, interfaces allow multiple inheritance.

## 8. What is the difference between an abstract class and an interface?
**Answer:** An abstract class can have both abstract and concrete methods, static/non-static variables, and a constructor, but supports only single inheritance. An interface (pre-Java 8) has only abstract methods and `public static final` variables, no constructor, but supports multiple inheritance.
**Key Point:** One of the most frequently asked OOP interview questions — always mention the constructor and multiple-inheritance distinctions.

## 9. Can we create an object of an abstract class or an interface?
**Answer:** No, for either — both are considered incomplete types. However, we can create an **anonymous inner class** or use a concrete subclass/implementing class to get an object indirectly.
**Key Point:** Mentioning "anonymous class" or "concrete subclass" shows deeper knowledge.

## 10. What happens if a subclass doesn't implement all abstract methods of its abstract parent/interface?
**Answer:** The subclass itself must be declared `abstract`; otherwise, it results in a compile-time error.
**Key Point:** Tests understanding of the "all abstract methods must be overridden" rule.

## 11. What is the difference between `this` and `super`?
**Answer:** `this` refers to the current object and is used to access the current class's members or chain to another constructor of the *same* class. `super` refers to the immediate parent class and is used to access parent members or chain to the *parent's* constructor.
**Key Point:** Both must be the first statement when used for constructor chaining, and can't be used together.

## 12. What is variable shadowing, and how do you resolve it?
**Answer:** When a local variable (e.g., a constructor parameter) has the same name as an instance attribute, the inner (local) variable "shadows" the outer (attribute) within that scope. It's resolved using `this.attributeName` to explicitly refer to the instance attribute.
**Key Point:** Directly connects to a very common beginner mistake in constructors.

## 13. What is the difference between static binding and dynamic binding?
**Answer:** Static binding (early binding) resolves a method call at compile time based on the reference type or parameters (used for overloaded/static methods). Dynamic binding (late binding) resolves a method call at runtime based on the actual object (used for overridden methods).
**Key Point:** Also called compile-time vs runtime polymorphism.

## 14. Why can't static methods be overridden?
**Answer:** Static methods are bound to the class (resolved via static/early binding based on reference type), not to any particular object instance, so the concept of "overriding" (which depends on the actual object at runtime) doesn't apply — this is called method hiding/shadowing instead.
**Key Point:** Distinguish "method hiding" from "method overriding" clearly.

## 15. What is the order of execution when an object is created for the first time (with static blocks, non-static blocks, and constructors present)?
**Answer:** Static Block → Main method → Non-Static Block → Constructor.
**Key Point:** A very common output-based/tricky question in interviews.

## 16. What is the order of execution in a parent-child inheritance scenario?
**Answer:** Parent Static → Child Static → Parent Non-Static → Parent Constructor → Child Non-Static → Child Constructor → Child Main.
**Key Point:** Extension of Q15, tests deeper understanding of class loading with inheritance.

## 17. What is encapsulation, and how is it different from abstraction?
**Answer:** Encapsulation binds data and methods together and controls access using access modifiers (private fields + public getters/setters) — it's about *how* data is protected. Abstraction hides implementation details and exposes only functionality — it's about *what* is shown to the user.
**Key Point:** A classic "difference between" question; emphasize encapsulation = data hiding mechanism, abstraction = design-level hiding of complexity.

## 18. What access modifiers are required for a class to follow the Java Bean specification?
**Answer:** The class must be public and non-abstract; all attributes must be `private`; each attribute needs a public getter and setter; there must be a public no-arg constructor; and no other methods besides getters/setters are allowed.
**Key Point:** Tests whether the candidate knows the formal Java Bean rules, not just "use getters/setters."

## 19. What is the difference between `protected` and `default` (package-private) access?
**Answer:** Both allow access within the same class and same package. `protected` additionally allows access from a different package, but **only through inheritance**; `default` does not allow any access from a different package at all.
**Key Point:** A frequently confused pair — always mention the "through inheritance" clause for `protected`.

## 20. Why are wrapper classes needed in Java?
**Answer:** To represent primitive values as objects — needed for use in collections (which only store objects), for utility methods, and to allow primitives to participate in features requiring objects (like generics).
**Key Point:** Connects wrapper classes to their most common real-world use case: Collections Framework.

## 21. What is autoboxing and unboxing? Give an example where it happens implicitly.
**Answer:** Autoboxing is automatic conversion from primitive to wrapper type (e.g., `Integer i = 5;`); unboxing is the reverse (e.g., `int x = someIntegerObject;`). It happens implicitly whenever a primitive is used where an object is expected, or vice versa.
**Key Point:** Tests practical understanding, not just definitions.

## 22. What is the difference between `Integer.parseInt()` and `Integer.valueOf()`?
**Answer:** `parseInt(String)` returns a primitive `int`; `valueOf(String)` returns an `Integer` object (using autoboxing/caching internally). Both can throw `NumberFormatException` for invalid input.
**Key Point:** A commonly asked "what's the difference" question about String-to-number conversions.

## 23. Which `parseXxx()` method never throws a `NumberFormatException`, and why?
**Answer:** `Boolean.parseBoolean(String)` — it simply returns `true` if the input equals `"true"` (case-insensitive), and `false` for any other input, without validating against a stricter format.
**Key Point:** A specific, often-missed detail that trips up candidates who assume all `parseXxx()` methods behave identically.

## 24. What is the difference between Aggregation and Composition?
**Answer:** Aggregation is a "weak" HAS-A relationship where the contained object can exist independently of the container (e.g., Department-Employee). Composition is a "strong" HAS-A relationship where the contained object's life cycle is tightly bound to the container (e.g., House-Room).
**Key Point:** Give a concrete real-world example for each — interviewers look for that clarity.

## 25. What is the difference between IS-A and HAS-A relationships?
**Answer:** IS-A is inheritance-based (`Dog IS-A Animal`, via `extends`); HAS-A is composition/association-based (`Car HAS-A Engine`, via an object reference as a field).
**Key Point:** Fundamental distinction tested in almost every Java OOP interview.

## 26. What is the Factory Method design pattern, and why use it?
**Answer:** A creational pattern that centralizes object-creation logic in a single method, which decides at runtime which concrete subclass to instantiate based on input — improving maintainability and decoupling client code from concrete classes.
**Key Point:** Show awareness that it ties into polymorphism (parent-type references pointing to specific child objects).

## 27. What is upcasting and downcasting? What exception can downcasting cause?
**Answer:** Upcasting: assigning a child object to a parent reference (implicit, always safe). Downcasting: casting a parent reference back to a specific child type (explicit); if the object isn't actually of that type, it throws `ClassCastException`.
**Key Point:** Always mention `instanceof` as the safe-guard before downcasting.

## 28. What predefined methods does every Java class inherit from the `Object` class?
**Answer:** `toString()`, `equals(Object)`, `hashCode()`, `getClass()`, `clone()`, `wait()`, `notify()`, `notifyAll()`, `finalize()` — 11 total predefined methods.
**Key Point:** Tests foundational knowledge that everything in Java implicitly extends `Object`.

## 29. What are the three types of interfaces in Java, and what distinguishes them?
**Answer:** Regular interface (zero or more abstract methods), Functional interface (exactly one abstract method — usable with lambda expressions), and Marker interface (zero abstract methods — used just to "tag" a class, e.g., `Serializable`).
**Key Point:** Functional interfaces are especially important since Java 8's lambda expressions rely on them.

## 30. Why can a class implement multiple interfaces but extend only one class?
**Answer:** Because interfaces have no constructors and don't inherit `Object`, so implementing several doesn't cause the diamond/ambiguity problem that multiple class inheritance would.
**Key Point:** Reinforces the connection between interfaces, the diamond problem, and Java's single-class-inheritance design.

## 31. What happens if two interfaces implemented by the same class both declare a method with the exact same name and signature?
**Answer:** No conflict — the implementing class just provides one implementation that satisfies both interface contracts simultaneously, since the method signature is identical.
**Key Point:** Contrast this with the case of *different* signatures for the same method name, which IS a compile error.

## 32. Explain the difference between compile-time and runtime polymorphism with an example each.
**Answer:** Compile-time (method overloading): `void add(int a, int b)` vs `void add(double a, double b)` — resolved by the compiler based on argument types. Runtime (method overriding): `Animal a = new Dog(); a.sound();` — resolved by the JVM based on the actual object (`Dog`) at runtime.
**Key Point:** Always pair the definition with a concrete code example.

## 33. What is the significance of the `@Override` annotation? Is it mandatory?
**Answer:** It signals intent to override a parent method and lets the compiler verify the signature actually matches a parent/interface method, catching typos early. It is **not mandatory** but is a strongly recommended best practice.
**Key Point:** Testing whether the candidate knows it's optional but valuable for compile-time safety.

## 34. Can a final class have a parent class? Can it have a child class?
**Answer:** A final class CAN have a parent class (it can extend another class normally), but it CANNOT have a child class (nothing can extend a final class).
**Key Point:** A subtle but frequently tested distinction about the direction `final` restricts inheritance.

## 35. What is Class Loading, and when does it happen?
**Answer:** Class Loading is the process of loading a compiled Java class from secondary memory (disk) into primary memory (RAM) for execution. It happens exactly once per class, either explicitly, by accessing a variable/method of the class, or by containing the `main` method that gets invoked.
**Key Point:** Ties directly to why static blocks execute only once.

## 36. Why does accessing a static member via a null object reference not throw a NullPointerException?
**Answer:** Because static members belong to the class itself, not to any specific object; the JVM resolves them through the class metadata rather than dereferencing the (null) object reference.
**Key Point:** A classic "gotcha" question that separates strong static/non-static understanding from surface-level knowledge.

## 37. What is the difference between a Concrete class and an Abstract class?
**Answer:** A Concrete class can be instantiated, can be `final`/`private`, and contains only fully implemented (concrete) methods. An Abstract class cannot be instantiated, cannot be `final`, may contain abstract methods requiring subclass implementation, but can still have concrete methods, constructors, and both static/non-static variables.
**Key Point:** Summarizes several rules into one comparative answer — a favorite in written/interview tests.

## 38. In constructor chaining, why must `this()` or `super()` be the first statement?
**Answer:** Because Java needs to guarantee that any inherited/chained initialization completes before the current constructor's own logic executes, ensuring the object is built consistently from the top of the hierarchy downward.
**Key Point:** Explains the "why," not just the rule, which interviewers value.

## 39. (Scenario) You need a `Vehicle` hierarchy where `Car`, `Bike`, and `Truck` share common attributes, but you also want `Car` and `Bike` (not `Truck`) to support a `MusicSystem` feature. How would you design this using inheritance and interfaces?
**Answer:** Create a `Vehicle` class with common attributes/methods. Create a `MusicSystem` interface with relevant methods. Have `Car` and `Bike` extend `Vehicle` AND implement `MusicSystem`; have `Truck` only extend `Vehicle`. This combines hierarchical inheritance (all extend Vehicle) with selective interface implementation (only Car/Bike get MusicSystem) — a hybrid design.
**Key Point:** Tests the ability to apply hybrid inheritance concepts to a fresh scenario, not just recall a memorized example.

## 40. (Scenario) A `Bank` abstract class defines `getInterestRate()`. Two banks, `HDFC` and `ICICI`, need different rates, but the rate-calculation *logic* (a formula using the rate) should be shared. How would you design this?
**Answer:** Keep `getInterestRate()` as an abstract method in `Bank` (each bank overrides it with its own rate). Add a **concrete** method in `Bank`, e.g., `calculateInterest(double principal)`, that internally calls `getInterestRate()` — since it's concrete, it's shared by all subclasses, while the varying rate is still customized per bank via the abstract method.
**Key Point:** Demonstrates the powerful pattern of mixing abstract (varying) and concrete (shared) methods within the same abstract class — a very practical, real-world OOP design question.


---

## 📄 Author & Copyright

These notes were compiled and authored by **Sourabh Singh Mandloi**.

- **GitHub:** [github.com/sourabhsingh88](https://github.com/sourabhsingh88)
- **LinkedIn:** [linkedin.com/in/sourabh-singh-mandloi](https://linkedin.com/in/sourabh-singh-mandloi/)

© Sourabh Singh Mandloi. All rights reserved. This document is shared for personal revision and educational purposes. Please credit the author if you reference, reuse, or redistribute this content.
