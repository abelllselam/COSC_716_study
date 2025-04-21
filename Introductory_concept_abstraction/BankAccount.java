package Introductory_concept_abstraction;

public abstract class BankAccount {
    protected double balance;

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void printBalance(){
        System.out.println("Current balance: " + balance);
    }
    
}
