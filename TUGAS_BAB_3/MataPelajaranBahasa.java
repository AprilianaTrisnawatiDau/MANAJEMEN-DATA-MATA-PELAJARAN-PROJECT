/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_BAB_3;

/**
 *
 * @author LENOVO
 */
public class MataPelajaranBahasa extends MataPelajaran {
    public String bahasa;
    public String tingkatKesulitan;

    public MataPelajaranBahasa(String k, String n, String g, String kat, int s, String bahasa, String tingkat) {
        super(k, n, g, kat, s); // Memanggil konstruktor parent class
        this.bahasa = bahasa;
        this.tingkatKesulitan = tingkat;
    }

    public void dataBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public void dataTingkatKesulitan(String tingkat) {
        this.tingkatKesulitan = tingkat;
    }

    public String cetakBahasa() {
        return this.bahasa;
    }

    public String cetakTingkatKesulitan() {
        return this.tingkatKesulitan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil metode parent class
        System.out.println("Bahasa: " + bahasa);
        System.out.println("Tingkat Kesulitan: " + tingkatKesulitan);
    }
}
    

