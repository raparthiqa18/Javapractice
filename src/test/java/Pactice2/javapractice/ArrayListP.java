package Pactice2.javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListP {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println(fruits.size());
        for (String i: fruits){
            System.out.println(i);
        }
        System.out.println("Third fruit: ".concat(fruits.get(2)));

        //Sort Array list
        Collections.sort(fruits);
        System.out.println("Ascending order");
        for (String i: fruits){
            System.out.println(i);
        }
        // Reverse string arraylist
        System.out.println("Descending order");
        Collections.reverse(fruits);
        for (String i: fruits){
            System.out.println(i);
        }

        //Modify arraylist elements
        fruits.set(2, "Papaya");
        for (String i: fruits){
            System.out.println(i);
        }
        System.out.println("Remove an item");
        fruits.remove(2);
        for (String i: fruits){
            System.out.println(i);
        }
        System.out.println("Clear arraylist");
        fruits.clear();
        System.out.println(fruits.size());

        //Integers
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(12);
        marks.add(43);
        marks.add(8);
        marks.add(55);

        System.out.println(marks.size());
        for (int i: marks){
            System.out.println(i);
        }
        System.out.println("Third marks: " + marks.get(2));
        System.out.println("*************Using Iterators**************");
        //Using iterators
        Iterator<Integer> it = marks.iterator();
        System.out.println(it.hasNext());
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("*************Using lambda**************");
        marks.forEach((n) -> System.out.println(n));

        //Sort Array list
        Collections.sort(fruits);
        System.out.println("Ascending order");
        for (String i: fruits){
            System.out.println(i);
        }
        // Reverse string arraylist
        System.out.println("Descending order");
        Collections.reverse(fruits);
        for (String i: fruits){
            System.out.println(i);
        }

        //Modify arraylist elements
        fruits.set(2, "Papaya");
        for (String i: fruits){
            System.out.println(i);
        }
        System.out.println("Remove an item");
        fruits.remove(2);
        for (String i: fruits){
            System.out.println(i);
        }
        System.out.println("Clear arraylist");
        fruits.clear();
        System.out.println(fruits.size());


    }
}
