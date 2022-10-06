package Bankomat;

public class Account{

    protected String accountName;
    protected double balance;
    protected double interestRate;

    public Account(double balance, double interestRate, String accountName) {
        this.accountName = accountName;
        this.balance = balance;
        this.interestRate = interestRate;

    }
    public String getAccountName(){
        return accountName;
    }

    @Override
    public String toString() {
        return "Accountname: " + accountName + "\nBalance: " + balance + "\nInterestRate: " + interestRate;
    }
}
