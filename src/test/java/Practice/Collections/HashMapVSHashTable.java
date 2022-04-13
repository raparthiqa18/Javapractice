package Practice.Collections;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapVSHashTable {
    public static void main(String[] args) {
        HashMap<String, String> hashMap=new HashMap<>();
        hashMap.put("Maharashtra", "Mumbai");
        hashMap.put("Telangana", "Hyderabad");
        hashMap.put("Gujarat", "Ahmedabad");
        System.out.println(hashMap.size());
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.keySet());
        //System.out.println(hashMap.get("Maharashtra"));
        for (String k: hashMap.keySet()){
            System.out.println(k + "  " + hashMap.get(k)  + "   " );
        }
        //Null Key
        hashMap.put(null, "TestNull");
        hashMap.put(null, "TestNull2");//Only one null key is allowed, overrides existing entry set
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.size());
        //Null Values [Multiple null values are allowed
        hashMap.put("TestNullvalue1", null);
        hashMap.put("TestNullvalue2", null);
        hashMap.put("TestNullvalue3", null);
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.size());
        System.out.println(hashMap.containsValue("Hyderabad"));
        System.out.println("********* HASH Tables *********");

        Hashtable<String, String> hashtable=new Hashtable<>();
        hashtable.put("Maharashtra", "Mumbai");
        hashtable.put("Telangana", "Hyderabad");
        hashtable.put("Gujarat", "Ahmedabad");
        System.out.println(hashtable.size());
        System.out.println(hashtable.entrySet());
        System.out.println(hashtable.values());
        System.out.println(hashtable.keySet());
        //System.out.println(hashtable.get("Maharashtra"));
        for (String k: hashtable.keySet()){
            System.out.println(k + "  " + hashtable.get(k)  + "   " );
        }
        //Null Key
//        hashtable.put(null, "TestNull");//Null keys are not allowed in HashTable

        //Null Values
        //hashtable.put("TestNullvalue1", null);//Null values are not allowed in HashTable

    }
}
/*
https://www.geeksforgeeks.org/differences-between-hashmap-and-hashtable-in-java/#:~:text=Hashmap%20vs%20Hashtable&text=It%20is%20thread%2Dsafe%20and,thread%20synchronization%20is%20not%20needed.
HashMap and Hashtable store key and value pairs in a hash table. When using a Hashtable or HashMap, we specify an object that is used as a key and the value that you want to be linked to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
HashMap is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
HashMap is generally preferred over HashTable if thread synchronization is not needed.
HashMap & HashTables allow only unique keys, however, they override duplicates with existing keys
HashMap & HashTables allow duplicate values (Not keys)
 */

