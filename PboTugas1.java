/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbotugas1;

/**
 *
 * @author LAB1PC233
 */
public class PboTugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mendefinisikan variabel
        String nama = "Thoriq Ash Shiddiqie";
        int noAbsen = 26;
        String kelas = "XI-PPLG";
        double nilaiPBO = 85;
        double nilaiMatematika = 90;

        // Mendefinisikan konstanta
        final String mapelPBO = "Pemrograman Berorientasi Objek";
        final String mapelMatematika = "Matematika";

        // Mencetak informasi ke konsol
        System.out.println("Nama: " + nama);
        System.out.println("No. Absen: " + noAbsen);
        System.out.println("Kelas: " + kelas);
        System.out.println(mapelPBO + ": " + nilaiPBO);
        System.out.println(mapelMatematika + ": " + nilaiMatematika);
    }
    
}
