package com.pbo;

public class Main {

    public static void main(String[] args) {
	    Radio radio = new Radio(234);
        radio.setName("Radio AM");

        System.out.println("Nama barang antik : ".concat(radio.getName()));
	    radio.tampilUmur();
    }
}
