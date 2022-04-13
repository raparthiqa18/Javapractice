package Pactice2.javaPracticeprograms;

public class Fibonacciseries {
    public static void main(String[] args) {
        //123581321345589144
        int n=10;
        int f=0;
        int n1=0, n2=1;
        for(int i=0; i<=n; i++){
            f=n2+n1;
            System.out.println(f);
            n1=n2;
            n2=f;

         }

    }
}
