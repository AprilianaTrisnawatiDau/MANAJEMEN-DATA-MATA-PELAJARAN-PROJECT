/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_BAB_3;

/**
 *
 * @author LENOVO
 */
public class MataPelajaranPraktikum extends MataPelajaran {
    public String laboratorium;
    public int jumlahAsisten;

    public MataPelajaranPraktikum(String k, String n, String g, String kat, int s, String lab, int asisten) {
        super(k, n, g, kat, s); // Memanggil konstruktor parent class
        this.laboratorium = lab;
        this.jumlahAsisten = asisten;
    }

    public void dataLaboratorium(String lab) {
        this.laboratorium = lab;
    }

    public void dataJumlahAsisten(int asisten) {
        this.jumlahAsisten = asisten;
    }

    public String cetakLaboratorium() {
        return this.laboratorium;
    }

    public int cetakJumlahAsisten() {
        return this.jumlahAsisten;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil metode parent class
        System.out.println("Laboratorium: " + laboratorium);
        System.out.println("Jumlah Asisten: " + jumlahAsisten);
    }
}
 
    

