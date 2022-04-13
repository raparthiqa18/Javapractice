package Pactice2.javapractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetP {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Alto");
        cars.add("Audi");
        cars.add("Merc");
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.contains("BMW"));
        System.out.println("****************");
        for(String i: cars){
            System.out.println(i);
        }
        System.out.println("****************");

        System.out.println("*******Using Iterator*********");
        Iterator<String> it = cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        it= cars.iterator();
        System.out.println("Test " + it.hasNext());
        System.out.println("*******Using Iterator*********");
        //remove an item
        System.out.println("*************Remove***********");
        System.out.println(cars.size());
        cars.remove("BMW");
        System.out.println(cars.size());
        //clear
        System.out.println("*************Clear***********");
        System.out.println(cars.size());
        cars.clear();
        System.out.println(cars.size());



    }
}
