package Bankomat;

import java.util.*;

public class Employee extends Person {

    protected int salary;

    public Employee(int idNumber, String name, int salary) {
        super(idNumber, name);
        this.salary = salary;
    }

    Calendar today = Calendar.getInstance();

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name + ", ID number: " + idNumber;
    }
}
