package Pactice2.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class oddnumberlist {
    public static void main(String[] args) {
        List<Integer> result = oddNumbers(1, 20);

        for (int i:result ) {
            System.out.println(i);

        }
    }

    public static List<Integer> oddNumbers(int l, int k) {
        // Write your code here

        List<Integer> arr=new ArrayList<Integer>();
        for(int i=l; i<=k; i++ ){
            if (i%2!=0){
                arr.add(i);
            }
        }


        return arr;

    }
}
