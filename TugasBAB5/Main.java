/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBAB5;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari class MataPelajaranPraktikum
        MataPelajaranPraktikum praktikum = new MataPelajaranPraktikum();

        // ✅ MENGGUNAKAN METHOD OVERLOADING

        // Mengatur durasi praktikum dengan jam mulai dan selesai (overload)
        praktikum.setDurasi("08:00", "10:00");

        // Mengatur jumlah asisten laboratorium menggunakan angka (overload)
        praktikum.setJumlahAslab(3);

        // Mengatur nama kelas dan asal kelas sekaligus (overload)
        praktikum.setKelas("XII IPA 1", "XI IPA 2");

        // ✅ MENGISI NILAI SYARAT PRAKTIKUM

        // Menandai bahwa laporan sudah lengkap
        praktikum.setLaporan("✓");

        // Menandai bahwa alat praktikum sudah lengkap
        praktikum.setAlat("✓");

        // Menandai bahwa modul praktikum sudah lengkap
        praktikum.setModul("✓");

        // ✅ MENENTUKAN STATUS OTOMATIS BERDASARKAN SYARAT
        praktikum.setStatusOtomatis();

        // ✅ MENAMPILKAN DATA YANG SUDAH DIISI

        System.out.println("Durasi Praktikum     : " + praktikum.cetakDurasi());
        System.out.println("Jumlah Aslab         : " + praktikum.cetakJumlahAslab());
        System.out.println("Kelas                : " + praktikum.cetakKelas());
        System.out.println("Asal Kelas           : " + praktikum.cetakKelasAsal());
        System.out.println("Status Laporan       : " + praktikum.cetakLaporan());
        System.out.println("Status Alat          : " + praktikum.cetakAlat());
        System.out.println("Status Modul         : " + praktikum.cetakModul());
        System.out.println("Status Praktikum     : " + praktikum.cetakStatus());

        // ✅ MENAMPILKAN HASIL OVERRIDING
        // Menggunakan method cetakKategori() yang sudah dioverride di subclass
        System.out.println("Kategori Mata Pelajaran : " + praktikum.cetakKategori());
    }
}

