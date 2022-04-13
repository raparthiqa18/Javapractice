package Practice.Collections;

import java.util.Arrays;

public class Arrayex {
    public static String str1="test";
    public String str2="test2";

    public static void main(String[] args) {
        String[] str1={"Apple", "Orange", "Banana", null, ""};
        System.out.println(str1.length);
//        System.out.println(str1[1]);
        for (String s: str1) {
            System.out.println(s);
        }
        System.out.println("Sorted*********");
        Arrays.sort(str1);
        for (String s: str1) {
            System.out.println(s);
        }
    }

    public static void test(){

    }
    public static void test2(){

    }

}


//Cannot modify
//Cannot insert new element
//Allows null values
//Allows duplicates
