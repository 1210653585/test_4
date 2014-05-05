/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03.Classes;

/**
 *
 * @author 1210653585
 */
public class Car extends Vehicle {

    private boolean aircondition;
    private short airbag;

    void startAricondition() {
        if (aircondition == false) {
            aircondition = true;
        } else {
            System.out.println("Klima läuft bereits");
        }
    }

    void stopAircondition() {
        if (aircondition == true) {
            aircondition = false;
        } else {
            System.out.println("Klima läuft bereits");
        }
    }

    public boolean isAircondition() {
        return aircondition;
    }

    public void setAircondition(boolean aircondition) {
        this.aircondition = aircondition;
    }

    public short getAirbag() {
        return airbag;
    }

    public void setAirbag(short airbag) {
        this.airbag = airbag;
    }

    public Car(short wheels, Farbe colour, short ps, short doors, short airbag) {
        super(wheels, colour, ps, doors);
        this.aircondition = false;
        this.airbag = airbag;
    }

    @Override
    public String toString() {
        return "Mein Auto hat " + this.getPs() + " und fährt mit " + this.getSpeed() + " km/h";
    }
}
