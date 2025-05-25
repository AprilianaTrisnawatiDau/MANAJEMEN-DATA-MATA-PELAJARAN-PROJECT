/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASBAB9;
public class MataPelajaranBahasa extends ManajemenMapel implements OperasiTambahanMapel {

    // Atribut khusus yang hanya dimiliki oleh mata pelajaran bahasa
    private String dataJam, dataKelas, dataTingkat, dataMateri, dataBahasa;

    // =========================== POLIMORFISME (OVERRIDING) ===========================
    // Mengubah (override) method dari superclass ManajemenMapel untuk menyetel kode
    @Override
    public void setKode(String kode) {
        this.kode = kode;
    }

    // Mengubah (override) method untuk menyetel nama guru
    @Override
    public void setGuru(String guru) {
        this.guru = guru;
    }

    // Mengubah (override) method untuk menyetel kategori
    @Override
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    // Mengubah (override) method untuk menyetel semester
    @Override
    public void setSemester(int semester) {
        this.semester = semester;
    }

    // ========================= ENKAPSULASI (SETTER KHUSUS) ==========================
    // Method untuk mengatur jam pelajaran bahasa
    @Override
    public void setDataJam(String jam) {
        this.dataJam = jam;
    }

    // Method untuk mengatur nama kelas (contoh: X IPA 1)
    @Override
    public void setDataKelas(String kelas) {
        this.dataKelas = kelas;
    }

    // Method untuk mengatur tingkat kelas (contoh: X, XI, XII)
    @Override
    public void setDataTingkat(String tingkat) {
        this.dataTingkat = tingkat;
    }

    // Method untuk mengatur materi pelajaran
    @Override
    public void setDataMateri(String materi) {
        this.dataMateri = materi;
    }

    // Method untuk mengatur jenis bahasa (contoh: Inggris, Jepang)
    @Override
    public void setBahasa(String bahasa) {
        this.dataBahasa = bahasa;
    }

    // Implementasi kosong untuk metode OperasiTambahanMapel yang tidak relevan dengan MataPelajaranBahasa
    @Override
    public void setDataStatus(String status) { /* Not applicable for Bahasa */ }
    @Override
    public void setDataKelasAsal(String kelasAsal) { /* Not applicable for Bahasa */ }
    @Override
    public void setDataDurasi(String durasi) { /* Not applicable for Bahasa */ }
    @Override
    public void setDataJumlahAslab(int jumlahAslab) { /* Not applicable for Bahasa */ }
    @Override
    public void setDataLaporan(String laporan) { /* Not applicable for Bahasa */ }
    @Override
    public void setDataAlat(String alat) { /* Not applicable for Bahasa */ }
    @Override
    public void setDataModul(String modul) { /* Not applicable for Bahasa */ }

    // ============================== ENKAPSULASI (GETTER) ============================
    // Method untuk mencetak jam pelajaran
    @Override
    public String cetakJam() {
        return dataJam;
    }

    // Method untuk mencetak kelas
    @Override
    public String cetakKelas() {
        return dataKelas;
    }

    // Method untuk mencetak tingkat
    @Override
    public String cetakTingkat() {
        return dataTingkat;
    }

    // Method untuk mencetak materi
    @Override
    public String cetakMateri() {
        return dataMateri;
    }

    // Method untuk mencetak bahasa
    @Override
    public String cetakBahasa() {
        return dataBahasa;
    }

    // Implementasi kosong untuk metode OperasiTambahanMapel yang tidak relevan dengan MataPelajaranBahasa
    @Override
    public String cetakStatus() { return null; }
    @Override
    public String cetakKelasAsal() { return null; }
    @Override
    public String cetakDurasi() { return null; }
    @Override
    public int cetakJumlahAslab() { return 0; }
    @Override
    public String cetakLaporan() { return null; }
    @Override
    public String cetakAlat() { return null; }
    @Override
    public String cetakModul() { return null; }

    // =========================== POLIMORFISME (OVERRIDING) ==========================
    // Mengubah (override) method cetakKode dari superclass
    @Override
    public String cetakKode() {
        return kode;
    }

    // Mengubah (override) method cetakNama agar menambahkan label [Bahasa]
    @Override
    public String cetakNama() {
        return nama;
    }

    // Mengubah (override) method cetakGuru
    @Override
    public String cetakGuru() {
        return guru;
    }

    // Mengubah (override) method cetakKategori
    @Override
    public String cetakKategori() {
        return kategori;
    }

    // Mengubah (override) method cetakSemester
    @Override
    public int cetakSemester() {
        return semester;
    }
}