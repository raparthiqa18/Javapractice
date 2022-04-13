package Practice.JavaPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class FindingDuplicateOccurences {
    public static void main(String[] args) {
        String str = "I am am learning java java";
        String[] strArr = str.split(" ");
        //Linked hashmap maintains the ordering
        HashMap<String, Integer> hashMap = new LinkedHashMap<String, Integer>();
        for(String temp : strArr){
            if(hashMap.get(temp)!=null){
                hashMap.put(temp, 2);
                continue;
            }
            hashMap.put(temp, 1);
        }
        System.out.println(hashMap);

        Iterator<String> iterator = hashMap.keySet().iterator();
        Integer temp=null;
        String key = null;
        while(iterator.hasNext()){
            key =iterator.next();
            temp=hashMap.get(key);
            if(temp>1){
                System.out.println(String.format("Duplicate word: %s", key));
            }
        }
    }
}
