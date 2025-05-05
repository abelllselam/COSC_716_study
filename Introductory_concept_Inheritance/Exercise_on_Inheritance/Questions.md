Inheritance Exercise: “Employee → Manager & Developer”

1. Define the base class
   Name: Employee

Fields:

name (String)

baseSalary (double)

Behaviors:

A method to compute an annual bonus (default could be a fixed percentage of baseSalary)

A method to describe the employee (e.g. print name and salary)

2. Create subclasses
   Manager

Additional field: teamSize (int)

Override the bonus calculation to include extra for each team member

Developer

Additional field: programmingLanguage (String)

Override the bonus calculation to reflect skill level (e.g. a higher flat rate)

3. Demonstrate polymorphism
   In a separate tester, hold a collection (e.g. a list) of mixed Employee references.

Loop through and:

Invoke the bonus‑calculation method on each—observe that each subclass’s logic runs.

Invoke the describe method—observe shared vs. specialized output.

4. Validation & protection
   Decide which fields should be private vs. protected vs. public, and justify your choice.

Use constructors in each class to initialize both inherited and new fields.

5. Extension (optional)
   Add a third subclass—perhaps Intern—with its own override (e.g. zero bonus).

Add a static counter in Employee to track how many total employees have been created.

How to tackle it, step by step

Sketch your class diagram on paper: list each class, its fields, and which methods it inherits vs. overrides.

Write the base Employee class first, focusing on its fields, constructor, and default bonus method.

Add one subclass at a time, implementing its extra fields and overriding the bonus logic.

Build a simple tester that creates instances of each type and calls the shared/overridden methods.

Reflect: which access modifiers did you choose, and why?
