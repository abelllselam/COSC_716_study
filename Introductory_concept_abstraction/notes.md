**Abstract**

- You cant create an object from an abstract classes. Which means you cant instantiate an abstract class.
- to make a class into abstract class the only thing you need is the work abstract.

```java
    public abstract class Cat {

    }
```

- you can also choose to have abstract methods.In this case the abstract method does not need a body. For instance the if you have a method called makeNoise in an Animal class. You dont want it to make any noise in the Animal class because it could be referring to any animal. However, you want to allow all other classes that inherit the Animal class to be able to make their own noises so you declare it like:

```java
    public abstract void makeNoise();
```

- What an abstract class and method does is that it forces any animal that inherits from the animal class to implement the method makeNoise as a requirement.

# The difference between Interface and abstract:

- Every method in an interface is assumed to be an abstract method.
- classes can only extend one other class but can implement many. Therefore it is limiting when it comes to abstract classes being extended.

- The other is if variables are declared in an interface they are final and static. Which means they have to be implemented every where there is an implementation of the class. The values are also final which means they can not be changed. But, in abstraction you can have the variables without them being final. You dont have to assign a value to your declared types because they are not final.
- for simple and good explanation check the following classes: https://www.youtube.com/watch?v=HvPlEJ3LHgE

- Force implementation: Any non‑abstract subclass must override makeNoise(), otherwise it too remains abstract.

# Table of difference between Abstract class and Interface

Feature | Abstract Class | Interface
Instantiation | Cannot instantiate | Cannot instantiate
Methods | Can have abstract & concrete | Only abstract by default; plus Java 8+ default & static
Fields | Normal instance or static fields | Always public static final
Inheritance | Single extends | Multiple implements
Use case | Share code + enforce a few methods | Define a pure contract
