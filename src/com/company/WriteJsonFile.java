package com.company;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJsonFile {
    public static void main(String[] args) {
        FileWriter fw = null;
        JSONArray persons = new JSONArray();
        JSONObject obj = new JSONObject();
        obj.put("persons",persons);

        JSONObject person1 = new JSONObject();
        person1.put("id",1);
        person1.put("name","John");
        JSONArray emails = new JSONArray();
        emails.put("john@mail.ru");
        emails.put("john@google.com");
        person1.put("emails",emails);
        persons.put(person1);

        JSONObject person2 = new JSONObject();
        person2.put("id",2);
        person2.put("name","Jan");
        JSONArray emails2 = new JSONArray();
        emails2.put("jan@mail.ru");
        emails2.put("jan@google.com");
        person2.put("emails",emails2);
        persons.put(person2);

        String fileName = "src/com/company/data/data.json";

        try {
            fw = new FileWriter(fileName);
            fw.write(obj.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
