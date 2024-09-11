package org.ISABELLALINDQVIST;

public class Car {
    private int velocity;
    private String color;

    public Car(int velocity, String color) {
        this.velocity = velocity;
        this.color = color;
    }

    public String Accelerate(int velocity) {
        this.velocity += velocity;
        //String format
        return Status();
    }

    public String Status () {
        return String.format("Den %s bilen kör i %d km/h", this.color, this.velocity);
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
