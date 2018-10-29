/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan55.handphone;

/**
 *
 * @author Aldy Senda
 * Nama  : Bonaventura Aldino Senda Seni
 * NIM   : 10117122
 * Kelas : IF-3
 * Deskripsi Program : Program ini berisi program untuk menampilkan manufaktur, 
 *                     OS, Model, dan harga dari handphone dengan macam-macam
 *                     jenis menggunakan pendekatan berbasis objek.
 */
public class PBO310117122Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android android = new Android("Samsung","Android","Grand",30000000);
        android.displayProduct();
        System.out.println("Android Key Store : " + android.getKeyStore());
        
        BlackBerry blackberry = new BlackBerry("BlackB","RIM","Curve",2000000);
        blackberry.displayProduct();
        System.out.println("PIN : " + blackberry.getPinBB());
        
        WindowsPhone winphon = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        winphon.displayProduct();
        System.out.println("Wp Key Store : " + winphon.getWpKeyStore());
        System.out.println("\n(Developed By : Boonaventura Aldino Senda Seni)");
    }
    
}
