package Introductory_concept_abstraction;

public class Main {
    public static void main(String[]args){
        BankAccount sa = new SavingAccount();
        BankAccount ca = new CheckingAccount();

        sa.deposit(200);
        sa.withdraw(50);
        sa.printBalance();      // expect 150

        ca.deposit(100);
        ca.withdraw(550);
        ca.printBalance();      // expect -450
        ca.withdraw(100); 
    }
    
}
