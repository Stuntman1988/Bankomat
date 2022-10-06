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

        Employee putte = new Employee(1,"putte",10);
        Employee nutte = new Employee(2,"nutte",11);
        Employee dutte = new Employee(3,"dutte",12);

        Client client1 = new Client(1, "client1");
        Client client2 = new Client(2, "client2");
        Client client3 = new Client(3, "client3");

        clientlist.add(client1);
        clientlist.add(client2);
        clientlist.add(client3);

        for (Client client : clientlist){
            System.out.println("Name: " + client.name + " ID: " + client.idNumber);
        }

        employeelist.add(putte);
        employeelist.add(nutte);
        employeelist.add(dutte);

        for (Employee employee: employeelist)
            System.out.println("Name: " + employee.name + " Salary: " + employee.salary + " kr");

        client1.addAccount(new Account(15_000, 2.5, "Sparande"));
        client1.addAccount(new Account(13_000, 1.1, "Buffert"));

        client2.addAccount(new Account(50_000, 3.5, "Resa"));

        client1.listOfAccounts();
        client2.listOfAccounts();

        client1.addLoan(new Loan("1",10_000,2,dutte));
        client1.addLoan(new Loan("2",2_000,3.2,putte));

        client1.listOfLoans();





    }


    public static void main(String[] args){
        Main test = new Main();
    }
}

