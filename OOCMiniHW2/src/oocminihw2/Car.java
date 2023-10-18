/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Lecturer
 */
public class Car extends Vehicle implements Drivable {

    public Car(float speed, String make, String type, int numPassengers) {
        super(speed, make, type, numPassengers);
        this.numWheels = 4;
    }
    
//    @Override
//    public String getType() {
//        return this.type;
//    }
    @Override
    public void turn(float angle) {
//        float currentDirection = this.getDirection();
        this.setDirection(this.getDirection() + angle);
    }
    @Override
    public void brake() {
        this.setSpeed(0);
    }
    
    @Override
    public void accelerate(float speedChange) {
        this.setSpeed(this.getSpeed() + speedChange);
    }
    
    
}
