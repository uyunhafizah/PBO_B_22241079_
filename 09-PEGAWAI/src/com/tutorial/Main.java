package com.tutorial;

class Pegawai {
    private String nama;
    private double gajiPokok;
    private double tunjangan;
    private double durasiLembur;
    private double gajiTidakTetap;
    private double gajiBersih;

    public Pegawai(String nama, double gajiPokok, double tunjangan, double durasiLembur, double gajiTidakTetap) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.durasiLembur = durasiLembur;
        this.gajiTidakTetap = gajiTidakTetap;
        hitungGajiBersih();
    }

    public double getGajiBersih() {
        return gajiBersih;
    }

    private void setGajiBersih(double gajiBersih) {
        this.gajiBersih = gajiBersih;
    }

    private void hitungGajiBersih() {
        setGajiBersih(gajiPokok + (tunjangan + durasiLembur) + gajiTidakTetap);
    }

    public static void main(String[] args) {
        double gajiPokok = 3500000;
        double gajiTidakTetap = 200000; // Gaji tidak tetap untuk contoh

        Pegawai pegawai1 = new Pegawai("canva", gajiPokok, 70, 8, gajiTidakTetap);

        System.out.println("Nama: " + pegawai1.nama);
        System.out.println("Gaji pokok: " + pegawai1.gajiPokok);
        System.out.println("Tunjangan: " + pegawai1.tunjangan);
        System.out.println("Durasi lembur: " + pegawai1.durasiLembur);
        System.out.println("Gaji Tidak Tetap: " + pegawai1.gajiTidakTetap);
        System.out.println("Gaji Bersih: " + pegawai1.getGajiBersih());
    }
}