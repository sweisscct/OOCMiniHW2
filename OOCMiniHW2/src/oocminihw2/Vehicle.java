/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweis
 */
public abstract class Vehicle {
    private float speed;
    private float direction = 0;
    private String make;
    private String type;
    protected int numWheels = 0;
    protected int numWings = 0;
    protected int numSails = 0;
    private int numPassengers;

    public Vehicle(float speed, String make, String type, int numPassengers) {
        this.speed = speed;
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
    }

    public float getSpeed() {
        return speed;
    }

    public float getDirection() {
        return direction;
    }

    public String getMake() {
        return make;
    }

    public String getType() {
        return type;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setDirection(float direction) {
        this.direction = direction;
    }
    
    
    
}
