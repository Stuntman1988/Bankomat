package Bankomat;

import java.util.List;

public class Loan {

    protected String loanAccountName;
    protected double loanBalance;
    protected double interestRate;
    protected Employee authorizee;

    public Loan(String loanAccountName, double loanBalance, double interestRate, Employee authorizee) {
        this.loanAccountName = loanAccountName;
        this.loanBalance = loanBalance;
        this.interestRate = interestRate;
        this.authorizee = authorizee;
    }

    @Override
    public String toString() {
        return "Loan Accountname: " + loanAccountName + "\nBalance: " + loanBalance + "\nInterestRate=" + interestRate
                + "\nAuthorized by: " + authorizee.toString();
    }
}
