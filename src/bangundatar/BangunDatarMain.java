/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

import mypackage.OperasiBilangan;

/**
 *
 * @author TOSHIBA
 */
public class BangunDatarMain {
    public static void main(String[] args) {
        PersegiPanjang op1 = new PersegiPanjang();
        op1.panjang = 25;
        op1.lebar = 38;
        op1.hitungLuas();
        op1.hitungKeliling();
        
        System.out.println("");
        Persegi op2 = new Persegi();
        op2.sisi = 10;
        op2.hitungLuas();
        op2.hitungKeliling();
        
        System.out.println("");
        Persegi op3 = new Persegi();
        op3.sisi = 15;
        op3.hitungLuas();
        op3.hitungKeliling();
        
        System.out.println("");
        Lingkaran op4 = new Lingkaran();
        op4.r = 25;
        op4.hitungLuas();
        op4.hitungKeliling();
        
        System.out.println("");
        Lingkaran op5 = new Lingkaran();
        op5.r = 37;
        op5.hitungLuas();
        op5.hitungKeliling();
    }
}
