/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package tugasBAB4;

    /**
     *
     * @author LENOVO
     */
    public class MataPelajaranBahasa extends MataPelajaran {
        protected String bahasa;
        protected String tingkatKesulitan;

        public MataPelajaranBahasa(String kode, String nama, String guru, String kategori, int semester, String bahasa, String tingkatKesulitan) {
            super(kode, nama, guru, kategori, semester);
            this.bahasa = bahasa;
            this.tingkatKesulitan = tingkatKesulitan;
        }

        public void setBahasa(String bahasa) {
            this.bahasa = bahasa;
        }

        public void setTingkatKesulitan(String tingkatKesulitan) {
            this.tingkatKesulitan = tingkatKesulitan;
        }

        public String getBahasa() {
            return this.bahasa;
        }

        public String getTingkatKesulitan() {
            return this.tingkatKesulitan;
        }

        @Override
        public void tampilkanInfo() {
            super.tampilkanInfo();
            System.out.println("Bahasa: " + getBahasa());
            System.out.println("Tingkat Kesulitan: " + getTingkatKesulitan());
        }
    }


