package Bankomat;

abstract class Person extends Bank{
    int idNumber;
    String name;

    public Person(){}
    public Person(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }
}
