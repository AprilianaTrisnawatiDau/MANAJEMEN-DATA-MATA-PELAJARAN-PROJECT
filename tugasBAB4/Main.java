/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasBAB4;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        MataPelajaranBahasa bahasaInggris = new MataPelajaranBahasa("B001", "Bahasa Inggris", "Bu Rina", "Bahasa", 2, "Inggris", "Menengah");
        MataPelajaranPraktikum fisikaLab = new MataPelajaranPraktikum("P002", "Praktikum Fisika", "Pak Budi", "Sains", 3, "Lab Fisika", 2);
        
        System.out.println("Informasi Mata Pelajaran Bahasa:");
        bahasaInggris.tampilkanInfo();
        
        System.out.println("\nInformasi Mata Pelajaran Praktikum:");
        fisikaLab.tampilkanInfo();
    }
}
