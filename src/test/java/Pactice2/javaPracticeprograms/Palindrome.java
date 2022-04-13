package Pactice2.javaPracticeprograms;

public class Palindrome {
    public static void main(String[] args) {
        String str="tenet";
        String reverse="";
        for (int i=str.length()-1; i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
        if (reverse.equalsIgnoreCase(str)){
            System.out.println("Palindrome");
        }
        System.out.println(str.length()/2);
        System.out.println(str.substring(0, str.length()%2));

    }
}
