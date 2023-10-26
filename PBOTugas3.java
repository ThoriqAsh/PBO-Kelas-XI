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
public class PBOTugas3 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        String[] mapel = {"BIN", "MTK", "PBO", "BASIS DATA", "PPL", "IOT"};
        double total = 0;

        for (String mataPelajaran : mapel) {
            System.out.print("Masukkan nilai " + mataPelajaran + ": ");
            double nilai = input.nextDouble();
            total += nilai;
        }

        double rataRata = total / mapel.length;
        System.out.println("Rata-rata nilai: " + rataRata);

        if (rataRata >= 70) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
    }
}
