package ku.atm;

public class BankAccount {
   private double balance;

   public BankAccount() {
      balance = 0;
   }

   public BankAccount(double balance) {
      this.balance = balance;
   }
 
   public void deposit(double amount) throws InsufficientBalanceException {
      if (amount <= 0)
         throw new InsufficientBalanceException("deposit amount must be positive");
      balance = balance + amount;
   }

   public void withdraw(double amount) throws NotEnoughBalanceException {
       if (amount > balance)
         throw new NotEnoughBalanceException("cannot withdraw more than balance");
       balance = balance - amount;
   }

   public double getBalance() {
      return balance; 
   }

}

