package Practice.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetexercise {
    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("BMW");//Every item in a set is unique
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("");
        cars.add(null);
       // cars.add(null); only unique values are allowed, hashset will override duplicates
        System.out.println(cars);

        System.out.println(cars.contains("Mazda"));
        System.out.println("***** To print all ****");
        System.out.println(cars.size());
        for (String s : cars) {
            System.out.println(s);
        }
        System.out.println("*** To print a particular element ****");
        //Use Iterator
        Iterator<String> it= cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}

/* A HashSet is a collection of items where every item is unique
One null key is allowed

HashMap
It allows one null for key and multiple null for values
It does not maintain any order among its objects.
It uses put method to insert a new element.
It is not Thread-Safe because it is not Synchronized but it gives better performance.

Hashtable
It does not allow null for key as well as for value.
It does not maintain any order among its objects.
It uses put method to insert a new element.
It is Thread-Safe because it is Synchronized and can be used by multiple threads

HashSet
It can have a single null value
It does not maintain any order among its objects.
It uses add method to insert a new element.
Like HashMap, it is not Thread-Safe because it is not Synchronized.
*/