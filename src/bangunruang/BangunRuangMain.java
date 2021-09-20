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
public class BangunRuangMain {
    public static void main(String[] args) {
        Bola op1 = new Bola();
        op1.r = 25;
        op1.hitungVolume();
        op1.hitungPermukaan();
        
        System.out.println("");
        Tabung op2 = new Tabung();
        op2.r = 20;
        op2.t = 10;
        op2.hitungVolume();
        op2.hitungPermukaan();
        
        System.out.println("");
        Kerucut op3 = new Kerucut();
        op3.r = 20;
        op3.t = 10;
        op3.s = 5;
        op3.hitungVolume();
        op3.hitungPermukaan();
}
}