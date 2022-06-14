package oop.composition;

public class Honda extends Car {
    public void HondaStart(){
        CarEngine hondaEngine = new CarEngine();  // composition here
        hondaEngine.stopEngine();
    }

    public static void main(String[] args) {
        Honda honda = new Honda();

        honda.setColour("Black");
        honda.setMaxi_Speed(160);

        honda.carDetails();
        honda.HondaStart();
    }
}
