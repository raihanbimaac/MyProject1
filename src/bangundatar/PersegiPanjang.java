/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author TOSHIBA
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    
    public void hitungLuas(){
        int luas = panjang * lebar;
        System.out.println("Hasil Luas Persegi Panjang yaitu " + luas);
    }
    public void hitungKeliling(){
        int keliling = 2 * (panjang + lebar);
        System.out.println("Hasil Keliling Persegi Panjang yaitu " + keliling);
    }
}
