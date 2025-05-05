package Exercise_on_Inheritance;

public class Developer extends Employee {
    private String programmingLanguage;
    public Developer(String name, double baseSalary, String programmingLanguage){
        super(name, baseSalary);
        this.programmingLanguage = programmingLanguage;
        
        
    }

    @Override
    public double annualBonus(){
        return super.annualBonus()+ (baseSalary*0.03);
    }

    public void getProgrammingLang(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void employeeInfo(){
        System.out.println(String.format("Name: %s" + " , "+ "Salary: %.1f, " + "Programming Language: %s ", name, baseSalary, programmingLanguage));
    }
    
    
}
