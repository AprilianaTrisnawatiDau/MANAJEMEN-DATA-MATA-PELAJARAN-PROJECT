/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBAB8;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // ================== INPUT MATA PELAJARAN BAHASA ==================
            System.out.println("=== Input Data Mata Pelajaran Bahasa ===");
            MataPelajaranBahasa bahasa = new MataPelajaranBahasa();

            System.out.print("Kode: ");
            bahasa.setKode(input.nextLine());

            System.out.print("Nama: ");
            String namaBahasa = input.nextLine();

            System.out.print("Tambahan Nama (Opsional, tekan Enter jika tidak ada): ");
            String tambahanBahasa = input.nextLine();
            if (!tambahanBahasa.isEmpty()) {
                bahasa.setNama(namaBahasa, tambahanBahasa);
            } else {
                bahasa.setNama(namaBahasa);
            }

            System.out.print("Guru: ");
            bahasa.setGuru(input.nextLine());

            System.out.print("Kategori: ");
            bahasa.setKategori(input.nextLine());

            int semesterBahasa = 0;
            while (true) {
                System.out.print("Semester: ");
                try {
                    semesterBahasa = input.nextInt();
                    input.nextLine(); // konsumsi newline
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Input harus berupa angka! Silakan coba lagi.");
                    input.nextLine(); // clear input buffer
                }
            }
            bahasa.setSemester(semesterBahasa);

            System.out.print("Bahasa (Inggris/Jepang/etc): ");
            bahasa.setBahasa(input.nextLine());

            // ================== INPUT MATA PELAJARAN PRAKTIKUM ==================
            System.out.println("\n=== Input Data Mata Pelajaran Praktikum ===");
            MataPelajaranPraktikum praktikum = new MataPelajaranPraktikum();

            System.out.print("Kode: ");
            praktikum.setKode(input.nextLine());

            System.out.print("Nama: ");
            String namaPraktikum = input.nextLine();

            System.out.print("Tambahan Nama (Opsional, tekan Enter jika tidak ada): ");
            String tambahanPraktikum = input.nextLine();
            if (!tambahanPraktikum.isEmpty()) {
                praktikum.setNama(namaPraktikum, tambahanPraktikum);
            } else {
                praktikum.setNama(namaPraktikum);
            }

            System.out.print("Guru: ");
            praktikum.setGuru(input.nextLine());

            System.out.print("Kategori: ");
            praktikum.setKategori(input.nextLine());

            int semesterPraktikum = 0;
            while (true) {
                System.out.print("Semester: ");
                try {
                    semesterPraktikum = input.nextInt();
                    input.nextLine(); // konsumsi newline
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Input harus berupa angka! Silakan coba lagi.");
                    input.nextLine();
                }
            }
            praktikum.setSemester(semesterPraktikum);

            System.out.print("Status Praktikum (Wajib/Opsional): ");
            praktikum.setDataStatus(input.nextLine());

            System.out.print("Kelas Asal: ");
            praktikum.setDataKelasAsal(input.nextLine());

            System.out.print("Durasi Praktikum: ");
            praktikum.setDataDurasi(input.nextLine());

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

            System.out.print("Nama Kelas Praktikum: ");
            praktikum.setDataKelas(input.nextLine());

            System.out.print("Laporan Praktikum (Ya/Tidak): ");
            praktikum.setDataLaporan(input.nextLine());

            System.out.print("Alat Praktikum: ");
            praktikum.setDataAlat(input.nextLine());

            System.out.print("Modul Praktikum: ");
            praktikum.setDataModul(input.nextLine());

            // ================== OUTPUT ==================
            System.out.println("\n=== Data Mata Pelajaran Bahasa ===");
            System.out.println("Kode     : " + bahasa.cetakKode());
            System.out.println("Nama     : " + bahasa.cetakNama());
            System.out.println("Guru     : " + bahasa.cetakGuru());
            System.out.println("Kategori : " + bahasa.cetakKategori());
            System.out.println("Semester : " + bahasa.cetakSemester());
            System.out.println("Bahasa   : " + bahasa.cetakBahasa());

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
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
