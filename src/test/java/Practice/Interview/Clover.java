package Practice.Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Clover {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Enter N");
        String str=bufferedReader.readLine();
        int N =Integer.parseInt(str.trim());
        for(int n=1; n<=N; n++){
            System.out.println("Enter String");
            str=bufferedReader.readLine();
            reverseorder(str);
//            String[] strarr=str.split(" ");
//            Collections.reverse(Arrays.asList(strarr));
//            for (int i=0; i<=strarr.length-1;i++){
//                System.out.println(strarr[i]);
//            }
        }
    }


    public static void reverseorder(String str){
        String[] strarr=str.split(" ");
        ArrayList<String> finalarr = new ArrayList<>();
        int j=0;
        finalarr.add(strarr[0]);
        if(strarr.length>1){
            for (int i=strarr.length-2; i>=1; i--){
                finalarr.add(strarr[i]);
            }
            finalarr.add(strarr[strarr.length-1]);
        }

        for(int i=0; i<=finalarr.size()-2; i++){
            System.out.print(finalarr.get(i) + " ");
        }
        System.out.print(finalarr.get(finalarr.size()-1));
//        for(String a: finalarr){
//            System.out.print(a + " ");
//        }
        System.out.println();
    }
}
