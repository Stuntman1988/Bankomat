package Bankomat;


import java.util.ArrayList;
import java.util.List;

public class Client extends Person {

    protected List<Account> accountList;
    protected List<Loan> loanList;


    public Client(int idNumber, String name) {
        super(idNumber, name);
        this.accountList = new ArrayList<>();
        this.loanList = new ArrayList<>();
    }

    public void addAccount(Account newAccount) {
        this.accountList.add(newAccount);
    }

    public void listOfAccounts() {
        for (int i = 0; i < accountList.size(); i++) {
            System.out.println(accountList.get(i).toString());
        }
    }

    public void addLoan(Loan newLoan) {
        this.loanList.add(newLoan);
    }

    public void listOfLoans() {
        for (int i = 0; i < loanList.size(); i++) {
            System.out.println(loanList.get(i).toString());
        }
    }

}


