package pertemuan5602;

import java.util.Scanner; // Import Scanner

/**
 *
 * @author Gunawiartha
 * TGL 26 April 2025
 */
public class Pertemuan5602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        int alas = scanner.nextInt();

        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();

        LuasSegiTiga SegiTiga01 = new LuasSegiTiga();
        SegiTiga01.alas = alas;
        SegiTiga01.tinggi = tinggi;

        System.out.print("Luas Segitiga: " + SegiTiga01.HitungLuas());
        
        scanner.close();
    }
}