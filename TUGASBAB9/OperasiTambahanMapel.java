/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TUGASBAB9;
public interface OperasiTambahanMapel {
  
    void setDataJam(String jam);
    void setDataKelas(String kelas);
    void setDataTingkat(String tingkat);
    void setDataMateri(String materi);
    void setBahasa(String bahasa);

    String cetakJam();
    String cetakKelas();
    String cetakTingkat();
    String cetakMateri();
    String cetakBahasa();

    // Metode untuk MataPelajaranPraktikum
    void setDataStatus(String status);
    void setDataKelasAsal(String kelasAsal);
    void setDataDurasi(String durasi);
    void setDataJumlahAslab(int jumlahAslab);
    void setDataLaporan(String laporan);
    void setDataAlat(String alat);
    void setDataModul(String modul);

    String cetakStatus();
    String cetakKelasAsal();
    String cetakDurasi();
    int cetakJumlahAslab();
    String cetakLaporan();
    String cetakAlat();
    String cetakModul();
}
