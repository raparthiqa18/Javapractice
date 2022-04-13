package Practice.DBSTest;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {


        // Array 6-7 elements second max

        int[] list= {11,22,32,34,44,54,3, 100};
//        int largestnumber=list[0];
//        for(int i=1; i<list.length; i++){
//            if(largestnumber<list[i]){
//                largestnumber=list[i];
//            }
//        }
//
//        System.out.println(largestnumber);
//
//        int secondlargetnumber=list[0];
//        for(int i=1; i<list.length; i++){
//            if (list[i]!=largestnumber){
//                if(secondlargetnumber<list[i]){
//                    secondlargetnumber=list[i];
//                }
//            }
//        }
//        System.out.println(secondlargetnumber);

        Arrays.sort(list);
        System.out.println("Second largest number: " + list[1]);

    }
}
