package Exercise_on_Inheritance;

public class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    protected double annualBonus(){
        double yearlyBonus = 0.05;
        double sum;

        sum = baseSalary *yearlyBonus;

        return sum;

    }

    public void employeeInfo(){
        System.out.println(String.format("Name: %s" + " , "+ "Salary: %.1f", name, baseSalary));
    }
    
}
