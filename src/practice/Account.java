package practice;

public class Account {
    private int balance;

    public void Checkbalance(int checkbalance) {
        this.balance = checkbalance;
    }

    public void deposit(int amount) {
        int checkbalance = balance;
        if (amount <= checkbalance) ;
    }

    public int withdrawal(int withdrawalal) {
        if (withdrawalal < balance) {
            System.out.println("thank you for banking with us");
        }
        if (withdrawalal < balance) {
            this.balance = balance - withdrawalal;
        }
        if (withdrawalal > balance) {
            System.out.print("insufficient fund: ");
        }
        return withdrawalal;
    }
}
