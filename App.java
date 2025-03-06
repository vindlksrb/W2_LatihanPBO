import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inputan
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan Usia: ");
        int usia = input.nextInt();
        
        System.out.print("Masukkan Tinggi Badan (cm): ");
        double tinggiBadan = input.nextDouble();
        
        System.out.println("\nData yang dimasukkan:");
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Usia        : " + usia);
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");

        // 1. Menggunakan operator aritmatika
        double hasilAritmatika = (usia * 2) + 10 / 5 - 3;
        System.out.println("\nHasil perhitungan (usia * 2) + 10 / 5 - 3: " + hasilAritmatika);

        // 2. Menggunakan operator perbandingan
        boolean lebihDari18 = usia > 18;
        System.out.println("Apakah usia lebih dari 18? " + lebihDari18);

        // 3. Menggunakan operator logika
        boolean memenuhiSyarat = (usia > 18) && (tinggiBadan > 160);
        System.out.println("Apakah usia lebih dari 18 dan tinggi badan lebih dari 160 cm? " + memenuhiSyarat);

        // 4. Konversi tipe data
        double usiaDouble = (double) usia;
        int tinggiInt = (int) tinggiBadan;

        System.out.println("\nHasil konversi tipe data:");
        System.out.println("Usia dalam double: " + usiaDouble);
        System.out.println("Tinggi badan dalam int: " + tinggiInt);

        input.close();
    }
}