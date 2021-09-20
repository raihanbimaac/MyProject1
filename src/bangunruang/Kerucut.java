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
public class Kerucut {
    public int r;
    public int t;
    public int s;
    
    public void hitungVolume(){
        double volume =  (3.14 * r * r * t) / 3;
        System.out.println("Hasil Volume Kerucut yaitu " + volume);
    }
    public void hitungPermukaan(){
        double Permukaan = 3.14 * r * s;
        System.out.println("Hasil Luas Selimut Kerucut yaitu " + Permukaan);
    }
}
