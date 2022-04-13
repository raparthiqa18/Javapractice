package Practice.JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<String> lst=new ArrayList<>();
        lst.add("apple");
        lst.add("mango");
        lst.add("strawberry");
        lst.add("orange");

        Collections.sort(lst);
        lst.forEach(n-> System.out.println(n));

        Collections.reverse(lst);
        lst.forEach(n-> System.out.println(n));




    }
}
