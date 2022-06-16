package oop.composition;

public class Honda extends Car {
    private int price;

    public Honda(){};
    public Honda(int price){
        this.price = price;
    };
    public void HondaStart(){
        CarEngine hondaEngine = new CarEngine();  // composition here
        hondaEngine.stopEngine();
    }
    public static void main(String ...Honda) {
        Honda honda = new Honda();

        honda.setColour("Black");
        honda.setMaxi_Speed(160);

        honda.carDetails();
        honda.HondaStart();
    }
}
