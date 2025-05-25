/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBAB8;
public class MataPelajaranPraktikum extends ManajemenMapel {
    // Atribut tambahan khusus untuk matkul praktikum
    private String status, kelasAsal, durasi, kelas, laporan, alat, modul;
    private int jumlahAslab;

    // Implementasi metode abstrak dari superclass (polimorfisme dinamis)
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

    // Method setter tambahan khusus praktikum
    public void setDataStatus(String status) {
        this.status = status;
    }

    public void setDataKelasAsal(String kelasAsal) {
        this.kelasAsal = kelasAsal;
    }

    public void setDataDurasi(String durasi) {
        this.durasi = durasi;
    }

    public void setDataJumlahAslab(int jumlahAslab) {
        this.jumlahAslab = jumlahAslab;
    }

    public void setDataKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setDataLaporan(String laporan) {
        this.laporan = laporan;
    }

    public void setDataAlat(String alat) {
        this.alat = alat;
    }

    public void setDataModul(String modul) {
        this.modul = modul;
    }

    // Method getter tambahan
    public String cetakStatus() { return status; }
    public String cetakKelasAsal() { return kelasAsal; }
    public String cetakDurasi() { return durasi; }
    public int cetakJumlahAslab() { return jumlahAslab; }
    public String cetakKelas() { return kelas; }
    public String cetakLaporan() { return laporan; }
    public String cetakAlat() { return alat; }
    public String cetakModul() { return modul; }

    // Overriding method dari superclass (polimorfisme dinamis)
    @Override
    String cetakKode() { return kode; }

    @Override
    String cetakNama() {
        return nama;
    }

    @Override
    String cetakGuru() { return guru; }
    @Override
    String cetakKategori() { return kategori; }
    @Override
    int cetakSemester() { return semester; }
}