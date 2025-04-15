/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBAB5;
public class MataPelajaranBahasa extends ManajemenMapel {
    // Variabel tambahan khusus untuk mata pelajaran bahasa
    String dataJam;
    String dataKelas;
    String Inggris;
    String Jepang;
    String dataTingkat;
    String dataMateri;
    String dataKategori; // ini akan override dari superclass
    String databahasa;

    // Setter metode untuk masing-masing variabel
    void setDataJam(String text) { dataJam = text; }                // Menyimpan jam pelajaran
    void setDataKelas(String text) { dataKelas = text; }            // Menyimpan nama kelas
    void setInggris(String text) { Inggris = text; }                // Menyimpan materi bahasa Inggris
    void setJepang(String text) { Jepang = text; }                  // Menyimpan materi bahasa Jepang
    void setDataTingkat(String text) { dataTingkat = text; }        // Menyimpan tingkat pelajaran (misal: dasar/lanjutan)
    void setDataMateri(String text) { dataMateri = text; }          // Menyimpan judul/topik materi
    void setbahasa(String text) { databahasa = text; }              // Menyimpan jenis bahasa
    public void setDataGuru(String text) { dataGuru = text; }       // Override: Menyimpan nama guru (mengakses langsung dataGuru dari superclass)

    // Getter metode untuk masing-masing data
    String cetakJam() { return dataJam; }
    String cetakKelas() { return dataKelas; }
    String cetakInggris() { return Inggris; }
    String cetakJepang() { return Jepang; }
    String cetakTingkat() { return dataTingkat; }
    String cetakMateri() { return dataMateri; }
    String cetakbahasa() { return databahasa; }

    // ✅ OVERRIDING:
    // Override method dari superclass untuk mencetak kategori
    @Override
    String cetakKategori() {
        return "Kategori Bahasa: " + databahasa;  // Menambahkan label kategori khusus untuk bahasa
    }

    // ✅ OVERLOADING:
    // Overload untuk setbahasa dengan pilihan tingkat
    void setbahasa(String text, String tingkat) {
        databahasa = text + " - Tingkat " + tingkat;
    }

    // Overload untuk setMateri dengan tambahan topik
    void setDataMateri(String materi, String topik) {
        dataMateri = materi + " (Topik: " + topik + ")";
    }

    // Overload untuk setJam dengan format jam mulai dan selesai
    void setDataJam(String mulai, String selesai) {
        dataJam = "Jam " + mulai + " - " + selesai;
    }
}
