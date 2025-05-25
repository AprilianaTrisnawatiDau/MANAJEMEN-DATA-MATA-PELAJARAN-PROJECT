/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TUGASBAB9;
public interface OperasiDasarMapel {
    void setKode(String kode);
    void setNama(String nama);
    void setGuru(String guru);
    void setKategori(String kategori);
    void setSemester(int semester);

    String cetakKode();
    String cetakNama();
    String cetakGuru();
    String cetakKategori();
    int cetakSemester(); 
}
