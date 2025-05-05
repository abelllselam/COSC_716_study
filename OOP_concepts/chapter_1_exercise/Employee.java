package OOP_concepts.chapter_1_exercise;

public class Employee {
    private String name;
    private int age;
    private double salary;
    public static String location;

    Employee(String name, int age, double salary, String location){
        this.name = name;
        this.age = age;
        this.salary = salary;
        Employee.location = location;
    }

    void raiseSalary(){
        System.out.println("The following employee got a rais: " + name + " and current salary is: " + ((salary *.1) + salary) + " Previous salary was: " + salary);
    }

    public void display(){
        System.out.println("Name: " + name + " Salary:" + salary);
    }
    
}
