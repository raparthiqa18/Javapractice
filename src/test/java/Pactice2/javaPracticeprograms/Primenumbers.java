package Pactice2.javaPracticeprograms;

public class Primenumbers {
    public static void main(String[] args) {
        //2 3 5 7 11 13 17 19 23 29 prime numbers
        int y=30;
        boolean flag=false;
        for(int i=0; i<=y; i++){
            if (i==0 | i==1){
                System.out.println(i + " Not a prime number");
            }else {
               flag = false;
                for (int j = 2; j <= i/2; ++j) {
                    // condition for nonprime number
                    if (i % j == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag){
                    System.out.println(i);
                }
                }
            }
        }
 }
