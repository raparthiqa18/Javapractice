package Pactice2.JavaPracticeprograms2;

public class Swappingnumbers {
    public static void main(String[] args) {
        int x=20;
        int y=130;

        //first method
        System.out.println("First method");
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println(" X " + x + " Y " +  y );

        //Second method
        System.out.println("Second method");
        x=x-y;//-10
        y=x+y;//10
        x=y-x;
        System.out.println(" X " + x + " Y " +  y );


    }
}
