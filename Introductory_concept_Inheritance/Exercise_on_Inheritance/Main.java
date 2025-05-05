package Exercise_on_Inheritance;

public class Main {
    public static void main(String[]args){
        Employee[] e = {
            new Manager("Alice",80000,5),
            new Developer("Bob", 70000, "Java"),
            new Manager("Carol", 95000, 10),
            new Developer("Dave", 65000, "Python")
        };

        for (Employee stuff : e){
            stuff.employeeInfo();

            double bonus = stuff.annualBonus();
            System.out.printf("Annual Bonus: %.2f%n%n", bonus);
        }
    }
}
