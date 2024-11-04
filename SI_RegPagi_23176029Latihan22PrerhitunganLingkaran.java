/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_23176029latihan22prerhitunganlingkaran;

/**
 *
 * @author shafi
 * Nama  : Shafitri Salma Ramadanti
 * NIM   : 23176029
 * Kelas : PBO1
 * Prodi : Sistem Informasi
 * Deskripsi Program : Program ini berisi program untuk menampilkan perhitungan lingkaran
 */

import java.util.Scanner;
public class SI_RegPagi_23176029Latihan22PrerhitunganLingkaran {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean validInput = false;
        double diameter = 0;

        System.out.println("======Perhitungan Lingkaran======");
        
        // Meminta input hingga pengguna memasukkan nilai diameter yang valid
        while (!validInput) {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            String inputDiameter = input.nextLine();
            
            try {
                // Mencoba mengonversi input ke tipe double
                diameter = Double.parseDouble(inputDiameter);
                
                // Jika diameter valid, ubah validInput menjadi true
                if (diameter > 0) {
                    validInput = true;
                } else {
                    System.out.println("Nilai Diameter Tidak Sesuai");
                }
            } catch (NumberFormatException e) {
                // Menangkap error jika input bukan angka
                System.out.println("Nilai Diameter Tidak Sesuai");
            }
        }

        // Jika input valid, hitung jari-jari, luas, dan keliling lingkaran
        double jariJari = diameter / 2;
        double luas = Math.PI * Math.pow(jariJari, 2);
        double keliling = Math.PI * diameter;

        // Menampilkan hasil perhitungan
        System.out.println("\n======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran = %.0f cm%n", jariJari);
        System.out.printf("Luas Lingkaran = %.2f cm%n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm%n", keliling);
    }
}
