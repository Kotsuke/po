import java.util.ArrayList;
import java.util.Scanner;

public class UASNo31A {
    public static void main(String[] args) {
        ArrayList<String> lantai1 = new ArrayList<>();
        ArrayList<String> lantai2 = new ArrayList<>();
        ArrayList<String> lantai3 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Menu:");
            System.out.println("1. Parkir mobil (mesin 2500 cc)");
            System.out.println("2. Parkir mobil (mesin 1500 - 2000 cc)");
            System.out.println("3. Parkir mobil (mesin 1000 - 1200 cc)");
            System.out.println("4. Tampilkan tempat parkir");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    parkirMobil(lantai1, "2500 cc");
                    break;
                case 2:
                    parkirMobil(lantai2, "1500 - 2000 cc");
                    break;
                case 3:
                    parkirMobil(lantai3, "1000 - 1200 cc");
                    break;
                case 4:
                    tampilkanTempatParkir(lantai1, "Lantai 1");
                    tampilkanTempatParkir(lantai2, "Lantai 2");
                    tampilkanTempatParkir(lantai3, "Lantai 3");
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan angka 1-5.");
            }
        }

        scanner.close();
    }

    private static void parkirMobil(ArrayList<String> lantai, String mesin) {
        if (lantai.size() < 10) {
            lantai.add("Mobil (Mesin " + mesin + ")");
            System.out.println("Mobil berhasil diparkir di lantai ini.");
        } else {
            System.out.println("Tempat parkir penuh di lantai ini.");
        }
    }

    private static void tampilkanTempatParkir(ArrayList<String> lantai, String namaLantai) {
        System.out.println("Tempat Parkir di " + namaLantai + ":");
        for (int i = 0; i < lantai.size(); i++) {
            System.out.println("Slot " + (i + 1) + ": " + lantai.get(i));
        }
        System.out.println();
    }
}