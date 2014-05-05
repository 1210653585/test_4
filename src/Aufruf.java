
import at.ac.fh_kufstein.uebung_03.Classes.Boat;
import at.ac.fh_kufstein.uebung_03.Classes.Car;
import at.ac.fh_kufstein.uebung_03.Classes.Liste;
import at.ac.fh_kufstein.uebung_03.Classes.Vehicle.Farbe;
import at.ac.fh_kufstein.uebung_03.Classes.benennbar;
import at.ac.fh_kufstein.uebung_03.Classes.benennbar_abstract;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1210653585
 */
public class Aufruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Car bmw = new Car((short)4, Farbe.silver, (short)220, (short)5, (short)2);
        Car audi = new Car((short)4, Farbe.silver, (short)180, (short)5, (short)2);
        Boat titanic = new Boat((short) 0, Farbe.blue, (short)51000, (short)0, (double) 10.54, (short) 3, (short) 100000);
   
        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(titanic);
        
        benennbar namedCar = new Car((short)4, Farbe.blue, (short)360, (short)5, (short)2);  
        namedCar.setName("Auto");
        System.out.println(namedCar.getName());
        
        benennbar_abstract namedCar2 = new Car((short)4, Farbe.blue, (short)360, (short)5, (short)2);  
        namedCar2.setName("Auto2");
        System.out.println(namedCar2.getName());
        
        Liste vehicleArray = new Liste(2);
        vehicleArray.save(bmw);
        vehicleArray.save(audi);
        vehicleArray.save(titanic);
        
        for (int i = 0; i < vehicleArray.getSize(); i++) {
            System.out.println(vehicleArray.getArray1()[i]); 
        }
        
        
    }
}
