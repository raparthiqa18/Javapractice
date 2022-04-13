package Practice.Collections;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Sortedcollections {
    public static void main(String[] args) {
    //Tree maps & Tree Sets are
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(12);
        treeSet.add(1);
        treeSet.add(13);
        treeSet.add(14);
        treeSet.add(5);
        System.out.println(treeSet);
        treeSet.clear();
        //converting array to Tree set to sort
        int[] arr={12,32,1,3,4,54};
        for (int i: arr){
            treeSet.add(i);
        }
        System.out.println(treeSet);
        treeSet.clear();
        System.out.println(treeSet.size());


        //converting arraylist to Tree set to sort
        ArrayList<Integer> lst=new ArrayList<>();
        lst.add(12);
        lst.add(3);
        lst.add(54);
        lst.add(165);
        lst.add(1);
        for (int i: lst){
            treeSet.add(i);
        }
        System.out.println(treeSet);
        System.out.println(treeSet.size());
    }
}
