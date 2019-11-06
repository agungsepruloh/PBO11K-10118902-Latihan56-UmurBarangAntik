package com.pbo;

public class BarangAntik {

    private int umur;

    BarangAntik(int umur) {
        this.umur = umur;
    }

    public void tampilUmur() {
        System.out.println(String.format("Umur barang antik ini adalah : %d tahun", umur));
    }

}
