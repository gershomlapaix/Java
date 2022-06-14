package oop.multipleInh;

public interface Printable {
    void print();
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
    }
}
