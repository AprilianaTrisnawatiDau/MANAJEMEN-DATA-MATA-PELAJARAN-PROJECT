/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBAB5;
    public class ManajemenMapel {
    // Mendeklarasikan variabel untuk menyimpan data mata pelajaran
    String dataKode;     // Kode mata pelajaran
    String dataNama;     // Nama mata pelajaran
    String dataGuru;     // Nama guru pengajar
    String dataKategori; // Kategori mata pelajaran (misal: wajib atau pilihan)
    int dataSemester;    // Semester mata pelajaran
    
    // Setter untuk dataKode (Overloading: satu parameter string)
    void dataKode(String text) { 
        dataKode = text; 
    }
    
    // Setter untuk dataKode (Overloading: dua parameter, satu boolean untuk menambahkan prefix)
    void dataKode(String kode, boolean prefix) {
        dataKode = (prefix ? "KODE-" : "") + kode; 
    }
    
    // Setter untuk dataNama (satu parameter)
    void dataNama(String text) { 
        dataNama = text; 
    }
    
    // Setter untuk dataNama (Overloading: dua parameter untuk nama depan dan belakang)
    void dataNama(String depan, String belakang) {
        dataNama = depan + " " + belakang; // Menggabungkan nama depan dan belakang
    }
    
    // Setter untuk dataGuru
    void dataGuru(String text) { 
        dataGuru = text; 
    }
    
    // Setter untuk dataKategori (satu parameter)
    void dataKategori(String text) { 
        dataKategori = text; 
    }
    
    // Setter untuk dataKategori (Overloading: menambahkan parameter boolean untuk mengubah case)
    void dataKategori(String text, boolean upper) {
        dataKategori = upper ? text.toUpperCase() : text.toLowerCase(); // Mengubah teks menjadi huruf besar atau kecil berdasarkan nilai upper
    }
    
    // Setter untuk dataSemester
    void dataSemester(int text) { 
        dataSemester = text; 
    }
    
    // Getter untuk dataKode
    String cetakKode() { 
        return dataKode; 
    }
    
    // Getter untuk dataNama
    String cetakNama() { 
        return dataNama; 
    }
    
    // Getter untuk dataGuru
    String cetakGuru() { 
        return dataGuru; 
    }
    
    // Getter untuk dataKategori
    String cetakKategori() { 
        return dataKategori; 
    }
    
    // Getter untuk dataSemester
    int cetakSemester() { 
        return dataSemester; 
    }
}
