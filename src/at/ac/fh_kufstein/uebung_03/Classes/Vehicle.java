/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03.Classes;

/**
 *
 * @author 1210653585
 */
public class Vehicle extends benennbar_abstract implements benennbar {

    private short wheels;
    private String name;

    @Override
    public void setName(String name) {
        this.name=name; 
    }

    @Override
    public String getName() {
        return name;
    }

    
    public enum Farbe {

        black, silver, red, grey, yellow, blue
    };
    Farbe colour;
    private short ps;
    private short doors;
    private boolean started;
    private short speed;

    void start() {
        started = true;
    }

    void stop() {
        started = false;
    }

    void accelerate(short speed) {
        if (started == true && speed < 250) {
            speed += speed;
        } else {
            System.out.println("Fahrzeug kann nicht gestartet werden");
        }
    }

    void slow(short speed) {
        if (started == true && speed > 0) {
            speed -= speed;
        } else {
            System.out.println("Fahrzeug ist nicht gestartet");
        }
    }

    public Vehicle(short wheels, Farbe colour, short ps, short doors) {
        this.wheels = wheels;
        this.colour = colour;
        this.ps = ps;
        this.doors = doors;
        this.started = false;
        this.speed = 0;
    }

    public short getWheels() {
        return wheels;
    }

    public void setWheels(short wheels) {
        this.wheels = wheels;
    }

    public Farbe colour() {
        return colour;
    }

    public void setFarbe(Farbe colour) {
        this.colour = colour;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getDoors() {
        return doors;
    }

    public void setDoors(short doors) {
        this.doors = doors;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }
}
