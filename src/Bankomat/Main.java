package Bankomat;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public void printMe(Printable info){
        info.PrintMe();
    }
    public Main(){
        List<Client> clientlist = new ArrayList<>();
        List<Employee> employeelist = new ArrayList<>();

        Employee karl = new Employee(1,"Karl Svensson",10);
        Employee nils = new Employee(2,"Nils Karlsson",11);
        Employee sven = new Employee(3,"Sven Andersson",12);

        Client client1 = new Client(1, "client1");
        Client client2 = new Client(2, "client2");
        Client client3 = new Client(3, "client3");

        clientlist.add(client1);
        clientlist.add(client2);
        clientlist.add(client3);

//        for (Client client : clientlist){
//            System.out.println("Name: " + client.name + " ID: " + client.idNumber);
//        }

        employeelist.add(karl);
        employeelist.add(nils);
        employeelist.add(sven);

//        for (Employee employee: employeelist)
//            System.out.println("Name: " + employee.name + " Salary: " + employee.salary + " kr");

        client1.addAccount(new Account(15_000, 2.5, "Sparande"));
        client1.addAccount(new Account(13_000, 1.1, "Buffert"));

        client2.addAccount(new Account(50_000, 3.5, "Resa"));

/*      Krångligare sett att skapa lån och ändra ränta
        Loan test = new Loan("NästanTest",10_000, 1.5, nils);
        client1.addLoan(test);
        test.changeInterestRate(2.0, sven);

*/

//        client1.listOfAccounts();
//        client2.listOfAccounts();

        client1.addLoan(new Loan("Hus",10_000,2,karl));
        client1.addLoan(new Loan("Bil",2_000,3.2,nils));

        client1.loanList.get(1).changeInterestRate(5, sven);

        client1.listOfLoans();





    }


    public static void main(String[] args){
        Main test = new Main();
    }
}

