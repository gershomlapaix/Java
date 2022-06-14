package oop.composition;

public class Car {
    private String colour;
    private int maxi_Speed;

    public Car(){}
    public Car(String color, int maxi_Speed){
        this.colour = color;
        this.maxi_Speed = maxi_Speed;
    }

    public void carDetails(){
        System.out.println("Car colour ="+colour+" ; maximum speed = "+maxi_Speed);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMaxi_Speed() {
        return maxi_Speed;
    }

    public void setMaxi_Speed(int maxi_Speed) {
        this.maxi_Speed = maxi_Speed;
    }
}
