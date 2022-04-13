package Pactice2.javaPracticeprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {

    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher("visit W3SCHOOLS");

        boolean match=matcher.find();
        System.out.println(match);


    }


}
