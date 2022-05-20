package com.company;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadJsonFile {
    public static void main(String[] args) {
        String fileName = "src/com/company/data/data.json";
        try {
            FileReader fr = new FileReader(fileName);
            JSONTokener tokener = new JSONTokener(fr);
            JSONObject obj = new JSONObject(tokener);

            //System.out.println(obj.toString());
            JSONArray persons = obj.getJSONArray("persons");
            for(int i = 0; i< persons.length(); i++){
                JSONObject person = persons.getJSONObject(i);
                int id = person.getInt("id");
                String name = person.getString("name");
                System.out.println(id+" "+name);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
