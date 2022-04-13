package Pactice2.javapractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapP {
    public static void main(String[] args) {
        Map<String, String> capitalCities=new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());
        System.out.println(capitalCities.get("England"));
        System.out.println("***************");
        for (String key:capitalCities.keySet()) {
            System.out.println("key: " + key + "; value: " + capitalCities.get(key));
        }
        System.out.println("***************");
        for (String value:capitalCities.values()) {
            System.out.println(value);
        }
        //Remove an item
        System.out.println("Before removing: " + capitalCities.size());
        capitalCities.remove("England");
        System.out.println("After removing: " + capitalCities.size());
        //clear all items
        System.out.println("Before clearing: " + capitalCities.size());
        capitalCities.clear();
        System.out.println("After clearing: " + capitalCities.size());


    }
}
