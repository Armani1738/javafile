package ChibuzorAssignment;

public class Bank {
    private int balance;

    public void deposit(int amount) {
        if(amount <= 0) {
            System.out.print("no amount deposited");
        } else{
        balance = balance + amount;
        }
    }

    public int checkBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        this.balance = balance - amount ;
    }
}
