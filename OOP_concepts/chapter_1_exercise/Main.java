package OOP_concepts.chapter_1_exercise;

public class Main {
    public static void main(String []args){
        Employee stuff1 = new Employee("Bob", 24, 100, "home");
        Employee stuff2 = new Employee("John", 60, 200, "mars");


        stuff1.raiseSalary();
        stuff1.display();
        stuff2.display();
        
    }
}
