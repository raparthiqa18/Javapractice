package Pactice2.javaPracticeprograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=1234;
        int rev=0;


        for(int i=0; num>0;i++){
            rev=rev*10+num%10;
            num=num/10;

        }
        System.out.println(rev);
        rev=0;
        num=1234;

        //or
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;

        }
        System.out.println(rev);

        //using string buffer class
        num=1234;
        StringBuffer reverse;
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        reverse=sb.reverse();
        System.out.println(reverse);

        //StringBuilder

        StringBuilder sbl=new StringBuilder();
        sbl.append(reverse);
        System.out.println(sbl.reverse());

    }
}
