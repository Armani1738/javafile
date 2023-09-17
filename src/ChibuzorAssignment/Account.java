package ChibuzorAssignment;

public class Account {
    private int balance;
    private String accountName;
    private String accountNumber;
    private String pin;

    public Account(int balance, String accountName, String accountNumber, String pin) {
        this.balance = balance;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    public Account() {

    }

    public int deposit(int amount) {
        if (amount <= 0){
            return balance;
        }
        balance = this.balance + amount;
        return balance;
    }

    public int checkbalance()
    {
        return balance;
    }

    public void withdrawal(int amount) {
       if (amount > balance){
           System.out.println("Thank you for banking with us!");
       }
       if (amount > balance) {
           this.balance = balance - amount;
       }
    }
}
