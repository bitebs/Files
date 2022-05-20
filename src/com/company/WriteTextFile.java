package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public static void main(String[] args) {
        String fileName = "src/com/company/data/data.txt";
        FileWriter fw = null;

        try {
            fw = new FileWriter(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s = "Строка";
        char i = 1;

        try {
            fw.append(s);
            fw.append(i);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
