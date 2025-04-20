📝 Assignment: Shape Polymorphism
Goal:
Write a simple Java program that clearly demonstrates polymorphism by creating different types of shapes and calculating their areas.

Step-by-step instructions:

Step 1:
Create an interface named Shape.

Define one method in it:

java
Copy
Edit
double area();
Step 2:
Create three concrete classes that implement the Shape interface:

Circle

Rectangle

Triangle

Each of these shapes should have their own specific fields (like radius for Circle, width and height for Rectangle, etc.) and provide the correct logic to calculate their area.

Step 3:
Create a class named ShapeCalculator:

Write a method called printArea that takes a Shape as an argument and prints the shape’s area.

Step 4:
Create a Main class with a main method (public static void main):

Instantiate each shape (Circle, Rectangle, Triangle).

Call ShapeCalculator's printArea method for each shape.
