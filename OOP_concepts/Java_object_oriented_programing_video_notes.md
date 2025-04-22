https://www.linkedin.com/learning/java-object-oriented-programming-2/why-learn-about-object-oriented-programming-in-java?leis=LTI13&resume=false&u=56674649

**Java Object Oriented Programming (OOP):**

- The four pillars of OOP are: - Inheritance - Polymorphism - Abstraction - Encapsulation
- Classes in Java give us the blue print to model other objects: Classes or blueprints contain a set of attributes and behaviors that define an item.

- Let us take the class Tree as an Example:
  Tree Class
  Attributes Behavior

  - Height - Growing
  - Trunk diameter -
  - Tree type

- A class is self standing. It does not need attributes of behaviors.

-ENUM - what it is and how it works in java as it was mentioned in the video:

- An enum is a special type that represents a group of constants.

```java
// Define an enum named Color with three constants
public enum Color {
    RED,
    GREEN,
    BLUE
}

//This is how you instantiate
public class Main {
    public static void main(String[] args) {
        // You don’t use new; you refer to one of the defined constants:
        Color favorite = Color.GREEN;
        System.out.println("My favorite color is " + favorite);
    }
}

```

- You declare an enum much like a class, listing its fixed values.
- You use (or “instantiate”) it by assigning one of those constants via EnumType.CONSTANT.
- Classes only represent a general blueprint but they become more tangible when you use a constructor to bring it to life.

# Constructor

- The purpose of a constructor is to bundle initialization in one place and enforce required data because it requires you to input the data that is required in order to run the program.
  Instead of this:

  ```java
  Person p = new Person();      // uses default no‑arg constructor
  p.setName("Alice");
  p.setAge(30);

  //You would have this:
  public Person(String name, int age) {
  this.name = name;
  this.age  = age;
  }
  //and this when it is being called
  Person p = new Person("Alice", 30);  // guaranteed to have both fields set
  ```

- It also helps to validate input.

```java
public Person(String name, int age) {
    if (age < 0) throw new IllegalArgumentException("Age must be ≥ 0");
    this.name = name;
    this.age  = age;
}
```

# Static and Non-Static members

- In java static members belong to the class itself while the non-static (instance) members belong to each object you create.

1. Static member

   - Declared with the static keyword.
   - Only one copy exists, shared by all instances of the class.
   - Lives in the class’s area of memory (method area).
   - You can access it without creating any objects: ClassName.member.

2. Non‑static (instance) member

   - No static keyword.
   - Each object you new gets its own copy.
   - Lives in the heap as part of each instance.
   - You must have an object reference to access it: instance.member.

   E.g of static and non-static member:

```java
public class Counter {
    // Static field: one counter shared by everyone
    public static int globalCount = 0;

    // Non-static field: each Counter has its own count
    public int instanceCount = 0;

    // Static method: can only touch static fields
    public static void incrementGlobal() {
        globalCount++;
        // instanceCount++; // ❌ not allowed here
    }

    // Non-static method: can touch both static & instance fields
    public void incrementBoth() {
        globalCount++;
        instanceCount++;
    }
}
//Using them
public class Main {
    public static void main(String[] args) {
        // Accessing static without any objects
        System.out.println("Global: " + Counter.globalCount);   // 0
        Counter.incrementGlobal();
        System.out.println("Global: " + Counter.globalCount);   // 1

        // Creating two objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        // Each has its own instanceCount
        c1.incrementBoth();   // global=2, c1.instance=1
        c2.incrementBoth();   // global=3, c2.instance=1

        System.out.println("c1.instance: " + c1.instanceCount); // 1
        System.out.println("c2.instance: " + c2.instanceCount); // 1
        System.out.println("Global: " + Counter.globalCount);   // 3
    }
}
```

# Quick recap in a table

Aspect | Static | Non‑Static (Instance)
Keyword | static | (none)
Memory | One copy per class | One copy per object
Access without object | Yes: ClassName.member | No: must use an object ref
Typical use | Shared utilities or constants | Object‑specific data/behavior
