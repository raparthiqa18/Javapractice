package Pactice2.javaPracticeprograms;

public class Biggestnumberamong3 {
    public static void main(String[] args) {
        int x=110;
        int y=65;
        int z=38;

        //Using Ternary operator
        //ans = (conditional expression) ? execute if true : execute if false

        int a=z > (x>y? x:y) ? z: (y>x?y:x);
        System.out.println(a);

        System.out.println(comparenumbers(x,y, z));

    }


    static int comparenumbers(int x, int y, int z){
        // Comparing all 3 numbers
        if (x >= y && x >= z)

            // Returning 1st number if largest
            return x;

            // Comparing 2nd no with 1st and 3rd no
        else if (y >= x && y >= z)

            // Return z if the above conditions are false
            return y;

        else

            // Returning 3rd no, Its sure it is greatest
            return z;
    }
}
