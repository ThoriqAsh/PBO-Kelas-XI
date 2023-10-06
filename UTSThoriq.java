/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.thoriq;

import java.util.Scanner;

public class UTSThoriq {

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        
        /*Digunakan untuk memasukkan informasi
          menggunakan print nama menggunakan input string
          kemudian print nomor absen,kelas nilai tugas
          nilai uts dan nilai UAS menggunakan input
          integer
         */  
                
        System.out.print("Nama:");
        String nama = object.nextLine();
        
        System.out.print("Kelas:");
        String kelas = object.nextLine();
        
        System.out.print("Nomor Absen:");
        int nomorAbsen = object.nextInt();
        
        System.out.print("Nilai Tugas:");
        int nilaiTugas = object.nextInt();
        
        System.out.print("Nilai UTS:");
        int nilaiUTS = object.nextInt();
        
        System.out.print("Nilai UAS:");
        int nilaiUAS = object.nextInt();
        
        /*Menghitung Nilai Akhir dengan cara
          menggunakan double kemudian input nilai Akhir
          sebesar 10%, nilai tugas sebesar 30%, nilai UTS
          sebesar 60% lalu ditotal
        */
         
        double nilaiAkhir = 0.1 * nilaiTugas + 0.3 * nilaiUTS + 0.6 * nilaiUAS;
        
        /*Menentukan nilai menggunakan string
          dengan cara meng total hasil nilai akhir
          dan jika sudah muncul hasilnya maka hasil akhir nilai
          akan otomatis disesuaikan dengan inputan kita. :)
        */
        
        String nilai;
        if (nilaiAkhir >= 85 && nilaiAkhir <=100){
            nilai = "A";
        }else if (nilaiAkhir >= 75 && nilaiAkhir <=85){
            nilai = "B";
        }else if (nilaiAkhir >= 65 && nilaiAkhir <=75){
            nilai = "C";
        }else if (nilaiAkhir >= 50 && nilaiAkhir <=65){
            nilai = "D";
        }else{
            nilai = "E";
        }
    
        /*Menampilkan hasil nilai dengan cara
          print hasil akhir, nama, kelas, nilai akhir
          dan juga nilai fungsinya adalah agar saat kita
          jalankan maka akan muncul tulisan sesuai input kita
        */
        System.out.println("Hasil Akhir :");
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nomor Absen: " + nomorAbsen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai: " + nilai);
    }
}
