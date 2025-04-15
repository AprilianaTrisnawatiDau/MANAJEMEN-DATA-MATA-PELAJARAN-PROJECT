/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasBAB4;

/**
 *
 * @author LENOVO
 */
public class MataPelajaranPraktikum extends MataPelajaran {
    protected String laboratorium;
    protected int jumlahAsisten;

    public MataPelajaranPraktikum(String kode, String nama, String guru, String kategori, int semester, String laboratorium, int jumlahAsisten) {
        super(kode, nama, guru, kategori, semester);
        this.laboratorium = laboratorium;
        this.jumlahAsisten = jumlahAsisten;
    }

    public void setLaboratorium(String laboratorium) {
        this.laboratorium = laboratorium;
    }

    public void setJumlahAsisten(int jumlahAsisten) {
        this.jumlahAsisten = jumlahAsisten;
    }

    public String getLaboratorium() {
        return this.laboratorium;
    }

    public int getJumlahAsisten() {
        return this.jumlahAsisten;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Laboratorium: " + getLaboratorium());
        System.out.println("Jumlah Asisten: " + getJumlahAsisten());
    }
}