/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASBAB6;
public class Main {
public static void main(String[] args) {
        // Buat objek MataPelajaranBahasa
        MataPelajaranBahasa mapelBahasa = new MataPelajaranBahasa();
        mapelBahasa.setKode("BHS101");
        mapelBahasa.setNama("Bahasa Inggris");
        mapelBahasa.setGuru("Bu Sari");
        mapelBahasa.setKategori("Bahasa");
        mapelBahasa.setSemester(2);
        mapelBahasa.setBahasa("Inggris"); // Set field spesifik

        // Buat objek MataPelajaranPraktikum
        MataPelajaranPraktikum mapelPraktikum = new MataPelajaranPraktikum();
        mapelPraktikum.setKode("PRK201");
        mapelPraktikum.setNama("Praktikum Fisika");
        mapelPraktikum.setGuru("Pak Budi");
        mapelPraktikum.setKategori("Praktikum");
        mapelPraktikum.setSemester(3);
        // Anda perlu mengatur field-field spesifik Praktikum sesuai kebutuhan,
        // misalnya menggunakan setter individual atau method setDataPraktikum jika Anda mempertahankannya.
        // Contoh menggunakan setter individual:
        mapelPraktikum.setDataStatus("Wajib Lulus");
        mapelPraktikum.setDataKelasAsal("XII IPA 1");
        mapelPraktikum.setDataDurasi("2 jam");
        mapelPraktikum.setDataJumlahAslab(2);
        mapelPraktikum.setDataKelas("Lab Fisika 1");
        mapelPraktikum.setDataLaporan("Ada");
        mapelPraktikum.setDataAlat("Lengkap");
        mapelPraktikum.setDataModul("Tersedia");

        // Cetak data MataPelajaranBahasa
        System.out.println("=== Mata Pelajaran Bahasa ===");
        System.out.println("Kode        : " + mapelBahasa.cetakKode());
        System.out.println("Nama        : " + mapelBahasa.cetakNama());
        System.out.println("Guru        : " + mapelBahasa.cetakGuru());
        System.out.println("Semester    : " + mapelBahasa.cetakSemester());
        System.out.println("Kategori    : " + mapelBahasa.cetakKategori());
        System.out.println("Bahasa      : " + mapelBahasa.cetakBahasa()); // Cetak field spesifik

        System.out.println();

        // Cetak data MataPelajaranPraktikum
        System.out.println("=== Mata Pelajaran Praktikum ===");
        System.out.println("Kode        : " + mapelPraktikum.cetakKode());
        System.out.println("Nama        : " + mapelPraktikum.cetakNama());
        System.out.println("Guru        : " + mapelPraktikum.cetakGuru());
        System.out.println("Semester    : " + mapelPraktikum.cetakSemester());
        System.out.println("Kategori    : " + mapelPraktikum.cetakKategori());
        System.out.println("Status      : " + mapelPraktikum.cetakStatus()); // Cetak field spesifik
        System.out.println("Kelas Asal  : " + mapelPraktikum.cetakKelasAsal());
        System.out.println("Durasi      : " + mapelPraktikum.cetakDurasi());
        System.out.println("Jumlah Aslab: " + mapelPraktikum.cetakJumlahAslab());
        System.out.println("Kelas       : " + mapelPraktikum.cetakKelas());
        System.out.println("Laporan     : " + mapelPraktikum.cetakLaporan());
        System.out.println("Alat        : " + mapelPraktikum.cetakAlat());
        System.out.println("Modul       : " + mapelPraktikum.cetakModul());
    }
}


