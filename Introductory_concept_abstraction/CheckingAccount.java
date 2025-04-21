package Introductory_concept_abstraction;

public class CheckingAccount extends BankAccount {
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) {
        if(balance - amount >= -500){
            balance -=amount;
        }
        else {
            System.out.println("Overdraft limit reached.");
        }
    }
    
}
