package Pactice2.javapractice;

public class StringBufferP {
    public static void main(String[] args) {
        String str="PAWANKUMAR";
        StringBuffer stb=new StringBuffer(str);
        System.out.println(stb.reverse());

        StringBuilder stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

    }
}
