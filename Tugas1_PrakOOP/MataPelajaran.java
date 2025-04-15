/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1_PrakOOP;
/**
 *
 * @author LENOVO
 */
// Kelas MataPelajaran merepresentasikan mata pelajaran dengan kode, nama, guru, dan kategori
public class MataPelajaran {
   
    // Atribut untuk menyimpan informasi mata pelajaran
    String kode;     // Kode mata pelajaran
    String nama;     // Nama mata pelajaran
    String guru;     // Nama guru yang mengajar mata pelajaran
    String kategori; // Kategori mata pelajaran (misal: Sains, Humaniora, Bahasa, dll.)

    // Konstruktor untuk menginisialisasi objek MataPelajaran
    MataPelajaran(String k, String n, String g, String kat) {
        kode = k;       // Menetapkan nilai kode mata pelajaran
        nama = n;       // Menetapkan nama mata pelajaran
        guru = g;       // Menetapkan nama guru pengajar
        kategori = kat; // Menetapkan kategori mata pelajaran
    }

    // Metode untuk menampilkan informasi mata pelajaran
    void tampilkanInfo() {
        System.out.println(kode + " - " + nama + " (Guru: " + guru + ") | Kategori: " + kategori);
    }
}
