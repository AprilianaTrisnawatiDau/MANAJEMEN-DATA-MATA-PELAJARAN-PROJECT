/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBAB7;
public class Main {
    public static void main(String[] args) {
        // Upcasting: referensi superclass untuk objek subclass
        ManajemenMapel mapel1 = new MataPelajaranBahasa();
        mapel1.setKode("BHS101");
        mapel1.setNama("Bahasa Jepang");
        mapel1.setGuru("Bu Yuki");
        mapel1.setKategori("Bahasa");
        mapel1.setSemester(2);

        // Downcasting agar bisa akses metode khusus subclass
        MataPelajaranBahasa bahasa = (MataPelajaranBahasa) mapel1;
        bahasa.setBahasa("Jepang");

        // Polimorfisme Statis
        System.out.println("\n=== Polimorfisme Statis ===");
        mapel1.setNama("Bahasa Jepang");
        System.out.println("Nama 1: " + mapel1.cetakNama());
        mapel1.setNama("Bahasa Jepang", "Level Dasar");
        System.out.println("Nama 2: " + mapel1.cetakNama());

        // Polimorfisme Dinamis
        ManajemenMapel mapel2 = new MataPelajaranPraktikum();
        mapel2.setKode("PRK201");
        mapel2.setNama("Praktikum Fisika");
        mapel2.setGuru("Pak Budi");
        mapel2.setKategori("Praktikum");
        mapel2.setSemester(3);

        MataPelajaranPraktikum praktikum = (MataPelajaranPraktikum) mapel2;
        praktikum.setDataStatus("Wajib");
        praktikum.setDataKelasAsal("XII IPA 1");
        praktikum.setDataDurasi("2 Jam");
        praktikum.setDataJumlahAslab(2);
        praktikum.setDataKelas("Lab 1");
        praktikum.setDataLaporan("Ya");
        praktikum.setDataAlat("Lengkap");
        praktikum.setDataModul("Modul A");

        System.out.println("\n=== Polimorfisme Dinamis ===");
        System.out.println("Nama Bahasa: " + mapel1.cetakNama());
        System.out.println("Nama Praktikum: " + mapel2.cetakNama());
    }
}
