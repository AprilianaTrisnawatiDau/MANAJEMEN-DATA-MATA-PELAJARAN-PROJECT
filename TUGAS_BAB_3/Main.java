/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_BAB_3;
public class Main {
    public static void main(String[] args) {
        MataPelajaranPraktikum praktikum = new MataPelajaranPraktikum("P001", "Fisika", "Pak Budi", "Kelas Praktikum", 3, "Lab Praktikum", 2);
        MataPelajaranBahasa bahasa = new MataPelajaranBahasa("B001", "Bahasa Inggris", "Bu Ani", "Kelas Bahasa", 2, "Inggris", "Menengah");

        System.out.println("Informasi  KELAS Praktikum:");
        praktikum.tampilkanInfo();

        System.out.println("\nInformasi KELAS Bahasa:");
        bahasa.tampilkanInfo();
    }
}

