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
public class PBOTugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai jari-jari lingkaran: ");
        double radius = input.nextDouble();

        System.out.println("Pilih nilai phi (1 untuk 22/7, 2 untuk 3.14): ");
        int choice = input.nextInt();

        double phi;
        if (choice == 1) {
            phi = 22.0 / 7;
        } else {
            phi = 3.14;
        }

        double luas = phi * radius * radius;
        double keliling = 2 * phi * radius;

        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);
    }
}
