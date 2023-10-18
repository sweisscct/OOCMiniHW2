/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Lecturer
 */
public class Boat extends Vehicle implements Sailable {
    private boolean sailHoisted;

    public Boat(int numSails, boolean sailHoisted, float speed, String make, String type, int numPassengers) {
        super(speed, make, type, numPassengers);
        this.sailHoisted = sailHoisted;
        this.numSails = numSails;
    }
    
    @Override
    public void landHo() {
        System.out.println("LAND HO!!!");
    }
    
    @Override
    public boolean isSailHoisted() {
        return sailHoisted;
    }
    
    @Override
    public void lowerSail() {
        sailHoisted = false;
    }
    
    @Override
    public void hoistSail() {
        sailHoisted = true;
    }
}
