/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASBAB6;
public class MataPelajaranBahasa extends ManajemenMapel {
    private String dataJam, dataKelas, dataTingkat, dataMateri, dataBahasa;

    // Override setter dari ManajemenMapel
    @Override
    void setKode(String kode) {
        this.dataKode = kode;
    }

    @Override
    void setNama(String nama) {
        this.dataNama = nama;
    }

    @Override
    void setGuru(String guru) {
        this.dataGuru = guru;
    }

    @Override
    void setKategori(String kategori) {
        this.dataKategori = kategori;
    }

    @Override
    void setSemester(int semester) {
        this.dataSemester = semester;
    }

    // Setter tambahan
    public void setDataJam(String jam) {
        this.dataJam = jam;
    }

    public void setDataKelas(String kelas) {
        this.dataKelas = kelas;
    }

    public void setDataTingkat(String tingkat) {
        this.dataTingkat = tingkat;
    }

    public void setDataMateri(String materi) {
        this.dataMateri = materi;
    }

    public void setBahasa(String bahasa) {
        this.dataBahasa = bahasa;
    }

    // Getter tambahan
    public String cetakJam() {
        return dataJam;
    }

    public String cetakKelas() {
        return dataKelas;
    }

    public String cetakTingkat() {
        return dataTingkat;
    }

    public String cetakMateri() {
        return dataMateri;
    }

    public String cetakBahasa() {
        return dataBahasa;
    }

    // Override getter dari ManajemenMapel
    @Override
    String cetakKode() {
        return dataKode;
    }

    @Override
    String cetakNama() {
        return dataNama;
    }

    @Override
    String cetakGuru() {
        return dataGuru;
    }

    @Override
    String cetakKategori() {
        return dataKategori;
    }

    @Override
    int cetakSemester() {
        return dataSemester;
    }
}