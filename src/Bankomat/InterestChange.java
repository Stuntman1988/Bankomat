package Bankomat;

public class InterestChange {
    private int interestRate;
    private String Date;
    private Employee Authorizee;

    public InterestChange(int interestRate, String date, Employee authorizee) {
        this.interestRate = interestRate;
        Date = date;
        Authorizee = authorizee;
    }
}
