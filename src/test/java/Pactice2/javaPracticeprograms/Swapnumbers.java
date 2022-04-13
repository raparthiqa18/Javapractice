package Pactice2.javaPracticeprograms;

public class Swapnumbers {
    public static void main(String[] args) {

        int x=10;
        int y=200;

        //Option 1: temp variable
        int temp=x;
        x=y;
        y=temp;
        System.out.println(x);
        System.out.println(y);

        //Option 2: Simple math
           x=x-y;
           y=x+y;
           x=y-x;
        System.out.println(x);
        System.out.println(y);

        //Option 3: Using operator
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println(x);
        System.out.println(y);



    }
}
