/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASBAB9;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        try {
            // ================== INPUT MATA PELAJARAN BAHASA ==================
            System.out.println("=== Input Data Mata Pelajaran Bahasa ===");
            // Membuat objek MataPelajaranBahasa
            MataPelajaranBahasa bahasa = new MataPelajaranBahasa();

            // Meminta input kode mata pelajaran
            System.out.print("Kode: ");
            bahasa.setKode(input.nextLine());

            // Meminta input nama mata pelajaran utama
            System.out.print("Nama: ");
            String namaBahasa = input.nextLine();

            // Meminta input tambahan nama (opsional)
            System.out.print("Tambahan Nama (Opsional, tekan Enter jika tidak ada): ");
            String tambahanBahasa = input.nextLine();

            // Jika ada tambahan nama, panggil setNama dengan dua parameter
            if (!tambahanBahasa.isEmpty()) {
                bahasa.setNama(namaBahasa, tambahanBahasa);
            } else {
                // Jika tidak ada tambahan nama, panggil setNama dengan satu parameter
                bahasa.setNama(namaBahasa);
            }

            // Meminta input nama guru pengajar
            System.out.print("Guru: ");
            bahasa.setGuru(input.nextLine());

            // Meminta input kategori mata pelajaran
            System.out.print("Kategori: ");
            bahasa.setKategori(input.nextLine());

            // Input semester dengan validasi tipe data integer
            int semesterBahasa = 0;
            while (true) {
                System.out.print("Semester: ");
                try {
                    semesterBahasa = input.nextInt(); // Membaca input integer
                    input.nextLine(); // Konsumsi newline setelah nextInt
                    break; // Keluar dari loop jika input valid
                } catch (InputMismatchException e) {
                    // Jika input bukan angka, tampilkan pesan error dan ulang input
                    System.out.println("Input harus berupa angka! Silakan coba lagi.");
                    input.nextLine(); // Membersihkan buffer input yang salah
                }
            }
            bahasa.setSemester(semesterBahasa);

            // Meminta input jenis bahasa (contoh: Inggris, Jepang)
            System.out.print("Bahasa (Inggris/Jepang/etc): ");
            bahasa.setBahasa(input.nextLine());

            // Meminta input jam pelajaran
            System.out.print("Jam Pelajaran (contoh: 08:00 - 09:30): ");
            bahasa.setDataJam(input.nextLine());

            // Meminta input nama kelas
            System.out.print("Nama Kelas (contoh: X IPA 1): ");
            bahasa.setDataKelas(input.nextLine());

            // Meminta input tingkat kelas
            System.out.print("Tingkat Kelas (contoh: X, XI, XII): ");
            bahasa.setDataTingkat(input.nextLine());

            // Meminta input materi pelajaran
            System.out.print("Materi Pelajaran (contoh: Grammar & Reading): ");
            bahasa.setDataMateri(input.nextLine());


            // ================== INPUT MATA PELAJARAN PRAKTIKUM ==================
            System.out.println("\n=== Input Data Mata Pelajaran Praktikum ===");
            // Membuat objek MataPelajaranPraktikum
            MataPelajaranPraktikum praktikum = new MataPelajaranPraktikum();

            // Meminta input kode praktikum
            System.out.print("Kode: ");
            praktikum.setKode(input.nextLine());

            // Meminta input nama praktikum utama
            System.out.print("Nama: ");
            String namaPraktikum = input.nextLine();

            // Meminta input tambahan nama praktikum (opsional)
            System.out.print("Tambahan Nama (Opsional, tekan Enter jika tidak ada): ");
            String tambahanPraktikum = input.nextLine();

            // Jika ada tambahan nama, panggil setNama dengan dua parameter
            if (!tambahanPraktikum.isEmpty()) {
                praktikum.setNama(namaPraktikum, tambahanPraktikum);
            } else {
                // Jika tidak ada tambahan nama, panggil setNama dengan satu parameter
                praktikum.setNama(namaPraktikum);
            }

            // Meminta input nama guru pengajar praktikum
            System.out.print("Guru: ");
            praktikum.setGuru(input.nextLine());

            // Meminta input kategori praktikum
            System.out.print("Kategori: ");
            praktikum.setKategori(input.nextLine());

            // Input semester praktikum dengan validasi angka
            int semesterPraktikum = 0;
            while (true) {
                System.out.print("Semester: ");
                try {
                    semesterPraktikum = input.nextInt();
                    input.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Input harus berupa angka! Silakan coba lagi.");
                    input.nextLine();
                }
            }
            praktikum.setSemester(semesterPraktikum);

            // Input status praktikum (Wajib atau Opsional)
            System.out.print("Status Praktikum (Wajib/Opsional): ");
            praktikum.setDataStatus(input.nextLine());

            // Input kelas asal praktikum
            System.out.print("Kelas Asal: ");
            praktikum.setDataKelasAsal(input.nextLine());

            // Input durasi praktikum
            System.out.print("Durasi Praktikum: ");
            praktikum.setDataDurasi(input.nextLine());

            // Input jumlah asisten laboratorium dengan validasi angka
            int jumlahAslab = 0;
            while (true) {
                System.out.print("Jumlah Asisten Lab: ");
                try {
                    jumlahAslab = input.nextInt();
                    input.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Input harus berupa angka! Silakan coba lagi.");
                    input.nextLine();
                }
            }
            praktikum.setDataJumlahAslab(jumlahAslab);

            // Input nama kelas praktikum
            System.out.print("Nama Kelas Praktikum: ");
            praktikum.setDataKelas(input.nextLine());

            // Input status laporan praktikum (Ya/Tidak)
            System.out.print("Laporan Praktikum (Ya/Tidak): ");
            praktikum.setDataLaporan(input.nextLine());

            // Input alat yang digunakan dalam praktikum
            System.out.print("Alat Praktikum: ");
            praktikum.setDataAlat(input.nextLine());

            // Input modul praktikum
            System.out.print("Modul Praktikum: ");
            praktikum.setDataModul(input.nextLine());

            // ================== OUTPUT ==================
            // Menampilkan data mata pelajaran bahasa yang sudah diinput
            System.out.println("\n=== Data Mata Pelajaran Bahasa ===");
            System.out.println("Kode         : " + bahasa.cetakKode());
            System.out.println("Nama         : " + bahasa.cetakNama());
            System.out.println("Guru         : " + bahasa.cetakGuru());
            System.out.println("Kategori     : " + bahasa.cetakKategori());
            System.out.println("Semester     : " + bahasa.cetakSemester());
            System.out.println("Bahasa       : " + bahasa.cetakBahasa());
            System.out.println("Jam Pelajaran: " + bahasa.cetakJam());
            System.out.println("Nama Kelas   : " + bahasa.cetakKelas());
            System.out.println("Tingkat Kelas: " + bahasa.cetakTingkat());
            System.out.println("Materi       : " + bahasa.cetakMateri());

            // Menampilkan data mata pelajaran praktikum yang sudah diinput
            System.out.println("\n=== Data Mata Pelajaran Praktikum ===");
            System.out.println("Kode         : " + praktikum.cetakKode());
            System.out.println("Nama         : " + praktikum.cetakNama());
            System.out.println("Guru         : " + praktikum.cetakGuru());
            System.out.println("Kategori     : " + praktikum.cetakKategori());
            System.out.println("Semester     : " + praktikum.cetakSemester());
            System.out.println("Status       : " + praktikum.cetakStatus());
            System.out.println("Kelas Asal   : " + praktikum.cetakKelasAsal());
            System.out.println("Durasi       : " + praktikum.cetakDurasi());
            System.out.println("Jumlah Aslab : " + praktikum.cetakJumlahAslab());
            System.out.println("Kelas Praktik: " + praktikum.cetakKelas());
            System.out.println("Laporan      : " + praktikum.cetakLaporan());
            System.out.println("Alat         : " + praktikum.cetakAlat());
            System.out.println("Modul        : " + praktikum.cetakModul());

        } catch (Exception e) {
            // Menangkap exception umum yang mungkin terjadi dan menampilkan pesan error
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            // Menutup scanner untuk mencegah resource leak
            input.close();
        }
    }
}