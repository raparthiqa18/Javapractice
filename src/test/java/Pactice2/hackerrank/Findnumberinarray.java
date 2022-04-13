package Pactice2.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Findnumberinarray {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(12);
        arr.add(13);
        arr.add(33);
        arr.add(433);
        arr.add(14);
        arr.add(1355);
        System.out.println(findNumber(arr, 3));


    }

    public static String findNumber(List<Integer> arr, int k) {
        // Write your code here
        for(int i=0; i<arr.size();i++){
            if(arr.get(i) == k){
                return "YES";
            }
        }
        return "NO";
    }
}
