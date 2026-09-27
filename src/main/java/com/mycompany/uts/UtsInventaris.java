package com.mycompany.uts;

import view.TampilanInventaris;

public class UtsInventaris {

    public static void main(String[] args) {
        // Memanggil View untuk menampilkan menu inventaris lab
        TampilanInventaris view = new TampilanInventaris();
        view.tampilkanMenu();
    }
}