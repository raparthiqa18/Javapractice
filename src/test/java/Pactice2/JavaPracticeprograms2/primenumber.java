package Pactice2.JavaPracticeprograms2;

public class primenumber {
    public static void main(String[] args) {

        //Prime number: if not divisible by any other number (Remainder not equal to 0)
        //We need not validate by dividing by all numbers, just 1/2 of the number should be ok
        //

        int x=0;
        System.out.println(x++);
        System.out.println(++x);

        for (int i=2; i<=30; i++){
            if (isPrimNum(i)) {
                System.out.println(i);
            };
        }
    }

    public static boolean isPrimNum(int i){
        for(int j=2; j<=i/2; j++){
            if (i%j==0){
                return false;

            }
        }
        return true;
    }
}
