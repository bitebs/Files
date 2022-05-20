package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadBinFile {
    public static void main(String[] args) {
        String fileName = "src/com/company/data/data.bin";
        try(FileInputStream fis = new FileInputStream(fileName);
            DataInputStream dis = new DataInputStream(fis)) {
            String text = dis.readUTF();
            double v = dis.readDouble();
            int i = dis.readInt();
            System.out.printf("text: %s, double: %f, int: %d%n", text,v,i);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
