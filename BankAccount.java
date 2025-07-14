public class BankAccount {

    private String ownerName;
    
    private double balance;

    public static double interestRate;

    public BankAccount(String ownerName, double balance)
    {
        this.ownerName = ownerName; 
        this.balance = balance;
        interestRate = 0;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        if(balance < amount)
        {
            System.out.println("Insufficient funds for " + ownerName);
        }
        else{
        balance -= amount;
        }
    }

    public void applyInterest()
    {
        balance += balance * (interestRate / 100);
    }

    public static void setInterestRate(double newRate)
    {
        interestRate = newRate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount [ownerName=" + ownerName + ", balance=" + balance + "]";
    }

    public static void main(String[]args)
    {
        BankAccount.setInterestRate(5);

        BankAccount bankAccount1 = new BankAccount("Ryan", 1);
        BankAccount bankAccount2 = new BankAccount("Justin", 2);

        bankAccount1.deposit(3);
        bankAccount2.deposit(3);
        bankAccount1.withdraw(3);
        bankAccount2.withdraw(43);

        bankAccount1.applyInterest();
        bankAccount2.applyInterest();

        System.out.println(bankAccount1.toString());
        System.out.println(bankAccount2.toString());
    }   

    
}
