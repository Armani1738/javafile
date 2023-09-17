package ChibuzorAssignment;

public class Money {
    private int pin;
    private String moneyName;
    private String moneyNumber;
    private int moneyBalance;

    public void Money(int pin, String moneyName, String moneyNumber, int moneyBalance){
        this.pin = pin;
        this.moneyName = moneyName;
        this.moneyNumber = moneyNumber;
       this.moneyBalance = moneyBalance;
    }
    public void deposit(int amount) {
        if (amount <= 0);
        moneyBalance = amount + moneyBalance;
    }

    public void Withdraw(int amount) {
        if (amount > moneyBalance);
        moneyBalance = amount - moneyBalance;


    }

    public int checkBalance() {
        return moneyBalance;
   }


}

