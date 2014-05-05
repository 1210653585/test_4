/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03.Classes;

/**
 *
 * @author 1210653585
 */
public class Liste <List1> extends benennbar_abstract{
    
    private Object [] array1;
    private int size;
    private int zaehler = 0;

    public Liste(int size) {
        this.size = size;
        array1 = new Object[this.size];
    }
    
    public void save(List1 param) {
        if (zaehler < size) {
            array1[zaehler] = param;
            zaehler++;
        } else {
            System.out.println("Array ist voll");
        }  
    }
    
    
    public Object[] getArray1() {
        return array1;
    }

    public void setArray1(Object[] array1) {
        this.array1 = array1;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getZaehler() {
        return zaehler;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }
    
    
    
    
    
   
}
