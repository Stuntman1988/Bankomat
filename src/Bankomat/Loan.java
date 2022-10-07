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

    public void changeInterestRate(double newInterestRate, Employee authorizedBy){
        System.out.println(authorizedBy.toString() + " have authorized to change interestrate on loan "
                + getLoanAccountName() + " from " + interestRate + "% to " + newInterestRate + "%\n"
                + formatDateTime + "\n");
        interestRate = newInterestRate;
    }

    public String getLoanAccountName() {
        return loanAccountName;
    }

    public Employee getAuthorizee() {
        return authorizee;
    }

    @Override
    public String toString() {
        return "Loan Accountname: " + loanAccountName + "\nBalance: " + loanBalance + "\nInterestRate: " + interestRate
                + "%\nAuthorized by: " + authorizee.toString() + "\n";
    }
}
