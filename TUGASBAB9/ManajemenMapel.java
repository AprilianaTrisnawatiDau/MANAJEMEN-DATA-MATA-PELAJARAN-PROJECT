/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASBAB9;
public abstract class ManajemenMapel implements OperasiDasarMapel {
    protected String kode, nama, guru, kategori;
    protected int semester;

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama, String tambahan) {
        this.nama = nama + " - " + tambahan;
    }
}