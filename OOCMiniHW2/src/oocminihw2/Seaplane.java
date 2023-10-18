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
    private double altitude;

    public Seaplane(double altitude, double speed, String make, String type, int numPassengers) {
        super(0, false, speed, make, type, numPassengers);
        this.altitude = altitude;
    }
    
    @Override
    public double getAltitude() {
        return altitude;
    }
    
    @Override
    public void changeAltitude(double altitudeChange) {
        altitude = altitude + altitudeChange;
    }
    
    @Override
    public void turn(double angle) {
//        float currentDirection = this.getDirection();
        this.setDirection(this.getDirection() + angle);
    }
    @Override
    public void brake() {
        this.setSpeed(0);
    }
    
    @Override
    public void accelerate(double speedChange) {
        this.setSpeed(this.getSpeed() + speedChange);
    }    
}
