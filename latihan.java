import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Input usia
        System.out.print("Masukkan usia: ");
        int usia = scanner.nextInt();

        // Menentukan kategori usia
        String kategori;
        if (usia < 7) {
            kategori = "Anak-anak";
        } else if (usia >= 7 && usia < 13) {
            kategori = "Remaja awal";
        } else if (usia >= 13 && usia < 18) {
            kategori = "Remaja";
        } else if (usia >= 18 && usia < 60) {
            kategori = "Dewasa";
        } else {
            kategori = "Lansia";
        }

        // Menampilkan hasil
        System.out.println("\nNama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Kategori: " + kategori);

        scanner.close();
    }
}
