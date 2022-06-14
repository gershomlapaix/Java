package oop.multipleInh;

public interface Printable {
    void print();

//    static and default methods have body
    default void msg(){
        System.out.println("Default methods have body");
    }
}

interface Draw{
    void draw();
    static int cube(int x){
        return x*x*x;
    }
}

class Rectangle implements Draw{
    @Override
    public void draw(){
        System.out.println("Drawing rectangle");
    }
}

interface Showable{
    void show();
}

class MultpileInheritance implements Printable, Showable{
    @Override
    public void print(){
        System.out.println("From the print interface");
    }

    @Override
    public void show(){
        System.out.println("From the show interface");
    }

//    the main method
    public static void main(String[] args) {
        MultpileInheritance multpileInheritance = new MultpileInheritance();

        multpileInheritance.print();
        multpileInheritance.show();

//        default and static methods
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        System.out.println("The area will be "+ Draw.cube(2));
    }
}
