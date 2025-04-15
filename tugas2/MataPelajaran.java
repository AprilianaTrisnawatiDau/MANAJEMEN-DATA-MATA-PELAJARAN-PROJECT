/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

import java.util.Scanner;
    
public class MataPelajaran {
    public String kode, nama, guru, kategori;
    public int semester;

    // Konstruktor untuk menginisialisasi objek MataPelajaran
    public MataPelajaran(String k, String n, String g, String kat, int s) {
        this.kode = k;
        this.nama = n;
        this.guru = g;
        this.kategori = kat;
        this.semester = s;
    }

    void dataKode(String k) {
        this.kode = k;
    }

    void dataNama(String n) {
        this.nama = n;
    }

    void dataGuru(String g) {
        this.guru = g;
    }

    void dataKategori(String kat) {
        this.kategori = kat;
    }

    void dataSemester(int s) {
        this.semester = s;
    }

    String cetakKode() {
        return this.kode;
    }

    String cetakNama() {
        return this.nama;
    }

    String cetakGuru() {
        return this.guru;
    }

    String cetakKategori() {
        return this.kategori;
    }

    int cetakSemester() {
        return this.semester;
    }
}
