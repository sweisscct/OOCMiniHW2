/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Lecturer
 */
public class Seaplane extends Boat implements Flyable {
    private float altitude;

    public Seaplane(float altitude, float speed, String make, String type, int numPassengers) {
        super(0, false, speed, make, type, numPassengers);
        this.altitude = altitude;
    }
    
    @Override
    public float getAltitude() {
        return altitude;
    }
    
    @Override
    public void changeAltitude(float altitudeChange) {
        altitude = altitude + altitudeChange;
    }
    
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
