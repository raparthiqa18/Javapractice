package Practice.Collections;

import java.util.*;

public class MapsExercise {
    public static void main(String[] args) {
        Map<String, String> capitalCities=new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Testnullvalue", null);
        capitalCities.put("Testnullvalue2", null);
        capitalCities.put("Testemptyvalue", "");
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());
        System.out.println(capitalCities.get("Engld"));//Returns null if the key is not found
        for(String key: capitalCities.keySet()){
            System.out.println("Key: " + key + ";\n" + "Value: " + capitalCities.get(key));
        }
        System.out.println("Keys " + capitalCities.keySet());
        System.out.println("Values " + capitalCities.values());

        //Ordering
        Map<String, String> hm = new LinkedHashMap<>();

        hm.put("USA", "Washington");
        hm.put("United Kingdom", "London");
        hm.put("India", "New Delhi");

        System.out.println("LinkedHashMap : " + hm);//Returns in inserted order

        hm = new TreeMap<>(hm);
        System.out.println("TreeMap : " + hm);//Returns in ascending order
//        Iterator<Map.Entry<String, String>> it=hm.entrySet().iterator();

        hm = new HashMap<>(hm);
        System.out.println("HashMap : " + hm);//Returns randomly
    }

}
//Allows null values
//Allows duplicates but overrides existing
/*
HashMap: It does not maintain ordering
It may have one null key and multiple null values.
Contains only unique elements.

LinkedHashMap: Keys are ordered by their insertion order.
It contains only unique elements.
It may have one null key and multiple null values.
It is same as HashMap instead maintains insertion order.

TreeMap: Keys are ordered in ascending order
It contains only unique elements.
It cannot have null key but can have multiple null values.
It is same as HashMap instead maintains ascending order(Sorted using the natural order of its key).

HashTable:
A Hashtable is an array of list. Each list is known as a bucket. The position of bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
It contains only unique elements.
It may not have any null key or value.
It is synchronized.
It is a legacy class.
 */
