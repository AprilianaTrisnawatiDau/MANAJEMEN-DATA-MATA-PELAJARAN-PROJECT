/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBAB8;



public abstract class ManajemenMapel {
    protected String kode, nama, guru, kategori;
    protected int semester;

    // Overloading (Static Polymorphism)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama, String tambahan) {
        this.nama = nama + " - " + tambahan;
    }

    // Abstract methods (for dynamic polymorphism)
    abstract void setKode(String kode);
    abstract void setGuru(String guru);
    abstract void setKategori(String kategori);
    abstract void setSemester(int semester);

    abstract String cetakKode();
    abstract String cetakNama();
    abstract String cetakGuru();
    abstract String cetakKategori();
    abstract int cetakSemester();
}

