/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5601;

/**
 *
 * @author Gunawiartha
 * TGL 26 April 2025
 */
public class Pertemuan5601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        manusia johan = new manusia("L");
        johan.warnakulit="brown";
        johan.setWarnaRambut("hitam");
        
        manusia yani = new manusia("P");
        yani.warnakulit="hitam";
        yani.setWarnaRambut("putih");
        
        manusia yanto = new manusia("L");
        yanto.warnakulit="putih";
        yanto.setWarnaRambut("coklat");
        
    }
    
    
}

class manusia{
    public String warnakulit="";
    private String warnarambut="";
    private String jeniskelamin="";
    
    public manusia(String jkel){
        this.jeniskelamin = jkel;
    }
    public void setWarnaRambut(String warna){
        this.warnarambut = warna;
    }
}

