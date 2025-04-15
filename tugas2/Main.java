/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek menggunakan konstruktor
        MataPelajaran mapel1 = new  MataPelajaran("M101", "Matematika", "Budi Santoso", "Sains", 2);
        MataPelajaran mapel2 = new  MataPelajaran("B201", "Bahasa Inggris", "Siti Aminah", "Bahasa", 1);

        // Menampilkan informasi awal
        System.out.println("Data Awal:");
        tampilkanInfo(mapel1);
        tampilkanInfo(mapel2);

        // Mengubah data menggunakan metode setter
        mapel1.dataGuru("Dewi Lestari");
        mapel2.dataSemester(3);

        // Menampilkan informasi setelah perubahan
        System.out.println("\nSetelah Perubahan:");
        tampilkanInfo(mapel1);
        tampilkanInfo(mapel2);
    }

    // Fungsi untuk menampilkan informasi mata pelajaran
    static void tampilkanInfo( MataPelajaran mapel) {
        System.out.println("Kode: " + mapel.cetakKode());
        System.out.println("Nama: " + mapel.cetakNama());
        System.out.println("Guru: " + mapel.cetakGuru());
        System.out.println("Kategori: " + mapel.cetakKategori());
        System.out.println("Semester: " + mapel.cetakSemester());
        System.out.println();
    }
}
