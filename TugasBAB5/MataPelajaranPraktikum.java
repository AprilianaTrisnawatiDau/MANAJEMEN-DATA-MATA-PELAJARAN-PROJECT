    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package TugasBAB5;
    public class MataPelajaranPraktikum extends ManajemenMapel {
    // Deklarasi variabel-variabel khusus untuk praktikum
    String dataDurasi;
    String dataJumlahAslab;
    String dataKelas;
    String dataLaporan;
    String dataAlat;
    String dataModul;
    String dataStatus;
    String kelasAsal;

    // Method setter untuk durasi praktikum
    void setDurasi(String text) { dataDurasi = text; }

    // Method setter untuk jumlah aslab (dalam bentuk teks)
    void setJumlahAslab(String text) { dataJumlahAslab = text; }

    // Method setter untuk kelas yang mengikuti praktikum
    void setKelas(String text) { dataKelas = text; }

    // Method setter untuk status laporan
    void setLaporan(String text) { dataLaporan = text; }

    // Method setter untuk status alat
    void setAlat(String text) { dataAlat = text; }

    // Method setter untuk status modul
    void setModul(String text) { dataModul = text; }

    // Method setter untuk kelas asal siswa
    void setKelasAsal(String text) { kelasAsal = text; }

    // ✅ OVERLOADING METHODS:
    
    // Overloading setDurasi → menerima jam mulai dan selesai
    void setDurasi(String mulai, String selesai) {
        dataDurasi = "Durasi: " + mulai + " - " + selesai; // Format gabungan durasi
    }

    // Overloading setJumlahAslab → menerima jumlah dalam bentuk angka (int)
    void setJumlahAslab(int jumlah) {
        dataJumlahAslab = jumlah + " Asisten Lab"; // Konversi ke bentuk string
    }

    // Overloading setKelas → menerima nama kelas dan asal kelas sekaligus
    void setKelas(String kelas, String asal) {
        dataKelas = kelas;
        kelasAsal = asal;
    }

    // ✅ OVERRIDING METHOD:
    
    // Override method dari superclass untuk mencetak kategori yang lebih spesifik
    @Override
    String cetakKategori() {
        return "Kategori Praktikum - Harus Lolos Syarat"; // Tambahan aturan untuk praktikum
    }

    // Method logika otomatis untuk menentukan status praktikum berdasarkan syarat
    void setStatusOtomatis() {
        int jumlahSyarat = 0; // Inisialisasi jumlah syarat yang dipenuhi

        // Cek apakah laporan, alat, dan modul sudah dicentang (✓)
        if ("✓".equals(dataLaporan)) jumlahSyarat++;
        if ("✓".equals(dataAlat)) jumlahSyarat++;
        if ("✓".equals(dataModul)) jumlahSyarat++;

        // Logika penentuan status berdasarkan jumlah syarat
        if (jumlahSyarat == 1 || jumlahSyarat == 2) {
            dataStatus = "Praktikum Dilarang"; // Jika hanya 1 atau 2 syarat terpenuhi
        } else if (jumlahSyarat == 3) {
            dataStatus = "PRAKTIKUM DAPAT DILAKUKAN"; // Jika semua syarat terpenuhi
        } else {
            dataStatus = "BELUM MEMENUHI SYARAT"; // Jika belum ada yang terpenuhi
        }
    }

    // GETTER METHODS

    // Mengembalikan nilai durasi praktikum
    String cetakDurasi() { return dataDurasi; }

    // Mengembalikan jumlah aslab
    String cetakJumlahAslab() { return dataJumlahAslab; }

    // Mengembalikan nama kelas
    String cetakKelas() { return dataKelas; }

    // Mengembalikan status laporan
    String cetakLaporan() { return dataLaporan; }

    // Mengembalikan status alat
    String cetakAlat() { return dataAlat; }

    // Mengembalikan status modul
    String cetakModul() { return dataModul; }

    // Mengembalikan hasil penilaian status akhir praktikum
    String cetakStatus() { return dataStatus; }

    // Mengembalikan asal kelas siswa
    String cetakKelasAsal() { return kelasAsal; }
}
