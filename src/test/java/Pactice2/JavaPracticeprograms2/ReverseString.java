package Pactice2.JavaPracticeprograms2;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Rakesh";

        System.out.println(reverse(str));

        StringBuffer stb = new StringBuffer(str);
        System.out.println(stb.reverse());
        System.out.println(stb.reverse().equals(str));

        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

        System.out.println(reverseString(str));

    }

    public static String reverse(String str) {
        String reversestr = "";
        for (int i = str.length() - 1; i > -1; i--) {
            reversestr = reversestr + str.charAt(i);
        }
        return reversestr;
    }


    //recursive function to reverse a string
       public static String reverseString(String str) {
//checks if the string is empty
        if (str.isEmpty()) {
            System.out.println("String is empty.");
//if the above condition is true returns the same string
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }

    }
}