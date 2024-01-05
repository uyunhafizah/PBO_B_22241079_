package com.tutorial;

class Pegawai {
    private String nama;
    private double gajiPokok;
    private double tunjangan;
    private double durasiLembur;
    private double gajiBersih;

    // Konstruktor
    public Pegawai(String nama, double gajiPokok, double tunjangan, double durasiLembur) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.durasiLembur = durasiLembur;
        hitungGajiBersih();
    }

    // Setter untuk tunjangan (opsional)
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
        hitungGajiBersih();
    }

    // Setter untuk durasi lembur (opsional)
    public void setDurasiLembur(double durasiLembur) {
        this.durasiLembur = durasiLembur;
        hitungGajiBersih();
    }

    // Fungsi untuk menghitung gaji bersih
    private void hitungGajiBersih() {
        double lembur = durasiLembur * (0.05 * gajiPokok);
        gajiBersih = gajiPokok + tunjangan + lembur;
    }

    // Fungsi untuk menampilkan informasi pegawai
    public void tampilInfo() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Durasi Lembur: " + durasiLembur);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }

    public static void main(String[] args) {
        // Membuat objek pegawai tetap
        Pegawai pegawaiTetap = new Pegawai("UYUN HAFIZAH", 5000000, 0.7 * 5000000, 2);

        // Membuat objek pegawai tidak tetap
        Pegawai pegawaiTidakTetap = new Pegawai("PARAS", 3000000, 0, 3);

        // Menampilkan informasi pegawai
        System.out.println("====Informasi Pegawai Tetap:====");
        pegawaiTetap.tampilInfo();
        System.out.println("====Informasi Pegawai Tidak Tetap:====");
        pegawaiTidakTetap.tampilInfo();
    }
}