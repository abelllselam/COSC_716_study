Exercise: Bank Account Abstraction

1. Define the abstraction
   Create an abstract class called BankAccount that:

Has a protected double balance field.

Declares two abstract methods:

java
Copy
Edit
public abstract void deposit(double amount);
public abstract void withdraw(double amount);
Provides a concrete method:

java
Copy
Edit
public void printBalance() {
System.out.println("Current balance: " + balance);
} 2. Implement concrete subclasses
Make two subclasses that extend BankAccount:

SavingsAccount

On deposit, add the amount to balance.

On withdraw, subtract the amount only if balance - amount >= 0; otherwise print an “Insufficient funds” message.

CheckingAccount

On deposit, add the amount to balance.

On withdraw, subtract the amount and allow the balance to go negative down to an overdraft limit (e.g., -500). If the withdrawal would take it below -500, print “Overdraft limit reached.”

3.  Use the abstraction
    In your main method
    public class Main {
    public static void main(String[] args) {
    BankAccount sa = new SavingsAccount();
    BankAccount ca = new CheckingAccount();

            sa.deposit(200);
            sa.withdraw(50);
            sa.printBalance();      // expect 150

            ca.deposit(100);
            ca.withdraw(550);
            ca.printBalance();      // expect -450
            ca.withdraw(100);       // expect “Overdraft limit reached.”
        }

    }

What this practices:
Defining “what” (deposit/withdraw) without “how” in BankAccount.

Hiding the implementation details of withdrawal rules in each subclass.

Programming to the abstract type (BankAccount sa = new SavingsAccount();).
