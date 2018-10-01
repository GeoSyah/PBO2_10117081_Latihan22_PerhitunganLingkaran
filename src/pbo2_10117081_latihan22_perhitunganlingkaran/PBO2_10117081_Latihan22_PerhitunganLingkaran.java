/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan22_perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Kelas : Menghitung jari-jari, luas, dan keliling dari suatu 
 *          lingkaran berdasarkan diameternya
 */
public class PBO2_10117081_Latihan22_PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String d;
        double diameter;
        double r;
        double L;
        double K;
        
        Scanner lingkaran = new Scanner(System.in);
        
        System.out.println("==== Perhitungan Lingkaran ====");
        
        do {
            System.out.print("Masukkan Nilai Diameter Lingkaran\t : ");
            d = lingkaran.nextLine();
            
            System.out.println((!d.matches("[0-9]*"))?
                    "Nilai Diameter Tidak Sesuai\n":"");
        } while (!d.matches("[0-9]*"));{
        
        System.out.println("==== Hasil Perhitungan Lingkaran ====");
        
        diameter = Double.parseDouble(d);
        
        r = diameter/2;
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",r);
        L = Math.PI*r*r;
        System.out.printf("Luas Lingkaran = %.2f cm %n",L);
        K =2*Math.PI*r;
        System.out.printf("Keliling Lingkaran = %.2f cm %n",K);
        }
    }
    
}
