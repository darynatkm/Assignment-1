package assignment14;

public class SavingsAccount extends BankAccount{
    double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }
}
