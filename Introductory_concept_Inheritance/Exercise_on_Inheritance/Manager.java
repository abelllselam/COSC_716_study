package Exercise_on_Inheritance;

public class Manager extends Employee {
    private int teamSize;
    public Manager(String name, double baseSalary, int teamSize){
        super(name, baseSalary);
        this.teamSize = teamSize;

    }

    @Override
    public double annualBonus(){
        double sum = 0;

        if (teamSize > 0){
            sum = baseSalary * 0.06;
        }

        return sum;
    }
}
