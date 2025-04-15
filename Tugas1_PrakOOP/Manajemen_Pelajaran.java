/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1_PrakOOP;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Manajemen_Pelajaran {
    public static void main(String[] args) {
        // Membuat objek MataPelajaran dengan kategori
        MataPelajaran mp1 = new MataPelajaran("MP001", "Matematika", "Pak Budi", "Sains");
        MataPelajaran mp2 = new MataPelajaran("MP002", "IPA", "Bu Ani", "Sains");
        MataPelajaran mp3 = new MataPelajaran("MP003", "Sejarah", "Pak Joko", "Humaniora");

        // Menampilkan daftar mata pelajaran
        System.out.println("\n===== Daftar Mata Pelajaran =====");
        mp1.tampilkanInfo();
        mp2.tampilkanInfo();
        mp3.tampilkanInfo();
    }
}