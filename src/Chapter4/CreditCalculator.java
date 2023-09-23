package Chapter4;

public class CreditCalculator {

    private int account;
    private int balance;
    private int monthCharge;

    public int account(int number) {
        return number;
    }

    public int balance(int amount) {
        return amount;
    }
    public int monthCharge(int monthCharge) {
        monthCharge = balance - monthCharge;
        return monthCharge;
    }

    public int totalCreditsApplied(int creditApplied) {
        return creditApplied;
    }
}
