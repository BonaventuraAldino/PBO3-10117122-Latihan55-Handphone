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
public class Android extends Handphone{
    private String keyStore;
    
    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getKeyStore() {
        return "234ibfd3840fo";
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
}