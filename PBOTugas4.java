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
public class PBOTugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama;
        
        System.out.println("panggil1 nama siswa");
        nama = input.next();
        switch (nama) {
            case "Thoriq":
                System.out.println("Thoriq hadir bu");
                System.out.println("Bolos bu");
                break;
                
                case "Priadi":
                System.out.println("Rara bolos bu");
                break;
            default:
                System.out.println("Bolos bu");
        }
    }
}
