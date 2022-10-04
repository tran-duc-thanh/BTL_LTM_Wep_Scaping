/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Duc Thanh
 */
public class Test {
    public static void main(String[] args) {
        
        List<Map<String,String>> list = new ArrayList<>();
        
        Map<String, String> a = new HashMap<>();
        a.put("key1", "value1");
        a.put("key2", "value2");
        a.put("key3", "value1");
        a.put("key4", "value1");
        a.put("key5", "value1");
        
        Map<String, String> b = new HashMap<>();
        b.put("key1", "value1");
        b.put("key2", "value2");
        b.put("key3", "value1");
        b.put("key4", "value1");
        b.put("key5", "value1");
        
        Map<String, String> c = new HashMap<>();
        c.put("key1", "value1");
        c.put("key2", "value2");
        c.put("key3", "value1");
        c.put("key4", "value1");
        c.put("key5", "value1");
        
        list.add(a);
        list.add(b);
        list.add(c);
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
    }
}
