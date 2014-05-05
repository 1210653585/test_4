/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03.Classes;

/**
 *
 * @author 1210653585
 */
public class Boat extends Vehicle {

    private double draft;
    private short propeller;
    private double cargo;

    void unload() throws InterruptedException {
        cargo = 0;
        Thread.sleep(5000);
    }

    public double getDraft() {
        return draft;
    }

    public void setDraft(double draft) {
        this.draft = draft;
    }

    public short getPropeller() {
        return propeller;
    }

    public void setPropeller(short propeller) {
        this.propeller = propeller;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public Boat(short wheels, Farbe colour, short ps, short doors, double draft, short propeller, double cargo) {
        super(wheels, colour, ps, doors);
        this.draft = draft;
        this.propeller = propeller;
        this.cargo = cargo;

    }

    @Override
    public String toString() {
        return "Mein Wasserfahrzeug hat " + this.getPs() + " und einen Tiefgang von " + this.getDraft() + " m";
    }
}
