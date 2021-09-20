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
public class Bola {
    public double r;
    
    public void hitungVolume(){
        double volume = (4 * 3.14 * Math.pow(r, 3)) / 3;
        System.out.println("Hasil Volume Bola yaitu " + volume);
    }
    public void hitungPermukaan(){
        double Permukaan = 4 * 3.14 * r * r;
        System.out.println("Hasil Luas Selimut Bola yaitu " + Permukaan);
    }
}
