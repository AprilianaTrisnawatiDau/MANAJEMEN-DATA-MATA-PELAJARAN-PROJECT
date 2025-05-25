/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASBAB6;
public abstract class ManajemenMapel {
    protected String dataKode, dataNama, dataGuru, dataKategori;
    protected int dataSemester;

    // method abstract SETTER
    abstract void setKode(String kode);
    abstract void setNama(String nama);
    abstract void setGuru(String guru);
    abstract void setKategori(String kategori);
    abstract void setSemester(int semester);

    // method abstract GETTER
    abstract String cetakKode();
    abstract String cetakNama();
    abstract String cetakGuru();
    abstract String cetakKategori();
    abstract int cetakSemester();
}

