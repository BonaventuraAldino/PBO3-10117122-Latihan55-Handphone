/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan55.handphone;

/**
 *
 * @author Aldy Senda
 */
public class Handphone {
    protected String manufacture, os, operatingSystem, model;
    protected int harga;
    
    public Handphone (String man, String os, String model, int harga){
        this.manufacture = man;
        this.os = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct (){ 
        System.out.println("\nManufaktur\t: " + manufacture);
        System.out.println("OS\t\t: " + os);
        System.out.println("Model\t\t: " + model);
        System.out.println("Harga\t\t: " + harga);
        
    }
}
