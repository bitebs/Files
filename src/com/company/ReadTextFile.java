package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        String fileName = "src/com/company/data/data.txt";
        StringBuilder sb = new StringBuilder();
        try(FileReader fr = new FileReader(fileName)) {
            System.out.println(fr.getEncoding());
            int i;
            while((i=fr.read())!=-1)
                sb.append((char)i);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb);
    }
}
