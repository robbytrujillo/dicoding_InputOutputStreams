package com.dicoding.javafundamental.inputoutput;

import java.io.File;
public class Main1 {

    public static void main(String[] args) {
        String dirname = "/java/latihan1";

        // file navigation
        //File file = new File(dirname);

        File file = null;
        String[] paths;

        try {
            // Instalasi objek File
            file = new File(dirname);

            // Ambil list files dan masukkan ke string pats
            paths = file.list();

            // Tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }
        }
        // Buat directory
        file.mkdirs();
    }
}
