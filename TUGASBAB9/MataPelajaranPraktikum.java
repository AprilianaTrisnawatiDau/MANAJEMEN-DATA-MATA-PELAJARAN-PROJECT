/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASBAB9;
public class MataPelajaranPraktikum extends ManajemenMapel implements OperasiTambahanMapel {

    // Atribut tambahan khusus yang berkaitan dengan mata kuliah praktikum
    private String status, kelasAsal, durasi, kelas, laporan, alat, modul;
    private int jumlahAslab;

    // ======================= POLIMORFISME DINAMIS (OVERRIDING) =========================
    // Mengoverride method setKode dari kelas induk
    @Override
    public void setKode(String kode) {
        this.kode = kode;
    }

    // Mengoverride method setGuru dari kelas induk
    @Override
    public void setGuru(String guru) {
        this.guru = guru;
    }

    // Mengoverride method setKategori dari kelas induk
    @Override
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    // Mengoverride method setSemester dari kelas induk
    @Override
    public void setSemester(int semester) {
        this.semester = semester;
    }

    // ============================= SETTER TAMBAHAN =====================================
    // Method untuk menyetel status praktikum (aktif/tidak aktif)
    @Override
    public void setDataStatus(String status) {
        this.status = status;
    }

    // Method untuk menyetel kelas asal mahasiswa praktikum
    @Override
    public void setDataKelasAsal(String kelasAsal) {
        this.kelasAsal = kelasAsal;
    }

    // Method untuk menyetel durasi waktu praktikum
    @Override
    public void setDataDurasi(String durasi) {
        this.durasi = durasi;
    }

    // Method untuk menyetel jumlah asisten laboratorium
    @Override
    public void setDataJumlahAslab(int jumlahAslab) {
        this.jumlahAslab = jumlahAslab;
    }

    // Method untuk menyetel nama kelas praktikum
    @Override
    public void setDataKelas(String kelas) {
        this.kelas = kelas;
    }

    // Method untuk menyetel format laporan praktikum
    @Override
    public void setDataLaporan(String laporan) {
        this.laporan = laporan;
    }

    // Method untuk menyetel alat yang digunakan dalam praktikum
    @Override
    public void setDataAlat(String alat) {
        this.alat = alat;
    }

    // Method untuk menyetel modul praktikum
    @Override
    public void setDataModul(String modul) {
        this.modul = modul;
    }

    // Implementasi kosong untuk metode OperasiTambahanMapel yang tidak relevan dengan MataPelajaranPraktikum
    @Override
    public void setDataJam(String jam) { /* Not applicable for Praktikum */ }
    @Override
    public void setDataTingkat(String tingkat) { /* Not applicable for Praktikum */ }
    @Override
    public void setDataMateri(String materi) { /* Not applicable for Praktikum */ }
    @Override
    public void setBahasa(String bahasa) { /* Not applicable for Praktikum */ }


    // ============================= GETTER TAMBAHAN =====================================
    // Method untuk mencetak status praktikum
    @Override
    public String cetakStatus() {
        return status;
    }

    // Method untuk mencetak kelas asal
    @Override
    public String cetakKelasAsal() {
        return kelasAsal;
    }

    // Method untuk mencetak durasi praktikum
    @Override
    public String cetakDurasi() {
        return durasi;
    }

    // Method untuk mencetak jumlah aslab
    @Override
    public int cetakJumlahAslab() {
        return jumlahAslab;
    }

    // Method untuk mencetak kelas
    @Override
    public String cetakKelas() {
        return kelas;
    }

    // Method untuk mencetak laporan
    @Override
    public String cetakLaporan() {
        return laporan;
    }

    // Method untuk mencetak alat
    @Override
    public String cetakAlat() {
        return alat;
    }

    // Method untuk mencetak modul
    @Override
    public String cetakModul() {
        return modul;
    }

    // Implementasi kosong untuk metode OperasiTambahanMapel yang tidak relevan dengan MataPelajaranPraktikum
    @Override
    public String cetakJam() { return null; }
    @Override
    public String cetakTingkat() { return null; }
    @Override
    public String cetakMateri() { return null; }
    @Override
    public String cetakBahasa() { return null; }

    // ======================= POLIMORFISME DINAMIS (OVERRIDING) =========================
    // Override method cetakKode dari superclass
    @Override
    public String cetakKode() {
        return kode;
    }

    // Override method cetakNama untuk menambahkan label [Praktikum]
    @Override
    public String cetakNama() {
        return nama;
    }

    // Override method cetakGuru dari superclass
    @Override
    public String cetakGuru() {
        return guru;
    }

    // Override method cetakKategori dari superclass
    @Override
    public String cetakKategori() {
        return kategori;
    }

    // Override method cetakSemester dari superclass
    @Override
    public int cetakSemester() {
        return semester;
    }
}