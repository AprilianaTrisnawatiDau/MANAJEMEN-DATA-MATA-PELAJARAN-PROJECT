/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASBAB6;
public class MataPelajaranPraktikum extends ManajemenMapel {
    private String dataStatus;
    private String dataKelasAsal;
    private String dataDurasi;
    private int dataJumlahAslab;
    private String dataKelas;
    private String dataLaporan;
    private String dataAlat;
    private String dataModul;

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

    // Setter baru (individual)
    public void setDataStatus(String status) {
        this.dataStatus = status;
    }

    public void setDataKelasAsal(String kelasAsal) {
        this.dataKelasAsal = kelasAsal;
    }

    public void setDataDurasi(String durasi) {
        this.dataDurasi = durasi;
    }

    public void setDataJumlahAslab(int jumlahAslab) {
        this.dataJumlahAslab = jumlahAslab;
    }

    public void setDataKelas(String kelas) {
        this.dataKelas = kelas;
    }

    public void setDataLaporan(String laporan) {
        this.dataLaporan = laporan;
    }

    public void setDataAlat(String alat) {
        this.dataAlat = alat;
    }

    public void setDataModul(String modul) {
        this.dataModul = modul;
    }

    // Getter tambahan yang dibutuhkan tabel
    public String cetakKelasAsal() {
        return dataKelasAsal;
    }

    public String cetakDurasi() {
        return dataDurasi;
    }

    public int cetakJumlahAslab() {
        return dataJumlahAslab;
    }

    public String cetakKelas() {
        return dataKelas;
    }

    public String cetakLaporan() {
        return dataLaporan;
    }

    public String cetakAlat() {
        return dataAlat;
    }

    public String cetakModul() {
        return dataModul;
    }

    public String cetakStatus() {
        return dataStatus;
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