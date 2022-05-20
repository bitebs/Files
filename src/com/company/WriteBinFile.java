package com.company;

import java.io.*;

public class WriteBinFile {
    public static void main(String[] args) {
        String text = "Hello world";
        String fileName = "src/com/company/data/data.bin";
        byte[] buffer = text.getBytes();
        try(FileOutputStream fos = new FileOutputStream(fileName);
            DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeUTF(text);
            dos.writeDouble(3.14);
            dos.writeInt(10);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
