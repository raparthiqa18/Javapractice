package Pactice2.javapractice;

import java.util.Arrays;
import java.util.Collections;

public class Arrays1 {
    public static void main(String[] args) {
        //Strings
        String[] fruit={"Orange", "Mango", "Apple"};
        System.out.println(fruit.length);
        for(String i: fruit){
            System.out.println(i);
        }
        fruit[2]="Grapes";
        System.out.println(fruit.length);

        //Sort String array
        Arrays.sort(fruit);
        for(String i: fruit){
            System.out.println(i);
        }

        Arrays.sort(fruit, Collections.reverseOrder());
        for(String i: fruit){
            System.out.println(i);
        }
        //Integers
        int[] marks={52,13,1,34,12};
        System.out.println(marks.length);
        for(int i: marks){
            System.out.println(i);
        }
        System.out.println("***********");
        //Sort integer array
        marks[2]=15;
        Arrays.sort(marks);

        System.out.println(marks.length);

        for(int i: marks){
            System.out.println(i);
        }
        System.out.println("***********");

    }
}
