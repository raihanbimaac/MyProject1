/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author TOSHIBA
 */
public class Tabung {
    public int r;
    public int t;
    
    public void hitungVolume(){
        double volume = 3.14 * t * r * r;
        System.out.println("Hasil Volume Tabung yaitu " + volume);
    }
    public void hitungPermukaan(){
        double Permukaan = 2 * 3.14 * r * t;
        System.out.println("Hasil Luas Selimut Tabung yaitu " + Permukaan);
    }
}
