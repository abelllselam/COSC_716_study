Exercise: Polymorphic Shapes

1. Define an abstract base
   Class name: Shape

Field(s): none (or an optional String name)

Methods:

An abstract method double area()

A concrete method void describe() that prints something like “I am a generic shape” (you can override later)

2. Create concrete subclasses
   Circle

Field: double radius

Constructor to set radius

Implement area() using π × radius²

Override describe() to print “I am a circle of radius X”

Rectangle

Fields: double width, double height

Constructor to set both

Implement area() as width × height

Override describe() to print “I am a rectangle W×H”

Triangle

Fields: double base, double height

Constructor to set both

Implement area() as (base × height)/2

Override describe() to print “I am a triangle with base B and height H”

3. Polymorphism demo
   In a main (or tester) class, create a collection (array or list) of Shape references holding one Circle, one Rectangle, and one Triangle.

Loop through that collection, and for each Shape s:

Call s.describe()

Call double a = s.area() and print “Area: A”

4. Reflection & extensions
   Why it works: you write one loop against Shape, yet get each subclass’s specialized behavior.

Access control: decide which methods/fields are private, protected, or public.

Bonus:

Add a new subclass (e.g. Square or Ellipse) and drop it into the same loop—no extra code needed.

Add another method in Shape (e.g. perimeter()) and implement in each subtype to see how easy it is to extend.
