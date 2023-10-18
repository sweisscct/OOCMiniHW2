/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweis
 */
public interface Drivable {
    public void accelerate(double speed);
    public void brake();
    public void turn(double angle);
    public double getDirection(); 
    public double getSpeed();   
    public String getMake();    
    public String getType();
}
