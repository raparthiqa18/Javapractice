package Practice.JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Stringfuncs {
    public static void main(String[] args) {
//How to find the maximum occurring character in a given String?
//Read more: https://www.java67.com/2018/04/21-string-programming-and-coding-interview-questions-answers.html#ixzz7MM8teKg1
    String str="dhdbhfdjbfbjefbjwf";
    int count=0;
    for(int i=0; i<str.length(); i++){
        if(str.charAt(i)=='d'){
            count++;
        }
    }
        System.out.println(count);

    //Using charArray
    count =0;
    for(char c:str.toCharArray()){
        if(c=='d'){
            count++;
        }
    }
        System.out.println(count);

        //Remove duplicates from a given string using collection object
        //Note: linkedHashset does not allow duplicates and maintains insertion order
        String[] arr=str.split("");
        List<String> arrlst= new ArrayList<>();
        for(String a: arr){
            arrlst.add(a);
        }
        System.out.println(arrlst.size());
        LinkedHashSet<String> ls=new LinkedHashSet<>();
        for(String s:arrlst){
            ls.add(s);
        }
        System.out.println(ls.size());
        System.out.println(ls);

        //Remove duplicates from a given string without using collection object

        // Used as index in the modified string
            int index = 0;
            char[] str1=str.toCharArray();

            // Traverse through all characters
            for (int i = 0; i < str1.length; i++){
                // Check if str[i] is present before it
                int j;
                for (j = 0; j < i; j++)
                {
                    if (str1[i] == str1[j])
                    {
                        break;
                    }
                }

                // If not present, then add it to
                // result.
                if (j == i)
                {
                    str1[index++] = str1[i];
                }
            }
        System.out.println(String.valueOf(Arrays.copyOf(str1, index)));;








    }
}
