package com.dicoding.javafundamental.inputoutput;

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
//        FileInputStream in = null;
//        FileOutputStream out = null;
        FileReader in1 = null;
        FileWriter out1 = null;


        try {
//            in = new FileInputStream("latihan_input.txt");
//            out = new FileOutputStream("latihan_output.txt");
            in1 = new FileReader("latihan_input.txt");
            out1 = new FileWriter("latihan_output.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }

            catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (in != null) {
                        in.close();
                    }
                    if (out != null) {
                        out.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
