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
public class Persegi {
    public int sisi;
    
    public void hitungLuas(){
        int luas = sisi * sisi;
        System.out.println("Hasil Luas Persegi yaitu " + luas);
    }
    public void hitungKeliling(){
        int keliling = 4 * sisi;
        System.out.println("Hasil Keliling Persegi yaitu " + keliling);
    }
}
