package Introductory_concept_abstraction;

public class SavingAccount extends BankAccount {
    
    @Override
    public void deposit(double amount){
        balance+=amount;

    }

    @Override
    public void withdraw(double amount){
        if (balance - amount >= 0){
            balance-=amount;
        }
        else {
            System.out.println("Insufficient funds");
        }
    }
    
}
