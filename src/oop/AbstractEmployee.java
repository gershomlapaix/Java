package oop;

public abstract class AbstractEmployee {
    private String name;
    private String address;
    private int number;

    public AbstractEmployee(String name, String address, int number){
        System.out.println("Contructing an Employee");

        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString(){
        return name+" "+address+" "+number;
    }

    public abstract double computePay();
    public void mailCheck(){
        System.out.println("Mailing a check to "+this.name+" "+this.address);
    }
}
