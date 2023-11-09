import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	//While digunakan untuk melakukan loop tanpa batas dan akan terus berjalan jika tanpa kita tambahkan function break.
	
        while (true) {
            System.out.println("Pilih Operasi 1-5 (1: Penjumlahan, 2: Pengurangan, 3: Perkalian, 4: Pembagian, 5: Sisa Hasil Bagi, 0: Keluar): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 0) {
                System.out.println("Berhasil Keluar!");
                break;
            }

            System.out.print("Masukkan Angka Pertama: ");
            double angka1 = scanner.nextDouble();
            System.out.print("Masukkan Angka Kedua: ");
            double angka2 = scanner.nextDouble();

           //Pengertian Switch dan Case.Switch digunakan untuk menyediakan opsi atau kasus yang akan di evaluasi, sedangkan Case digunakan untuk mengeksekusi kasus tersebut
         
              switch (pilihan) {
                case 1:
                    System.out.println(angka1 + " + " + angka2 + " = " + penjumlahan(angka1, angka2));
                    break;
                case 2:
                    System.out.println(angka1 + " - " + angka2 + " = " + pengurangan(angka1, angka2));
                    break;
                case 3:
                    System.out.println(angka1 + " * " + angka2 + " = " + perkalian(angka1, angka2));
                    break;
                case 4:
                    System.out.println(angka1 + " / " + angka2 + " = " + pembagian(angka1, angka2));
                    break;
                case 5:
                    System.out.println(angka1 + " % " + angka2 + " = " + sisaHasilBagi(angka1, angka2));
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        scanner.close();
    }

    public static double penjumlahan(double a, double b) {
        return a + b;
    }

    public static double pengurangan(double a, double b) {
        return a - b;
    }

    public static double perkalian(double a, double b) {
        return a * b;
    }

    public static double pembagian(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Pembagian oleh nol tidak valid.");
            return Double.NaN;
        }
    }

    public static double sisaHasilBagi(double a, double b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Pembagian oleh nol tidak valid.");
            return Double.NaN;
            // Double NaN digunakan untuk menunjukkan bahwa hasil dari operasi tertentu tidak valid atau tidak dapat dihitung dalam konteks tertentu.
        }
    }
}
