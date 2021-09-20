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
public class Lingkaran {
    public int r;
    
    public void hitungLuas(){
        double luas = 3.14 * r * r;
        System.out.println("Hasil Luas Lingkaran yaitu " + luas);
    }
    public void hitungKeliling(){
        double keliling = 2 * 3.14 * r;
        System.out.println("Hasil Keliling Ligkaran yaitu " + keliling);
    }
}
