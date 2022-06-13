package oop;

public class Salary extends AbstractEmployee{
    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        this.salary = salary;
    }

    @Override
    public double computePay(){
        System.out.println("Computing the salary of "+getName());

        return salary/12;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
