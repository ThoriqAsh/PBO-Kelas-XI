/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbotugas1;
import java.util.Scanner;
/**
 *
 * @author LAB1PC233
 */
public class PBOTugas5 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukan Kelas: ");
        int kelas = input.nextInt();

        System.out.print("Masukan Usia: ");
        double usia = input.nextDouble();

        System.out.print("Masukan Absen: ");
        float absen = input.nextFloat();

        System.out.println("Data Siswa:");
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Usia: " + usia);
        System.out.println("Absen: " + absen);
    }
}
