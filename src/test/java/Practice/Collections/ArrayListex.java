package Practice.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListex {
    public static void main(String[] args) {
        ArrayList<String> lst=new ArrayList<>();
        lst.add("Banana");
        lst.add("Orange");
        lst.add("Apple");
        lst.add("Apple");
        System.out.println(lst.size());
        lst.forEach(l-> System.out.println(l));
        System.out.println("******SOrted****");
        Collections.sort(lst);
        lst.forEach(l-> System.out.println(l));
        System.out.println("******Insert and Delete****");
        lst.add("Strawberry");
        lst.remove(1);
        System.out.println(lst.size());
        System.out.println(lst.get(1));
        lst.forEach(l-> System.out.println(l));
        System.out.println("Set new fruit");
        lst.set(2, "Kiwi");
        System.out.println(lst.size());
        lst.forEach(l-> System.out.println(l));
        System.out.println("******Other supported methods****");
        System.out.println(lst.get(0));
        lst.clear();
        System.out.println(lst.size());
        lst.add(null);
        lst.add("");
        System.out.println("at 1: " + lst.get(1) + "Test");
        lst.forEach(l-> System.out.println(l));
    }
}


//Can modify
//Can insert new element
//Allows null values
//Allows duplicates

/*Arraylist vs linkedlist
The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.
When To Use
Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
Linkedlist additional methods: addFirst(), addLast(), removeFirst(), 	getFirst(), getLast()

 */

