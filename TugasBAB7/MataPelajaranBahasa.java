/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBAB7;

    public class MataPelajaranBahasa extends ManajemenMapel {
    private String dataJam, dataKelas, dataTingkat, dataMateri, dataBahasa;

    @Override
    void setKode(String kode) {
        this.kode = kode;
    }

    @Override
    void setGuru(String guru) {
        this.guru = guru;
    }

    @Override
    void setKategori(String kategori) {
        this.kategori = kategori;
    }

    @Override
    void setSemester(int semester) {
        this.semester = semester;
    }

    // Method setter tambahan untuk atribut-atribut khusus kelas ini
    public void setDataJam(String jam) {
        this.dataJam = jam; // Menyimpan waktu pelajaran
    }

    public void setDataKelas(String kelas) {
        this.dataKelas = kelas; // Menyimpan nama kelas (misalnya X IPA 1)
    }

    public void setDataTingkat(String tingkat) {
        this.dataTingkat = tingkat; // Menyimpan tingkat kelas (misalnya X, XI, XII)
    }

    public void setDataMateri(String materi) {
        this.dataMateri = materi; // Menyimpan materi yang diajarkan
    }

    public void setBahasa(String bahasa) {
        this.dataBahasa = bahasa; // Menyimpan jenis bahasa (misalnya Bahasa Inggris, Jepang)
    }

    // Method getter tambahan untuk mengambil data atribut tambahan
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

    // Overriding (Dynamic Polymorphism)
    @Override
    String cetakKode() {
        return kode;
    }

    @Override
    String cetakNama() {
        return nama;
    }

    @Override
    String cetakGuru() {
        return guru;
    }

    @Override
    String cetakKategori() {
        return kategori;
    }

    @Override
    int cetakSemester() {
        return semester;
    }
}
