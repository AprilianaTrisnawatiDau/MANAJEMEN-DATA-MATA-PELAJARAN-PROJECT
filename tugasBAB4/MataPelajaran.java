/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package tugasBAB4;

    /**
     *
     * @author LENOVO
     */
    public class MataPelajaran {
        private String kode;      // Menyimpan kode mata pelajaran
        private String nama;      // Menyimpan nama mata pelajaran
        private String guru;      // Menyimpan nama guru pengampu
        private String kategori;  // Menyimpan kategori mata pelajaran
        private int semester;     // Menyimpan informasi semester

        // Konstruktor untuk menginisialisasi objek MataPelajaran dengan nilai awal
        public MataPelajaran(String kode, String nama, String guru, String kategori, int semester) {
            this.kode = kode;           // Inisialisasi atribut kode
            this.nama = nama;           // Inisialisasi atribut nama
            this.guru = guru;           // Inisialisasi atribut guru
            this.kategori = kategori;   // Inisialisasi atribut kategori
            this.semester = semester;   // Inisialisasi atribut semester
        }

        // Setter (mutator) untuk mengubah nilai kode
        public void setKode(String kode) {
            this.kode = kode;           // Mengatur nilai baru untuk kode
        }

        // Setter untuk mengubah nilai nama
        public void setNama(String nama) {
            this.nama = nama;           // Mengatur nilai baru untuk nama
        }

        // Setter untuk mengubah nilai guru
        public void setGuru(String guru) {
            this.guru = guru;           // Mengatur nilai baru untuk guru
        }

        // Setter untuk mengubah nilai kategori
        public void setKategori(String kategori) {
            this.kategori = kategori;   // Mengatur nilai baru untuk kategori
        }

        // Setter untuk mengubah nilai semester
        public void setSemester(int semester) {
            this.semester = semester;   // Mengatur nilai baru untuk semester
        }

        // Getter (accessor) untuk mengambil nilai kode
        public String getKode() {
            return this.kode;           // Mengembalikan nilai kode
        }

        // Getter untuk mengambil nilai nama
        public String getNama() {
            return this.nama;           // Mengembalikan nilai nama
        }

        // Getter untuk mengambil nilai guru
        public String getGuru() {
            return this.guru;           // Mengembalikan nilai guru
        }

        // Getter untuk mengambil nilai kategori
        public String getKategori() {
            return this.kategori;       // Mengembalikan nilai kategori
        }

        // Getter untuk mengambil nilai semester
        public int getSemester() {
            return this.semester;       // Mengembalikan nilai semester
        }

        // Metode untuk menampilkan informasi lengkap dari objek MataPelajaran
        public void tampilkanInfo() {
            System.out.println("Kode: " + getKode());         // Menampilkan kode mata pelajaran
            System.out.println("Nama: " + getNama());         // Menampilkan nama mata pelajaran
            System.out.println("Guru: " + getGuru());         // Menampilkan nama guru
            System.out.println("Kategori: " + getKategori()); // Menampilkan kategori mata pelajaran
            System.out.println("Semester: " + getSemester()); // Menampilkan semester
        }
    }
